package co.edu.uniquindio.preparciali.preparcialii.model.builder;

import co.edu.uniquindio.preparciali.preparcialii.model.Cliente;
import co.edu.uniquindio.preparciali.preparcialii.model.Empleado;
import co.edu.uniquindio.preparciali.preparcialii.model.Prestamo;

import java.time.LocalDate;

public class PrestamoBuilder {
    protected String numeroPrestamo;
    protected LocalDate fechaPrestamo;
    protected LocalDate fechaEntrega;
    protected String descripcion;
    protected Cliente clienteAsociado;
    protected Empleado empleadoAsociado;

    public PrestamoBuilder numeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
        return this;
    }

    public PrestamoBuilder fechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
        return this;
    }

    public PrestamoBuilder fechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
        return this;
    }

    public PrestamoBuilder descripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public PrestamoBuilder clienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
        return this;
    }

    public PrestamoBuilder empleadoAsociado(Empleado empleadoAsociado) {
        this.empleadoAsociado = empleadoAsociado;
        return this;
    }

    public Prestamo build() {
        return new Prestamo(numeroPrestamo, fechaPrestamo, fechaEntrega, descripcion, clienteAsociado, empleadoAsociado);
    }


}
