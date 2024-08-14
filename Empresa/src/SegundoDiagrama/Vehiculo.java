package SegundoDiagrama;

import java.util.ArrayList;
import java.util.Collection;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String color;
    private Propietario propietarioAsociado;
    private Collection<Propietario> listaPropietariosAsociados;

    public Vehiculo (String placa, String modelo, String marca, String color){
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.propietarioAsociado = propietarioAsociado;
        this.listaPropietariosAsociados = new ArrayList<Propietario>();

    }
}
