package co.edu.uniquindio.preparcial2.preparcial2.service;

import co.edu.uniquindio.preparcial2.preparcial2.model.Cliente;

import java.util.List;

public interface ICrudCliente {
    boolean createCliente(Cliente cliente);
    Cliente readCliente(String cedula);
    boolean updateCliente(String cedula, Cliente cliente);
    boolean deleteCliente(String cedula);
    List<Cliente> listClientes();
    boolean verificarClienteExistente(String cedula);
}