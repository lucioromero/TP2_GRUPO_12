package Ejercicio2;

public class ProductosCongelados extends Producto {

    private double temperaturaCongelacion;

    public ProductosCongelados() {

        super();

        this.temperaturaCongelacion = 0.0;

     }

   public ProductosCongelados(String fechaCaducidad, int numeroLote, double temperaturaCongelacion) {

        super(fechaCaducidad, numeroLote);

        this.temperaturaCongelacion = temperaturaCongelacion;

    }

    public double getTemperaturaCongelacion() {

        return temperaturaCongelacion;

    }

    public void setTemperaturaCongelacion(double temperaturaCongelacion) {

        this.temperaturaCongelacion = temperaturaCongelacion;

    }

}