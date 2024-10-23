package co.edu.uniquindio.preparcial2.preparcial2.service;

import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.ClienteDto;
import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.EmpleadoDto;
import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.ObjetoDto;
import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.PrestamoDto;

import java.util.List;

public interface IModelFactoryService {
    //Cliente
    List<ClienteDto> getClientes();
    boolean addCliente(ClienteDto clienteDto);
    boolean updateCliente(String cedula, ClienteDto clienteDto);
    boolean deleteCliente(String cedula);

    //Empleado
    List<EmpleadoDto> getEmpleados();
    boolean addEmpleado(EmpleadoDto empleadoDto);
    boolean updateEmpleado(String cedula, EmpleadoDto empleadoDto);
    boolean deleteEmpleado(String cedula);

    //Objeto
    List<ObjetoDto> getObjetos();
    boolean addObjeto(ObjetoDto objetoDto);
    boolean updateObjeto(String nombre, ObjetoDto objetoDto);
    boolean deleteObjeto(String nombre);

    //Prestamo
    List<PrestamoDto> getPrestamos();
    boolean addPrestamo(PrestamoDto prestamoDto);
    boolean updatePrestamo(String numeroPrestamo, PrestamoDto prestamoDto);
    boolean deletePrestamo(String numeroPrestamo);

    boolean buscarObjetoMasPrestado(int cantidad);
}
