package co.edu.uniquindio.preparcial2.preparcial2.model.builder;

import co.edu.uniquindio.preparcial2.preparcial2.model.Objeto;
import co.edu.uniquindio.preparcial2.preparcial2.model.Prestamo;

public class ObjetoBuilder {
    protected String nombre;

    public ObjetoBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public Objeto build(){
        return new Objeto(nombre);
    }
}
