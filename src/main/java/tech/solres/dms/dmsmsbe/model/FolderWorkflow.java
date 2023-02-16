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
public class FolderWorkflow {
    @Id
    @GeneratedValue
    private Integer id_folder_workflow;
    private String title;
    private Boolean businessPartnerMandatory;
    private Boolean autoFillDocTitle;
    @ManyToOne
    @JoinColumn(name="id_organization_unit")
    private OrganizationUnit predefinedOrganizationUnit;
    @ManyToOne
    @JoinColumn(name="id_classification_unit")
    private ClassificationUnit predefinedClassificationUnit;

    @OneToMany(mappedBy = "folderWorkflow")
    private List<Folder> folderList;
    @ManyToOne
    @JoinColumn(name="id_document_counter")
    private DocumentCounter documentCounter;
}
