package co.edu.uniquindio.preparcial2.preparcial2.model.builder;

import co.edu.uniquindio.preparcial2.preparcial2.model.Objeto;
import co.edu.uniquindio.preparcial2.preparcial2.model.Prestamo;

public class ObjetoBuilder {
    protected String nombre;
    protected Prestamo prestamoAsociado;

    public ObjetoBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public ObjetoBuilder prestamoAsociado(Prestamo prestamo){
        this.prestamoAsociado = prestamo;
        return this;
    }

    public Objeto build(){
        return new Objeto(nombre, prestamoAsociado);
    }
}
