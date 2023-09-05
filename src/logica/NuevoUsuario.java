package logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import dbConexion.ConexionDB;

public class NuevoUsuario extends DatosLogin {

	private String user;
	private String pass;
	

	public NuevoUsuario(String usuario, String contrasenia) {
		super(usuario, contrasenia);
		this.user = usuario;
		this.pass = contrasenia;

	}

	public void registrarUsuario() {

		ConexionDB con = new ConexionDB();
		Connection conexion = con.conectar();

		if (user.equals("") && pass.equals("")) {
			JOptionPane.showMessageDialog(null, "No se puede registrar campos vacios");

		} else {
			
			try {
				PreparedStatement stm = conexion.prepareStatement("INSERT INTO acceso (usuario,contrasenia) "
						+ "VALUES(?,?)",Statement.RETURN_GENERATED_KEYS);
			
				stm.setString(1, user);
				stm.setString(2, pass);
				stm.execute();
				
				JOptionPane.showMessageDialog(null, "Registrado con exito");
				conexion.close();
				
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
			}
			
			
		}

	}

}
