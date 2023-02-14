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

public class Document {
    @Id
    @GeneratedValue
    private Integer id_document;
    @Column(nullable = false)
    private String title;
    @ManyToOne
    @JoinColumn(name = "id_folder")
    private Folder folder;
}
