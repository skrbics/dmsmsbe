package tech.solres.dms.dmsmsbe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class DocumentWorkflow {
    @Id
    @GeneratedValue
    private Integer id_document_workflow;
    private String title;
    private Boolean businessPartnerMandatory;
    private Boolean autoFillDocTitle;
    // obavezan naziv priloga iz predefinisane liste
    private Boolean attTitleFromPreDefListMandatory;
    private Boolean versioning;
    @OneToMany(mappedBy = "documentWorkflow")
    private List<Document> documentList;
}
