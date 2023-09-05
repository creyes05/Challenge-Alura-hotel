package logica;

public class DatosLogin {
	
	private String user;
	private String pass;
	

	public DatosLogin(String usuario, String contrasenia) {
		this.user = usuario;
		this.pass = contrasenia;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

	
	
}
