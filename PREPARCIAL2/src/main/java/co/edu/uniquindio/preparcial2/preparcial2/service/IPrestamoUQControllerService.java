package co.edu.uniquindio.preparcial2.preparcial2.service;

import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.ClienteDto;
import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.EmpleadoDto;
import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.ObjetoDto;
import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.PrestamoDto;
import co.edu.uniquindio.preparcial2.preparcial2.model.Cliente;
import co.edu.uniquindio.preparcial2.preparcial2.model.Prestamo;

import java.util.List;

public interface IPrestamoUQControllerService {
    List<PrestamoDto> getPrestamosDto();
    boolean addPrestamo(PrestamoDto prestamoDto);
    boolean updatePrestamo(String numeroPrestamo, PrestamoDto prestamoDto);
    boolean deletePrestamo(String numeroPrestamo);

    List<ClienteDto> getClientesDto();
    boolean addCliente(ClienteDto clienteDto);
    boolean updateCliente(String cedula, ClienteDto clienteDto);
    boolean deleteCliente(String cedula);

    List<EmpleadoDto> getEmpleadosDto();
    boolean addEmpleado(EmpleadoDto empleadoDto);
    boolean updateEmpleado(String cedula, EmpleadoDto empleadoDto);
    boolean deleteEmpleado(String cedula);

    List<ObjetoDto> getObjetosDto();
    boolean addObjeto(ObjetoDto objetoDto);
    boolean updateObjeto(String nombre, ObjetoDto objetoDto);
    boolean deleteObjeto(String nombre);
}
