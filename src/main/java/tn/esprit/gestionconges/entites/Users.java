package tn.esprit.gestionconges.entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Users  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser ;
    private String  nom ;
    private String Prenom ;
    private String adresse ;
    @Enumerated(EnumType.STRING)
    private  Type type ;
    private String Sexe ;
    private String Pw ;
    private String email ;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance  ;
    private int numTel ;
    @OneToMany(mappedBy = "users")
    private List<Feedback> feedback ;
    @OneToMany(mappedBy = "users")
    private List<Reclamation> reclamations ;

    @OneToMany(mappedBy = "users")
    private  List<DemandeCongee> demandeCongees ;



}
