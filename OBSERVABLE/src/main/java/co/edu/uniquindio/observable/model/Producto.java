package co.edu.uniquindio.observable.model;

public class Producto {

    private double cantidad;

    public Producto(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
