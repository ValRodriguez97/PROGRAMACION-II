package org.example;

public class VehiculoCarga extends Vehiculo {
    private double capacidadCarga;
    private int numeroEjes;
    private String placa;

    public VehiculoCarga(String marca, String modelo, String placa, String color, double capacidad, int numeroEjes) {
        super(marca, modelo, placa, color);
        this.capacidadCarga = capacidad;
        this.numeroEjes = numeroEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
}


