package Ejercicio1;

import java.util.Objects;

public class Empleado implements Comparable<Empleado>{
	
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
	  	System.out.println("El pr�ximo ID ser� el " + IdEmpleados);	
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
	
	public int getID() {
		return ID;
	}

	@Override
	public String toString(){
		return "Empleado " +nombre + ", Edad: " +edad + ", Legajo: " +ID;
	}

	@Override
	public int compareTo(Empleado o) {
		if(edad > o.getEdad()) {
			return 1;
		}
		return -1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return ID == other.ID && edad == other.edad && Objects.equals(nombre, other.nombre);
	}



}
