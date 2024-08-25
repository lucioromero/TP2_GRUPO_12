package Ejercicio3;

public class EdificioOficinas implements IEdificio {
	private double ancho;
	private double largo;
	private int cantidadOficinas;
	
	public EdificioOficinas(double ancho, double largo, int cantidadOficinas) {
		this.ancho = ancho;
		this.largo = largo;
		this.cantidadOficinas = cantidadOficinas;
	}
	public int getCantidadOficinas() {
		return cantidadOficinas;
	}
	@Override
	public double getSuperficieEdificio() {
		return this.ancho * this.largo;
	}
}
