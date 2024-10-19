package co.edu.uniquindio.preparciali.preparcialii.model;

import co.edu.uniquindio.preparciali.preparcialii.service.IEntrega;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//Bridge
public class PrestamoLocal extends Prestamo{

    public PrestamoLocal(String numeroPrestamo, LocalDate fechaPrestamo, LocalDate fechaEntrega, String descripcion, Cliente clienteAsociado, Empleado empleadoAsociado, IEntrega entrega) {
        super(numeroPrestamo, fechaPrestamo, fechaEntrega, descripcion, clienteAsociado, empleadoAsociado, entrega);
    }

    @Override
    public void procesarPrestamo() {
        entregar();
        condicionVencimiento();
    }

    @Override
    public void condicionVencimiento() {
        System.out.println("Condicion de Vencimiento");
        long diasTranscurridos = ChronoUnit.DAYS.between(getFechaPrestamo(), LocalDate.now());
        if(diasTranscurridos > 15) {
            System.out.println("El prestamo supero el limite de dias, por lo tanto esta venciido");
        } else {
            System.out.println("Todavia hay plazo para el pago del prestamo");
        }
    }
}
