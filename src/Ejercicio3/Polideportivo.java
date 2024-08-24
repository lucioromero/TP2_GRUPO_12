package Ejercicio3;

public class Polideportivo implements IEdificio, IInstalacionDeportiva{
	
	private String nombre;
	private double largo;
	private double ancho;
	
	public Polideportivo(String nombre, double ancho, double largo) {
		this.nombre = nombre;
		this.ancho = ancho;
		this.largo = largo;
	}
	
	@Override
	public String getTipoDeInstalacion() {
		return "Este es el Polideportivo " + this.nombre;
	}

	@Override
	public double getSuperficieEdificio() {
		return this.ancho * this.largo;
	}

}
