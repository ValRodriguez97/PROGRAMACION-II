package co.edu.uniquindio.preparciali.preparcialii.model.builder;

import co.edu.uniquindio.preparciali.preparcialii.model.Objeto;
import co.edu.uniquindio.preparciali.preparcialii.model.Prestamo;

public class ObjetoBuilder {
    protected String nombre;
    protected Prestamo prestamo;


    public ObjetoBuilder nombre (String nombre){
        this.nombre = nombre;
        return this;
    }

    public ObjetoBuilder prestamo (Prestamo prestamo){
        this.prestamo = prestamo;
        return this;
    }

    public Objeto build(){
        return new Objeto(nombre, prestamo);
    }
}
