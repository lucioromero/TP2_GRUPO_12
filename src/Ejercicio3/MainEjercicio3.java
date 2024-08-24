package Ejercicio3;

public class MainEjercicio3 {
	public static void main(String[] args) {
		System.out.println("Hola Mundo");	
		
		Polideportivo poli = new Polideportivo("Pablo", 100, 50);
		
		System.out.println(poli.getSuperficieEdificio());
		System.out.println(poli.getTipoDeInstalacion());
	}
}
