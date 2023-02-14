package tech.solres.dms.dmsmsbe.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.solres.dms.dmsmsbe.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
