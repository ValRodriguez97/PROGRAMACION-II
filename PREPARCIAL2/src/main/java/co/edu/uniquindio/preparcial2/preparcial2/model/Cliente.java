package co.edu.uniquindio.preparcial2.preparcial2.model;

import co.edu.uniquindio.preparcial2.preparcial2.model.builder.ClienteBuilder;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona{
    List<Prestamo> listPrestamosAsociados;

    public Cliente(String nombre, String apellido, String cedula, String edad) {
        super(nombre, apellido, cedula, edad);
        this.listPrestamosAsociados = new ArrayList<>();
    }

    public static ClienteBuilder builder(){
        return new ClienteBuilder();
    }

    public List<Prestamo> getListPrestamosAsociados() {
        return listPrestamosAsociados;
    }

    public void setListPrestamosAsociados(List<Prestamo> listPrestamosAsociados) {
        this.listPrestamosAsociados = listPrestamosAsociados;
    }

    public void addPrestamo(Prestamo prestamo){
        this.listPrestamosAsociados.add(prestamo);
    }

    public int totalPrestamos(){
        return listPrestamosAsociados.size();
    }
}
