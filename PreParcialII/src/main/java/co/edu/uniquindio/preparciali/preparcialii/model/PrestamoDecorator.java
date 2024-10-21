package co.edu.uniquindio.preparciali.preparcialii.model;

import co.edu.uniquindio.preparciali.preparcialii.service.IEntrega;

import java.time.LocalDate;

//Decorator
public class PrestamoDecorator extends Prestamo {

    protected Prestamo prestamo;

    public PrestamoDecorator(Prestamo prestamo) {
        super(prestamo.getNumeroPrestamo(), prestamo.getFechaPrestamo(), prestamo.getFechaEntrega(), prestamo.getDescripcion(), prestamo.getClienteAsociado(), prestamo.getEmpleadoAsociado(), prestamo.entrega);
        this.prestamo = prestamo;
    }

    @Override
    public String getDescripcion(){
        return prestamo.getDescripcion();
    }

    @Override
    public void procesarPrestamo() {
        prestamo.procesarPrestamo();
    }

    @Override
    public void condicionVencimiento() {
        prestamo.condicionVencimiento();
    }

    @Override
    public LocalDate getFechaEntrega(){
        return prestamo.getFechaEntrega();
    }

    @Override
    public double costo(){
        return prestamo.costo();
    }

}
