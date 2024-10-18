package co.edu.uniquindio.preparciali.preparcialii.service;

import co.edu.uniquindio.preparciali.preparcialii.mapping.dto.ClienteDto;
import co.edu.uniquindio.preparciali.preparcialii.mapping.dto.EmpleadoDto;
import co.edu.uniquindio.preparciali.preparcialii.mapping.dto.ObjetoDto;
import co.edu.uniquindio.preparciali.preparcialii.mapping.dto.PrestamoDto;

import java.util.List;

public interface IModelFactoryService {
    List<ClienteDto> getClientes();
    boolean addCliente(ClienteDto clienteDto);
    boolean deleteCliente(String cedula);
    boolean updateCliente(String cedula, ClienteDto clienteDto);

    List<EmpleadoDto> getEmpleados();
    boolean addEmpleado(EmpleadoDto empleadoDto);
    boolean deleteEmpleado(String cedula);
    boolean updateEmpleado(String nombre, EmpleadoDto empleadoDto);

    List<ObjetoDto> getObjetos();
    boolean addObjeto(ObjetoDto objetoDto);
    boolean deleteObjeto(String nombre);
    boolean updateObjeto(String nombre, ObjetoDto objetoDto);

    List<PrestamoDto> getPrestamos();
    boolean addPrestamo(PrestamoDto prestamoDto);
    boolean deletePrestamo(String numeroPrestamo);
    boolean updatePrestamo(String numeroPrestamo, PrestamoDto prestamoDto);
}
