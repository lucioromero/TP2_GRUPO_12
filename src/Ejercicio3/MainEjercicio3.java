package Ejercicio3;

import java.util.ArrayList;

public class MainEjercicio3 {
	public static void main(String[] args) {
		System.out.println("Hola Mundo");	
		
		Polideportivo poli = new Polideportivo("Pablo", 100, 50);
		
		ArrayList<Oficina> oficinasEdificio1 = new ArrayList<Oficina>();
		oficinasEdificio1.add(new Oficina(15, 15));
		oficinasEdificio1.add(new Oficina(5, 5));
		oficinasEdificio1.add(new Oficina(10, 10));
		
		EdificioOficinas edificioOficinas1 = new EdificioOficinas(oficinasEdificio1);

		System.out.println(poli.getSuperficieEdificio());
		System.out.println(poli.getTipoDeInstalacion());
		
		System.out.println(edificioOficinas1.getSuperficieEdificio());
		System.out.println(edificioOficinas1.getCantidadOficinas());
	}
}
