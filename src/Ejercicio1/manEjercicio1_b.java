package Ejercicio1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class manEjercicio1_b {
public static void main(String[] args) {
		
		Profesor prof1 = new Profesor("Titular", 10, "Alfredo", 45);
		Profesor prof2 = new Profesor("Suplente", 1, "Susana", 43);
		Profesor prof3 = new Profesor("Titular", 20, "Julio", 46);
		Profesor prof4 = new Profesor("Suplente", 3, "Amalia", 33);
		Profesor prof5 = new Profesor("Titular", 13, "Fedico", 56);
		
		Set<Empleado> arbolProfesores = new TreeSet<Empleado>();
		
		arbolProfesores.add(prof1);
		arbolProfesores.add(prof2);
		arbolProfesores.add(prof3);
		arbolProfesores.add(prof4);
		arbolProfesores.add(prof5);
		
		Iterator<Empleado> iterador = arbolProfesores.iterator();
		
		
		System.out.println("---------Profesores desde TreeSet----------");
		while(iterador.hasNext()) {
			System.out.println(iterador.next().toString());
		}
		
		
		Profesor prof6 = new Profesor("Titular", 10, "Alfredo", 45);
		Profesor prof7 = new Profesor("Titular", 10, "Alfredo", 45);
		
		System.out.println("------------Comparar Profesores--------------");
		
		/*
		 * Nunca van a ser iguales debido al ID autoincremental
		 * */
		if(prof6.hashCode() == prof7.hashCode()) {
			System.out.println("Es el mismo profesor");
			System.out.println("prof6: " + prof6.hashCode());
			System.out.println("prof7: " + prof7.hashCode());
		}else {
			System.out.println("Son distintos profesores");
			System.out.println("prof6: " + prof6.hashCode());
			System.out.println("prof7: " + prof7.hashCode());
		}
	}
}
