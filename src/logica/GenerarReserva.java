package logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import dbConexion.ConexionDB;
import views.MenuUsuario;

public class GenerarReserva extends DatosReservaView {

	private java.util.Date fechaLlegada;
	private java.util.Date fechaSalida;
	private double valor;
	private String tipoDePago;
	private ResultSet Resultado;

	public GenerarReserva(Date date1, Date date2, double precio, String combo) {
		super(date1, date2, precio, combo);
		this.fechaLlegada = date2;
		this.fechaSalida = date1;
		this.valor = precio;
		this.tipoDePago = combo;

	}

	public void guardarDatos() {

		int id = 0;
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		String fLlegada = formatter.format(fechaLlegada);
		String fSalida = formatter.format(fechaSalida);

		ConexionDB con = new ConexionDB();
		Connection conexion = con.conectar();

		try {
			PreparedStatement stm = conexion.prepareStatement(
					"INSERT INTO reservas (fechaEntrada,fechaSalida,valor,formaPago)" + "VALUES(?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);

			stm.setString(1, fLlegada);
			stm.setString(2, fSalida);
			stm.setDouble(3, valor);
			stm.setString(4, tipoDePago);
			stm.execute();

			JOptionPane.showMessageDialog(null, "Registrado con exito");

			Resultado = stm.getGeneratedKeys();
			
			if(Resultado.next()) {
				id = Resultado.getInt(1);
				JOptionPane.showMessageDialog(null,"Numero de reserva: " +  id);
			}
			conexion.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
		}

	}

	

}
