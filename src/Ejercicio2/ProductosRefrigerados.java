package Ejercicio2;

public class ProductosRefrigerados extends Producto {
	private int codigo;
	
	public ProductosRefrigerados() {
		super();
	}
	public ProductosRefrigerados(String fechaCaducidad, int numeroLote, int codigo) {
		super(fechaCaducidad,numeroLote);
		this.codigo = codigo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	

}
