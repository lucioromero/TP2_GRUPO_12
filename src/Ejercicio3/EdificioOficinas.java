package Ejercicio3;

import java.util.ArrayList;

public class EdificioOficinas implements IEdificio {
	private ArrayList<Oficina> oficinas;
	
	public EdificioOficinas(ArrayList<Oficina> oficinas) {
		this.oficinas = oficinas;
	}
	public int getCantidadOficinas() {
		return this.oficinas.size();
	}
	@Override
	public double getSuperficieEdificio() {
	    double superficie = 0;
	    for (Oficina oficina : oficinas) {
	        superficie += oficina.getAncho() * oficina.getLargo();
	    }
	    return superficie;
	}
}
