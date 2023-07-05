package tn.esprit.gestionconges.service.admin;
import java.util.HashSet;




import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import tn.esprit.gestionconges.Repository.UserRepository;
import tn.esprit.gestionconges.entites.User;
import tn.esprit.gestionconges.security.jwt.JwtProvider;

@Service
public class AdminUserService {
	@Autowired
	 private UserRepository userRepository;
	@Autowired
	PasswordEncoder encoder;
	
	@Autowired
	JwtProvider jwtProvider;
	
	    // affichier la liste d'utulisateur 
	    public List<User> index() {
	        return userRepository.findAll();
	    }
        // suprimer un utulisateur apartir de leur id 
	    public ResponseEntity<Void> delete(Long id) {
	    	Optional<User> user = userRepository.findById(id);
	        if (user != null) {
	            userRepository.deleteById(id);
	            return ResponseEntity.status(HttpStatus.OK).build();
	        }
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	    }
	    // modifier l'utulisateur
	  	public User updateUser(User userDetail,Long id) {
	  		userDetail.setId(id);
	  	
	  		return userRepository.save(userDetail);
	  	}
			
	
		
	    public Optional<User> getOne(@PathVariable Long id) {
	    	Optional<User> user =userRepository.findById(id);
	    	  if (user == null) {
	    	        return null;
	    	    }
	    	    return user;
	    }
	    
	   
	   
}