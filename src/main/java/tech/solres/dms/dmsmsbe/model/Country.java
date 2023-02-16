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
public class Country {
    @Id
    @GeneratedValue
    private Integer id_country;
    private String name;
    @OneToMany(mappedBy = "country")
    private List<City> cityList;
}
