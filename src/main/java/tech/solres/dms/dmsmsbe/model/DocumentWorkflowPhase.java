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
public class DocumentWorkflowPhase {
    @Id
    @GeneratedValue
    private Integer id_document_workflow_phase;
    private String documentWorkflowPhaseTitle;
    private Boolean firstPhase;
    private Boolean lastPhase;
    // nejasan atribut, pitati Mira:
    private Boolean confirmation;
    private Boolean digitalSigning;
    @ManyToMany
    @JoinTable(
            name="user_auth_document_workflow_phase",
            joinColumns = @JoinColumn(name = "id_document_workflow_phase"),
            inverseJoinColumns = @JoinColumn(name = "id_user")
    )
    private List<User> authUserList;
    @ManyToMany
    @JoinTable(
            name="role_auth_document_workflow_phase",
            joinColumns = @JoinColumn(name = "id_document_workflow_phase"),
            inverseJoinColumns = @JoinColumn(name = "id_role")
    )
    private List<User> authRoleList;
    @OneToMany(mappedBy = "documentWorkflowPhase")
    private List<Alarm> alarmList;
    @OneToMany(mappedBy = "startingDocumentWorkflowPhase")
    private List<ActionDocumentWF> startingActionDocumentWFList;
    @OneToMany(mappedBy = "endingDocumentWorkflowPhase")
    private List<ActionDocumentWF> endingActionDocumentWFList;
}
