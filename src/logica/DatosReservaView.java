package logica;


public class DatosReservaView {
	
	private java.util.Date fecha_llegada;
	private java.util.Date fecha_salida;
	private double valor;
	private String formaDePago;
	
	
	public DatosReservaView(java.util.Date date1, java.util.Date date2, double precio, String combo) {
		this.fecha_llegada = date1;
		this.fecha_salida = date2;
		this.valor = precio;
		this.formaDePago = combo;
	}


	public java.util.Date getFecha_llegada() {
		return fecha_llegada;
	}


	public void setFecha_llegada(java.util.Date fecha_llegada) {
		this.fecha_llegada = fecha_llegada;
	}


	public java.util.Date getFecha_salida() {
		return fecha_salida;
	}


	public void setFecha_salida(java.util.Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getFormaDePago() {
		return formaDePago;
	}


	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}

	
	

}
