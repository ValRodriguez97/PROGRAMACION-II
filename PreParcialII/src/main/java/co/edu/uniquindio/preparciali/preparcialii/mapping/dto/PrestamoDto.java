package co.edu.uniquindio.preparciali.preparcialii.mapping.dto;

import co.edu.uniquindio.preparciali.preparcialii.model.Cliente;
import co.edu.uniquindio.preparciali.preparcialii.model.Empleado;

import java.time.LocalDate;

public record PrestamoDto (
        String numeroPrestamo,
        LocalDate fechaPrestamo,
        LocalDate fechaEntrega,
        String descripcion,
        Cliente clienteAsociado,
        Empleado empleadoAsociado
){
}
