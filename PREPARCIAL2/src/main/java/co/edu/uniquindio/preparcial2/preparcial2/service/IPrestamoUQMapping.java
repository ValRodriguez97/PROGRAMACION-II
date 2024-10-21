package co.edu.uniquindio.preparcial2.preparcial2.service;

import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.ClienteDto;
import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.EmpleadoDto;
import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.ObjetoDto;
import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.PrestamoDto;
import co.edu.uniquindio.preparcial2.preparcial2.model.Cliente;
import co.edu.uniquindio.preparcial2.preparcial2.model.Empleado;
import co.edu.uniquindio.preparcial2.preparcial2.model.Objeto;
import co.edu.uniquindio.preparcial2.preparcial2.model.Prestamo;

import java.io.Flushable;
import java.util.List;

public interface IPrestamoUQMapping {
    //Cliente
    List<ClienteDto> getClientesDto(List<Cliente> listClientes);
    ClienteDto clienteToClienteDto(Cliente cliente);
    Cliente clienteDtoToCliente(ClienteDto clienteDto);

    //Empleado
    List<EmpleadoDto> getEmpleadosDto(List<Empleado> listEmpleados);
    EmpleadoDto empleadoToEmpleadoDto(Empleado empleado);
    Empleado empleadoDtoToEmpleado(EmpleadoDto empleadoDto);

    //Objeto
    List<ObjetoDto> getObjetosDto(List<Objeto> listObjetos);
    ObjetoDto objetoToObjetoDto(Objeto objeto);
    Objeto objetoDtoToObjeto(ObjetoDto objetoDto);

    //Prestamo
    List<PrestamoDto> getPrestamosDto(List<Prestamo> listPrestamos);
    PrestamoDto prestamoToPrestamoDto(Prestamo prestamo);
    Prestamo prestamoDtoToPrestamo(PrestamoDto prestamoDto);
}
