package tn.esprit.gestionconges.message.requset;

public class PasswordRequest {
	private String currentPassword;
    private String newPassword;
	public String getCurrentPassword() {
		return currentPassword;
	}
	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public PasswordRequest(String currentPassword, String newPassword) {
		super();
		this.currentPassword = currentPassword;
		this.newPassword = newPassword;
	}
	public PasswordRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
