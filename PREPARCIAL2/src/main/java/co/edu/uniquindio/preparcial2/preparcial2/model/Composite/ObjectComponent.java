package co.edu.uniquindio.preparcial2.preparcial2.model.Composite;

import co.edu.uniquindio.preparcial2.preparcial2.model.Objeto;

import java.util.List;

//Composite
public abstract class ObjectComponent {
    public abstract void agregarObjeto(Objeto objeto);
    public abstract List<Objeto> obtenerObjetos();
}
