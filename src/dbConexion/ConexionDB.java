package dbConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionDB {
	
	Connection conexion = null;

	public Connection conectar() {

		try {
			 conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost/hotel_alura?useTimeZone=true&serverTimeZone=UTC", 
					"root", 
					"C*rlos11300258");

			System.out.println("Cerrando la conexion");
			//conexion.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexion;
		

	}

	

}