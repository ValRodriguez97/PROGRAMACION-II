package co.edu.uniquindio.preparcial2.preparcial2.model;

import co.edu.uniquindio.preparcial2.preparcial2.model.builder.ObjetoBuilder;
import co.edu.uniquindio.preparcial2.preparcial2.service.IObjeto;

public class Objeto implements IObjeto {
    private String nombre;
    private Prestamo prestamoAsociado;

    public Objeto(String nombre, Prestamo prestamoAsociado) {
        this.nombre = nombre;
        this.prestamoAsociado = prestamoAsociado;
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
        if(prestamoAsociado != null){
            System.out.println("El objeto" + getNombre() + " ya ha sido prestado");
            return;
        }
        System.out.println("Se le ha prestado el objeto exitosamente");
    }
}
