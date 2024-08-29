package Ejercicio2;

public class mainEjercicio2 {
public static void main(String[] args) {

	ProductosFrescos productoFresco = new ProductosFrescos("2024-10-12", 100001, "2024-05-07", "Ecuador");
	ProductosRefrigerados productoRefrigerado = new ProductosRefrigerados("2024-11-30", 200001, 2710);
	ProductosCongelados productoCongelado = new ProductosCongelados("2025-01-15", 300001, -15.0);
	
	System.out.println("Producto Fresco:");
	System.out.println("Fecha de caducidad: " + productoFresco.getFechaCaducidad());
	System.out.println("Numero de lote: " + productoFresco.getNumeroLote());
	System.out.println("Fecha de envasado: " + productoFresco.getFechaEnvasado());
	System.out.println("Pais de origen: " + productoFresco.getPaisOrigen());
	System.out.println();
	
	System.out.println("Producto Refrigerado:");
	System.out.println("Fecha de caducidad: " + productoRefrigerado.getFechaCaducidad());
	System.out.println("Numero de lote: " + productoRefrigerado.getNumeroLote());
	System.out.println("Codigo de organismo supervisor: " + productoRefrigerado.getCodigo());
	System.out.println();
	
	System.out.println("Producto Congelado:");
	System.out.println("Fecha de Caducidad: " + productoCongelado.getFechaCaducidad());
	System.out.println("Número de Lote: " + productoCongelado.getNumeroLote());
	System.out.println("Temperatura de Congelación: " + productoCongelado.getTemperaturaCongelacion() + "°C");

    }
}