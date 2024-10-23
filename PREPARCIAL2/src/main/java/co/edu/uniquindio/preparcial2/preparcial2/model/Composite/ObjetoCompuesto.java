package co.edu.uniquindio.preparcial2.preparcial2.model.Composite;

import co.edu.uniquindio.preparcial2.preparcial2.model.Objeto;

import java.util.ArrayList;
import java.util.List;
//Composite
public class ObjetoCompuesto extends ObjectComponent{
   private List<Objeto> objetos;

   public ObjetoCompuesto() {
       objetos = new ArrayList<>();
   }

   @Override
    public void agregarObjeto(Objeto objeto) {
       objetos.add(objeto);
   }

   @Override
    public List<Objeto> obtenerObjetos(){
       return objetos;
   }
}
