package Ejercicio2;

public class Producto {
	private String fechaCaducidad;
	private int numeroLote;
	
	public Producto(String fechaCaducidad, int numeroLote) {
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
	}
	
	public Producto() {
		fechaCaducidad = "Sin Fecha";
		numeroLote = 0000000;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}
	
	
}
