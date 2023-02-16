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
public class Attachment {
    @Id
    @GeneratedValue
    private Integer id_attachment;
    private String url;
    @ManyToOne
    @JoinColumn(name="id_document")
    private Document document;
}
