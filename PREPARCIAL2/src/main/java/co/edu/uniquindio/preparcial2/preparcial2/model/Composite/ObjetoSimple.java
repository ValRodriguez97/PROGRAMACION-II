package co.edu.uniquindio.preparcial2.preparcial2.model.Composite;

import co.edu.uniquindio.preparcial2.preparcial2.model.Objeto;

import java.util.List;

//Composite
public class ObjetoSimple extends  ObjectComponent{
    private Objeto objeto;

    public ObjetoSimple(Objeto objeto){
        this.objeto = objeto;
    }

    @Override
    public void agregarObjeto(Objeto objeto){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Objeto getObjeto(){
        return objeto;
    }

    @Override
    public List<Objeto> obtenerObjetos(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
