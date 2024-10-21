package co.edu.uniquindio.preparcial2.preparcial2.service;

import co.edu.uniquindio.preparcial2.preparcial2.model.Cliente;
//proxy
public interface IObjeto {
    String getNombre();
    void prestar(Cliente cliente);
    void devolver();
}
