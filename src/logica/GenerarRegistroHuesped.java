package logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import dbConexion.ConexionDB;

public class GenerarRegistroHuesped  extends DatosRegistroHuesped{

	
	private String nombre;
	private String apellido;
	private String fNacimiento;
	private String nacionalidad;
	private String telefono;
	private int reserva;
	
	
	public GenerarRegistroHuesped(String nombre, String apellido, String fNacimiento, String nacionalidad,
			String telefono, int reserva) {

		super(nombre, apellido, fNacimiento, nacionalidad, telefono, reserva);

		this.nombre = nombre;
		this.apellido = apellido;
		this.fNacimiento = fNacimiento;
		this.nacionalidad = nacionalidad;
		this.telefono = telefono;
		this.reserva = reserva;
	}
	
	public void guardarInformacion() {
		
		
		ConexionDB con = new ConexionDB();
		Connection conexion = con.conectar();
		
		try {
			PreparedStatement stm = conexion.prepareStatement("INSERT INTO huespedes (nombre,apellido,fechaNacimiento,nacionalidad,telefono,idReserva)"
					+ " values (?,?,?,?,?,?)");
			
			stm.setString(1, nombre);
			stm.setString(2, apellido);
			stm.setString(3, fNacimiento);
			stm.setString(4, nacionalidad);
			stm.setString(5, telefono);
			stm.setInt(6, reserva);
			stm.execute();
						
			JOptionPane.showMessageDialog(null, "Registro completo, " + "\n" + "Numero de reserva: " + reserva);
			
			conexion.close();

		} catch (SQLException e) {
			
			e.printStackTrace();
			
			JOptionPane.showMessageDialog(null, "No fue posible completar la reservación");
		}
		
	}

}
