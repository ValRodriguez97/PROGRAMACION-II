package co.edu.uniquindio.preparciali.preparcialii.service;

import co.edu.uniquindio.preparciali.preparcialii.mapping.dto.ClienteDto;
import co.edu.uniquindio.preparciali.preparcialii.mapping.dto.EmpleadoDto;
import co.edu.uniquindio.preparciali.preparcialii.mapping.dto.ObjetoDto;
import co.edu.uniquindio.preparciali.preparcialii.mapping.dto.PrestamoDto;
import co.edu.uniquindio.preparciali.preparcialii.model.Cliente;
import co.edu.uniquindio.preparciali.preparcialii.model.Empleado;
import co.edu.uniquindio.preparciali.preparcialii.model.Objeto;
import co.edu.uniquindio.preparciali.preparcialii.model.Prestamo;

import java.util.List;

public interface IPrestamoUQMapping {
    List<ClienteDto> getClientesDto(List<Cliente> listaClientes);
    List<EmpleadoDto> getEmpleadosDto(List<Empleado> listaEmpleados);
    List<ObjetoDto> getObjetosDto(List<Objeto> listaObjetos);
    List<PrestamoDto> getPrestamosDto(List<Prestamo> listaPrestamos);

    ClienteDto clienteToClienteDto(Cliente cliente);
    Cliente clienteDtoToCliente(ClienteDto clienteDto);

    EmpleadoDto empleadoToEmpleadoDto(Empleado empleado);
    Empleado empleadoDtoToEmpleado(EmpleadoDto empleadoDto);

    ObjetoDto objetoToObjetoDto(Objeto objeto);
    Objeto objetoDtoToObjeto(ObjetoDto objetoDto);

    PrestamoDto prestamoToPrestamoDto(Prestamo prestamo);
    Prestamo prestamoDtoToPrestamo(PrestamoDto prestamoDto);
}
