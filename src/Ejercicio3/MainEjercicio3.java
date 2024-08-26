package Ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio3 {
	public static void main(String[] args) {
		
		ArrayList<IEdificio> edificios = new ArrayList<IEdificio>();
		ArrayList<Oficina> oficinas = new ArrayList<Oficina>();
		
		for(int i = 1; i <= 3; i++){
			edificios.add(new Polideportivo("Pablo " + i, 10 * i, 5 * i));
		}
		
		for(int i = 1; i <= 2; i++){
			oficinas.add(new Oficina(i * 5, i * 10));
		}
		
		edificios.add(new EdificioOficinas(oficinas));

		ListIterator<IEdificio> it = edificios.listIterator();

		while(it.hasNext()){
			IEdificio edificio = it.next();
            
			if(edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                System.out.println(polideportivo.getTipoDeInstalacion());
                System.out.println("Superficie: " + polideportivo.getSuperficieEdificio() + " m2");
				System.out.println("*********************");
            }
            
            if(edificio instanceof EdificioOficinas) {
                EdificioOficinas edificioOficinas = (EdificioOficinas) edificio;
                System.out.println("Edificio de Oficinas");
                System.out.println("Cantidad de oficinas: " + edificioOficinas.getCantidadOficinas());
                System.out.println("Superficie total de las oficinas: " + edificioOficinas.getSuperficieEdificio() + " m2");
				System.out.println("*********************");
            }
		}
	}
}
