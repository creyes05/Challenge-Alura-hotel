package logica;

public class DatosRegistroHuesped {

	private String nombre;
	private String apellido;
	private String fNacimiento;
	private String nacionalidad;
	private String telefono;
	private int reserva;
	
	
	public DatosRegistroHuesped(String nombre, String apellido, String fNacimiento, String nacionalidad,
			String telefono, int reserva) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.fNacimiento = fNacimiento;
		this.nacionalidad = nacionalidad;
		this.telefono = telefono;
		this.reserva = reserva;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getfNacimiento() {
		return fNacimiento;
	}

	public void setfNacimiento(String fNacimiento) {
		this.fNacimiento = fNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getReserva() {
		return reserva;
	}

	public void setReserva(int reserva) {
		this.reserva = reserva;
	}

	

}
