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
public class ClassificationUnit {
    @Id
    @GeneratedValue
    private Integer id_classification_unit;
    private String classificationUnitTitle;
    @OneToMany(mappedBy = "predefinedClassificationUnit")
    private List<FolderWorkflow> folderWorkflowList;
}
