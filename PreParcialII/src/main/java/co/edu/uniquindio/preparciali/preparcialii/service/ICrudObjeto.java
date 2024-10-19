package co.edu.uniquindio.preparciali.preparcialii.service;

import co.edu.uniquindio.preparciali.preparcialii.model.Objeto;

import java.util.List;

public interface ICrudObjeto {
    boolean createObjeto(Objeto objeto);
    Objeto readObjeto(String nombre);
    boolean updateObjeto(String nombre, Objeto objeto);
    boolean deleteObjeto(String nombre);
    List<Objeto> listObjetos();
    boolean verificarObjetoExistente(String nombre);
}
