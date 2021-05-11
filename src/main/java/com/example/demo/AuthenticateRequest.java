package src.main.java.com.example.demo;

public class AuthenticateRequest {

	String username;
	String password;



	public AuthenticateRequest() {
	}
	public AuthenticateRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}