package co.edu.uniquindio.preparciali.preparcialii.model;

import co.edu.uniquindio.preparciali.preparcialii.service.IEntrega;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//Bridge
public class PrestamoInternacional extends  Prestamo{

    public PrestamoInternacional(String numeroPrestamo, LocalDate fechaPrestamo, LocalDate fechaEntrega, String descripcion, Cliente clienteAsociado, Empleado empleadoAsociado, IEntrega entrega) {
        super(numeroPrestamo, fechaPrestamo, fechaEntrega, descripcion, clienteAsociado, empleadoAsociado, entrega);
    }

    @Override
    public void procesarPrestamo(){
        entregar();
        condicionVencimiento();
    }

    @Override
    public void condicionVencimiento(){
        long diasTranscurridos = ChronoUnit.DAYS.between(getFechaPrestamo(), getFechaEntrega());
        if (diasTranscurridos > 7){
            System.out.println("Se ha vencido el proceso de vencimiento");
        } else {
            System.out.println("Todavia hay plazo para el prestamo");
        }
    }
}
