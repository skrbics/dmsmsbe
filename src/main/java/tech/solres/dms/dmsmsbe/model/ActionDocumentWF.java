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
public class ActionDocumentWF {
    @Id
    @GeneratedValue
    private Integer id_action_document_wf;
    @ManyToOne
    @JoinColumn(name="id_document_workflow_phase_start")
    private DocumentWorkflowPhase startingDocumentWorkflowPhase;
    @ManyToOne
    @JoinColumn(name="id_document_workflow_phase_end")
    private DocumentWorkflowPhase endingDocumentWorkflowPhase;
    @ManyToMany
    @JoinTable(
            name="user_action_document_wf",
            joinColumns = @JoinColumn(name = "id_action_document_wf"),
            inverseJoinColumns = @JoinColumn(name = "id_user")
    )
    private List<User> authUserList;
    @ManyToMany
    @JoinTable(
            name="role_action_document_wf",
            joinColumns = @JoinColumn(name = "id_action_document_wf"),
            inverseJoinColumns = @JoinColumn(name = "id_role")
    )
    private List<Role> authRoleList;
}
