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
public class Folder {
    @Id
    @GeneratedValue
    private Integer id_folder;
    @Column(nullable = false)
    private String title;
    @OneToMany(mappedBy = "folder")
    private List<Document> documentList;
}
