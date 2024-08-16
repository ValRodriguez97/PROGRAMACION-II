package org.example;

public class VehiculoTransporte extends Vehiculo {
    private final int maxPasajeros;
    private String placa;

    public VehiculoTransporte (String marca, String modelo, String placa, String color, int maxPasajeros) {
        super(marca, modelo, placa, color);
        this.maxPasajeros = maxPasajeros;

    }

    public int getMaxPasajeros(){
        return maxPasajeros;
    }

}
