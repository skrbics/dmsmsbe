package tech.solres.dms.dmsmsbe.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BusinessPartner {
    @Id
    @GeneratedValue
    private Integer id_business_partner;
    private String title;
    private String email;
    @OneToOne
    @JoinColumn(name="id_address")
    private Address address;
    @OneToMany(mappedBy = "businessPartner")
    private List<Phone> phoneList;
}
