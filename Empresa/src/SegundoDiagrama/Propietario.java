package SegundoDiagrama;

import java.util.Collection;

public class Propietario {
    private final String nombre;
    private final String cedula;
    private final String email;
    private final String celular;
    private Vehiculo vehiculoAsociado;
    private Collection<Vehiculo> listaVehiculosAsociados;

    public Propietario(String nombre, String cedula, String email, String celular, Vehiculo vehiculoAsociado){
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.celular = celular;
        this.vehiculoAsociado = vehiculoAsociado;

    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula(){
        return cedula;
    }

    public String getEmail(){
        return email;
    }

    public String getCelular() {
        return celular;
    }

    public Vehiculo getVehiculoAsociado() {
        return vehiculoAsociado;
    }
}
