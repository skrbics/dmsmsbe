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
public class OrganizationUnit {
    @Id
    @GeneratedValue
    private Integer id_organization_unit;
    private String organizationUnitTitle;
    @OneToMany(mappedBy = "predefinedOrganizationUnit")
    private List<FolderWorkflow> folderWorkflowList;
}
