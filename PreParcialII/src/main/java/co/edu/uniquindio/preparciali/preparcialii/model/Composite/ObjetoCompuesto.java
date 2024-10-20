package co.edu.uniquindio.preparciali.preparcialii.model.Composite;

import co.edu.uniquindio.preparciali.preparcialii.model.Objeto;
import co.edu.uniquindio.preparciali.preparcialii.model.Prestamo;
import co.edu.uniquindio.preparciali.preparcialii.service.IComponenteObjeto;

import java.util.ArrayList;
import java.util.List;

//Composite
public class ObjetoCompuesto extends Objeto {
    private List<IComponenteObjeto> objetos;

    public ObjetoCompuesto(String nombre, Prestamo prestamoAsociado) {
        super(nombre, prestamoAsociado);
        this.objetos = new ArrayList<>();
    }

    public void addObjeto(IComponenteObjeto objeto){
        this.objetos.add(objeto);
    }

    @Override
    public void prestarObjeto(){
        System.out.println("Prestando kit de objetos " + getNombre());
        for (IComponenteObjeto objeto : objetos){
            objeto.prestarObjeto();
        }
    }

    @Override
    public void devolverObjeto(){
        System.out.println("Se devuelve el kit  " + getNombre());
        for (IComponenteObjeto objeto : objetos){
            objeto.devolverObjeto();
        }
    }
}
