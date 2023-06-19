package tn.esprit.gestionconges.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionconges.entites.Users;

public interface UserRepo extends JpaRepository<Users, Long> {
}
