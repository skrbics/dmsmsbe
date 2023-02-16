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
public class Metadata {
    @Id
    @GeneratedValue
    private Integer id_meta_data;
    @OneToOne
    @JoinColumn(name="id_document")
    private Document document;
}
