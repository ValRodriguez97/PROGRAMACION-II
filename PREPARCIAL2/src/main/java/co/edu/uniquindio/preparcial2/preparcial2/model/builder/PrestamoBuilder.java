package co.edu.uniquindio.preparcial2.preparcial2.model.builder;

import co.edu.uniquindio.preparcial2.preparcial2.model.Cliente;
import co.edu.uniquindio.preparcial2.preparcial2.model.Empleado;
import co.edu.uniquindio.preparcial2.preparcial2.model.Prestamo;
import co.edu.uniquindio.preparcial2.preparcial2.service.IEntrega;

import java.time.LocalDate;

public abstract class PrestamoBuilder  <T extends PrestamoBuilder<T>> {
    protected String numeroPrestamo;
    protected LocalDate fechaPrestamo;
    protected  LocalDate fechaEntrega;
    protected String descripcion;
    protected Cliente clienteAsociado;
    protected Empleado empleadoAsociado;
    protected IEntrega entrega;

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

    public PrestamoBuilder entrega(IEntrega entrega) {
        this.entrega = entrega;
        return this;
    }

    public abstract Prestamo build() ;

}
