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
public class AdminSettings {
    @Id
    @GeneratedValue
    private Integer id_admin_settings;
    private String mail_server_url;
    private Integer session_duration_sec;
    private Integer max_file_size_mb;
}
