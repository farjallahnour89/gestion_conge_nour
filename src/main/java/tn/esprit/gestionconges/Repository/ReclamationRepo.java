package tn.esprit.gestionconges.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionconges.entites.Reclamation;

public interface ReclamationRepo extends JpaRepository<Reclamation, Long > {
}
