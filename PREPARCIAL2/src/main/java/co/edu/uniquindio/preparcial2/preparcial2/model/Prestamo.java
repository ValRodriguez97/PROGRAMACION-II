package co.edu.uniquindio.preparcial2.preparcial2.model;

import co.edu.uniquindio.preparcial2.preparcial2.model.builder.PrestamoBuilder;
import co.edu.uniquindio.preparcial2.preparcial2.service.IEntrega;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Prestamo  {
    private String numeroPrestamo;
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;
    private String descripcion;
    private Cliente clienteAsociado;
    private Empleado empleadoAsociado;
    private List<Objeto> listObjetosAsociados;
    private IEntrega entrega;

    public Prestamo(String numeroPrestamo,LocalDate fechaPrestamo, LocalDate fechaEntrega, String descripcion, Cliente clienteAsociado, Empleado empleadoAsociado, IEntrega entrega) {
        this.numeroPrestamo = numeroPrestamo;
        this.listObjetosAsociados = new ArrayList<>();
        this.empleadoAsociado = empleadoAsociado;
        this.clienteAsociado = clienteAsociado;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.fechaPrestamo = fechaPrestamo;
        this.entrega = entrega;
    }


    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public List<Objeto> getListObjetosAsociados() {
        return listObjetosAsociados;
    }

    public void setListObjetosAsociados(List<Objeto> listObjetosAsociados) {
        this.listObjetosAsociados = listObjetosAsociados;
    }

    public Empleado getEmpleadoAsociado() {
        return empleadoAsociado;
    }

    public void setEmpleadoAsociado(Empleado empleadoAsociado) {
        this.empleadoAsociado = empleadoAsociado;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public IEntrega getEntrega() {
        return entrega;
    }

    public void setEntrega(IEntrega entrega) {
        this.entrega = entrega;
    }

    public void agregarObjeto(Objeto objeto) {
        this.listObjetosAsociados.add(objeto);
        objeto.setPrestamoAsociado(this);
    }

    public abstract void procesarPrestamo();
    public abstract double costo();

}
