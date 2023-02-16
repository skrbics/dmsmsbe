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
public class FolderWorkflowPhase {
    @Id
    @GeneratedValue
    private Integer id_folder_workflow_phase;
    private String folderWorkflowPhaseTitle;
    private Boolean firstPhase;
    private Boolean lastPhase;
    @ManyToMany
    @JoinTable(
            name="user_auth_folder_workflow_phase",
            joinColumns = @JoinColumn(name = "id_folder_workflow_phase"),
            inverseJoinColumns = @JoinColumn(name = "id_user")
    )
    private List<User> authUserList;
    @ManyToMany
    @JoinTable(
            name="role_auth_folder_workflow_phase",
            joinColumns = @JoinColumn(name = "id_folder_workflow_phase"),
            inverseJoinColumns = @JoinColumn(name = "id_role")
    )
    private List<User> authRoleList;
    @OneToMany(mappedBy = "startingFolderWorkflowPhase")
    private List<ActionFolderWF> startingActionFolderWFList;
    @OneToMany(mappedBy = "endingFolderWorkflowPhase")
    private List<ActionFolderWF> endingActionFolderWFList;
}
