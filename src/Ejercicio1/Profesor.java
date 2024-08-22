package Ejercicio1;

public class Profesor extends Empleado {
	
	private String cargo;
	private int antiguedadDocente;
	
	public Profesor() {
		cargo = "Sin cargo";
		antiguedadDocente = -1;
	}
	
	public Profesor(String cargo, int antiguedadDocente) {
		super();
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}

	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}
	
	
	
}
