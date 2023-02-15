package bg.tuvarna.usp.dto;

public class RegisterUserDTO {
	
	private String username, phone, password, repeatPassword;
	
	public RegisterUserDTO(String username, String phone, String password, String repeatPassword) {
		super();
		this.username = username;
		this.phone = phone;
		this.password = password;
		this.repeatPassword = repeatPassword;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepeatPassword() {
		return repeatPassword;
	}

	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}
}
