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
public class Alarm {
    @Id
    @GeneratedValue
    private Integer id_alarm;
    private Integer daysBeforeDeadLine;
    @ManyToOne
    @JoinColumn(name="id_document_workflow_phase")
    private DocumentWorkflowPhase documentWorkflowPhase;
}
