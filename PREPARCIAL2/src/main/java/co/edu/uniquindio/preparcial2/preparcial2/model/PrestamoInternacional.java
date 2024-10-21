package co.edu.uniquindio.preparcial2.preparcial2.model;

import co.edu.uniquindio.preparcial2.preparcial2.service.IEntrega;

import java.time.LocalDate;
//Bridge
public class PrestamoInternacional extends Prestamo {

    public PrestamoInternacional(String numeroPrestamo, LocalDate fechaPrestamo, LocalDate fechaEntrega, String descripcion, Cliente clienteAsociado, Empleado empleadoAsociado, IEntrega entrega) {
        super(numeroPrestamo, fechaPrestamo, fechaEntrega, descripcion, clienteAsociado, empleadoAsociado, entrega);
    }

    @Override
    public void procesarPrestamo(){
        if(getListObjetosAsociados().isEmpty()){
            System.out.println("No se puede procesar el prestamo");
            return;
        }

        LocalDate fechaEntrega = getFechaEntrega().plusDays(20);
        setFechaPrestamo(fechaEntrega);

        for(Objeto objeto : getListObjetosAsociados()){
            objeto.setPrestamoAsociado(this);
            System.out.println("Se ha prestado exitosamente el objeto " + objeto.getNombre());
        }

        getClienteAsociado().getListPrestamosAsociados().add(this);

        System.out.println("Se ha completado el proceso de prestamo exitosamente ");
    }

    @Override
    public double costo(){
        return 100;
    }
}
