package tn.esprit.gestionconges.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.gestionconges.entites.Reclamation;
@Repository
public interface ReclamationRepo extends JpaRepository<Reclamation, Long > {
}
