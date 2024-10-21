package co.edu.uniquindio.preparcial2.preparcial2.mapping.dto;

import co.edu.uniquindio.preparcial2.preparcial2.model.Cliente;
import co.edu.uniquindio.preparcial2.preparcial2.model.Empleado;

import java.time.LocalDate;

public record PrestamoDto(
        String numeroPrestamo,
        LocalDate fechaPrestamo,
        LocalDate fechaEntrega,
        String descripcion,
        Cliente clienteAsociado,
        Empleado empleadoAsociado
){
}
