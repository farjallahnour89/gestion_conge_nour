package tn.esprit.gestionconges.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.gestionconges.entites.Users;
@Repository
public interface UserRepo extends JpaRepository<Users, Long> {
}
