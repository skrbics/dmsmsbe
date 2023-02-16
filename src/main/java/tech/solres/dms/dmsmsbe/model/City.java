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
public class City {
    @Id
    @GeneratedValue
    private Integer id_city;
    private String name;
    private String zip;
    @ManyToOne
    @JoinColumn(name="id_country")
    private Country country;
    @OneToMany(mappedBy = "city")
    private List<Address> addressList;
}
