package Ejercicio3;

public class MainEjercicio3 {
	public static void main(String[] args) {
		System.out.println("Hola Mundo");	
		
		Polideportivo poli = new Polideportivo("Pablo", 100, 50);
		Oficina ofi = new Oficina(50, 50, 20);
		
		System.out.println(poli.getSuperficieEdificio());
		System.out.println(poli.getTipoDeInstalacion());
		
		System.out.println(ofi.getSuperficieEdificio());
		System.out.println(ofi.getCantidadOficinas());
	}
}
