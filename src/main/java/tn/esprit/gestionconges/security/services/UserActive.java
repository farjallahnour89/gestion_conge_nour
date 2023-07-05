package tn.esprit.gestionconges.security.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor

@NoArgsConstructor
public class UserActive {
public int active;




public int getActive() {
	return active;
}

public void setActive(int active) {
	this.active = active;
}

}
