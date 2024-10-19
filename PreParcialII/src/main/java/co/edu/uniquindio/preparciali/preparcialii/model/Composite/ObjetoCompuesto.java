package co.edu.uniquindio.preparciali.preparcialii.model.Composite;

import co.edu.uniquindio.preparciali.preparcialii.model.Objeto;
import co.edu.uniquindio.preparciali.preparcialii.model.Prestamo;

public class ObjetoCompuesto extends Objeto {
    private 
    public ObjetoCompuesto(String nombre, Prestamo prestamoAsociado) {
        super(nombre, prestamoAsociado);
    }

    @Override
    public void prestarObjeto(){
        System.out.println("");
    }
}
