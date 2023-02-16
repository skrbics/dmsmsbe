package tech.solres.dms.dmsmsbe.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.Meta;

import java.util.List;

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
    @OneToOne
    @JoinColumn(name="id_metadata")
    private Metadata metadata;
    @OneToMany(mappedBy="document")
    private List<Attachment> attachmentList;
    @ManyToOne
    @JoinColumn(name = "id_document_workflow")
    private DocumentWorkflow documentWorkflow;
}
