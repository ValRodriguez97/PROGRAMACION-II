package co.edu.uniquindio.preparciali.preparcialii.model;

import co.edu.uniquindio.preparciali.preparcialii.model.builder.PrestamoBuilder;
import co.edu.uniquindio.preparciali.preparcialii.service.IEntrega;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Prestamo {
    private String numeroPrestamo;
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega ;
    private String descripcion;
    private Cliente clienteAsociado;
    private List<Objeto> listaObjetosAsociados;
    private Empleado empleadoAsociado;
    protected IEntrega entrega;

    public Prestamo(String numeroPrestamo, LocalDate fechaPrestamo, LocalDate fechaEntrega, String descripcion, Cliente clienteAsociado, Empleado empleadoAsociado, IEntrega entrega) {
        this.numeroPrestamo = numeroPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.descripcion = descripcion;
        this.clienteAsociado = clienteAsociado;
        this.listaObjetosAsociados = new ArrayList<>();
        this.empleadoAsociado = empleadoAsociado;
        this.entrega = entrega;
    }

    public static PrestamoBuilder builder(){
        return new PrestamoBuilder();
    }

    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public List<Objeto> getListaObjetosAsociados() {
        return listaObjetosAsociados;
    }

    public void setListaObjetosAsociados(List<Objeto> listaObjetosAsociados) {
        this.listaObjetosAsociados = listaObjetosAsociados;
    }

    public Empleado getEmpleadoAsociado() {
        return empleadoAsociado;
    }

    public void setEmpleadoAsociado(Empleado empleadoAsociado) {
        this.empleadoAsociado = empleadoAsociado;
    }

    public abstract void procesarPrestamo();

    public void entregar(){
        entrega.entregar();
    }

    public  abstract void condicionVencimiento();

    public abstract double costo();
}
