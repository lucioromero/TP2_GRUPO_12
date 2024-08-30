package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		
		Profesor prof1 = new Profesor("Titular", 10, "Alfredo", 45);
		Profesor prof2 = new Profesor("Suplente", 1, "Susana", 43);
		Profesor prof3 = new Profesor("Titular", 20, "Julio", 46);
		Profesor prof4 = new Profesor("Suplente", 3, "Amalia", 33);
		Profesor prof5 = new Profesor("Titular", 13, "Fedico", 56);
		
		List<Empleado> listaProfesores = new ArrayList<Empleado>();
		
		listaProfesores.add(prof1);
		listaProfesores.add(prof2);
		listaProfesores.add(prof3);
		listaProfesores.add(prof4);
		listaProfesores.add(prof5);
		
		Iterator<Empleado> iterador = listaProfesores.iterator();
		
		System.out.println("---------Profesores desde ArrayList----------");
		while(iterador.hasNext()) {
		System.out.println(iterador.next().toString());
		}
	}
	
	
}
