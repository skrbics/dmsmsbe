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
public class Phone {
    @Id
    @GeneratedValue
    private Integer id_phone;
    private String number;
    private String tag;
    @ManyToOne
    @JoinColumn(name="id_business_partner")
    private BusinessPartner businessPartner;

}
