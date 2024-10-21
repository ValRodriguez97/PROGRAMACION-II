package co.edu.uniquindio.preparcial2.preparcial2.service;

import co.edu.uniquindio.preparcial2.preparcial2.model.Objeto;

import java.util.List;

public interface ICrudObjeto {
    boolean createObjeto(Objeto objeto);
    Objeto readObjeto(String nombre);
    boolean updateObjeto(String nombre,Objeto objeto);
    boolean deleteObjeto(String nombre);
    List<Objeto> listObjetos();
    boolean verificarObjetoExistente(String nombre);
}
