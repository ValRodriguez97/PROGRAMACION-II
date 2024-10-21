package co.edu.uniquindio.preparcial2.preparcial2.model;

import co.edu.uniquindio.preparcial2.preparcial2.model.builder.ObjetoBuilder;
import co.edu.uniquindio.preparcial2.preparcial2.service.IObjeto;

public class Objeto implements IObjeto {
    private String nombre;
    private Prestamo prestamoAsociado;
    private boolean disponible;

    public Objeto(String nombre, Prestamo prestamoAsociado) {
        this.nombre = nombre;
        this.prestamoAsociado = prestamoAsociado;
        this.disponible = true;
    }

    public static ObjetoBuilder builder(){
        return new ObjetoBuilder();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Prestamo getPrestamoAsociado() {
        return prestamoAsociado;
    }

    public void setPrestamoAsociado(Prestamo prestamoAsociado) {
        this.prestamoAsociado = prestamoAsociado;
    }

    @Override
    public void prestar(Cliente cliente) {
        if(disponible){
           disponible = false;
           System.out.println("Se ha prestado exitosamente el objeto");
        }
        System.out.println("El objeto no se encuentra disponible");
    }

    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public void devolver(){
        disponible = true;
    }
}
