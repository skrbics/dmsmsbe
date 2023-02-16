package tech.solres.dms.dmsmsbe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class DocumentCounter {
    @Id
    @GeneratedValue
    private Integer id_document_counter;
    private String documentCounterTitle;
}
