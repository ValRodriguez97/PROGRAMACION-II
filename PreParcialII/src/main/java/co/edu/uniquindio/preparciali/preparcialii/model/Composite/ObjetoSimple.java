package co.edu.uniquindio.preparciali.preparcialii.model.Composite;

import co.edu.uniquindio.preparciali.preparcialii.model.Objeto;
import co.edu.uniquindio.preparciali.preparcialii.model.Prestamo;
//Composite
public class ObjetoSimple  extends Objeto {

    public ObjetoSimple(String nombre, Prestamo prestamoAsociado) {
        super(nombre, prestamoAsociado);
    }

    @Override
    public void prestarObjeto(){
        System.out.println("Se presto existosamente el objeto");
    }

    @Override
    public void devolverObjeto(){
        System.out.println("Se devolvio el objeto");
    }
}
