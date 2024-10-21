package co.edu.uniquindio.preparcial2.preparcial2.model.Composite;

import java.util.ArrayList;
import java.util.List;
//Composite
public class ObjetoCompuesto extends ObjectComponent{
    private String nombre;
    private List<ObjectComponent> objetos;

    public ObjetoCompuesto(String nombre) {
        this.nombre = nombre;
        this.objetos = new ArrayList<>();
    }

    public void addObjeto(ObjectComponent objeto){
        objetos.add(objeto);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getCosto(){
        return objetos.stream().mapToDouble(ObjectComponent::getCosto).sum();
    }
}
