package org.example;

public class VehiculoCarga {
    private double capacidadCarga;
    private int numeroEjes;

    public VehiculoCarga(double capacidad, int numeroEjes) {
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
}
