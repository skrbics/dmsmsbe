package tech.solres.dms.dmsmsbe.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Address {
    @Id
    @GeneratedValue
    private Integer id_address;
    private String street;
    private String number;
    @ManyToOne
    @JoinColumn(name="id_city")
    private City city;
    @OneToOne
    @JoinColumn(name="id_business_partner")
    private BusinessPartner businessPartner;
}
