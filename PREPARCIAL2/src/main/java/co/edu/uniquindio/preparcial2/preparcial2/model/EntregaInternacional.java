package co.edu.uniquindio.preparcial2.preparcial2.model;

import co.edu.uniquindio.preparcial2.preparcial2.service.IEntrega;

import java.util.List;

//Bridge
public class EntregaInternacional implements IEntrega{
    private List<Objeto> objetos;

    @Override
    public void entregar(){
        for(Objeto objeto : objetos){
            System.out.println("Se ha enviado el objeto " + objeto.getNombre());
            objeto.setPrestamoAsociado(null);
        }
    }
}
