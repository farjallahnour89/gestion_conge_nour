package tn.esprit.gestionconges.ServicesImpl;

import org.apache.catalina.User;
import tn.esprit.gestionconges.Repository.ReclamationRepo;
import tn.esprit.gestionconges.Repository.UserRepo;
import tn.esprit.gestionconges.Service.Ireclamation;
import tn.esprit.gestionconges.entites.Reclamation;
import tn.esprit.gestionconges.entites.Users;

public class ReclamationImpl implements Ireclamation {
    ReclamationRepo reclamationRepo ;
    UserRepo userRepo ;
   // @Override
   // public Reclamation Ajouterreclamation(Reclamation r, Long idUser) {
       // Users users = userRepo.findById(idUser).orElse(null);
       // r.setUsers(users);
      //  return reclamationRepo.save(r);
    //}

    //@Override
    //public User ajouterUser(Users user) {
        //return userRepo.save(user);
    //}
}
