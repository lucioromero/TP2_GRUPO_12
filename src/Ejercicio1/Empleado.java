package Ejercicio1;

public class Empleado {
	
	private static int IdEmpleados = 1000;
	private final int ID;
	private String nombre;
	private int edad;

	public Empleado( String nombre, int edad) {
		this.ID = IdEmpleados++;
		this.nombre = nombre;
		this.edad = edad;
	}

	public Empleado() {
		this.ID = IdEmpleados++;
		this.nombre = "sin nombre";
		this.edad = 99;
	}

	public static void devuelveProximoID() {
	  	System.out.println("El próximo ID será el " + IdEmpleados);	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString(){
		return "Empleado " +nombre + ", Edad: " +edad + ", Legajo: " +ID;
	}
}
