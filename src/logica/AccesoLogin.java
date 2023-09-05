package logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dbConexion.ConexionDB;
import views.Login;
import views.MenuUsuario;

public class AccesoLogin extends DatosLogin {
	
	private Boolean estado = false;
	private String usuario;
	private String password;
	
	public AccesoLogin(String usuario, String contrasenia) {
		super(usuario, contrasenia);		
		this.usuario = usuario;
		this.password = contrasenia;
	}
	
	public void entrar() {
		
		ConexionDB conexion = new ConexionDB();
		Connection con = conexion.conectar();
		
		
		try {
			
			PreparedStatement stm = con.prepareStatement("SELECT * FROM acceso WHERE usuario = ? and contrasenia = ? ");

			stm.setString(1, usuario);
			stm.setString(2, password);
			
			ResultSet rs = stm.executeQuery();
			
			
			if(rs.next()) {
				estado = true;
				
				if(estado) {
					MenuUsuario menu = new MenuUsuario();
		            menu.setVisible(true);
				} 
			}
			else {
				Login login = new Login();
				login.setVisible(true);
				JOptionPane.showMessageDialog(null, "Datos incorrectos");
				
			}con.close();
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Error " +  e.getMessage());
		}
		
		
	}
	
	

}
