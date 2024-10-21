package co.edu.uniquindio.preparcial2.preparcial2.model;

import co.edu.uniquindio.preparcial2.preparcial2.service.IEntrega;

import java.time.LocalDate;
//Bridge
public class PrestamoLocal extends Prestamo {

    public PrestamoLocal(String numeroPrestamo, LocalDate fechaPrestamo, LocalDate fechaEntrega, String descripcion, Cliente clienteAsociado, Empleado empleadoAsociado, IEntrega entrega) {
        super(numeroPrestamo, fechaPrestamo, fechaEntrega, descripcion, clienteAsociado, empleadoAsociado, entrega);
    }

    @Override
    public void procesarPrestamo(){
        if(getListObjetosAsociados().isEmpty()){
            System.out.println("No se puede procesar la prestamo");
            return;
        }

        LocalDate fechaEntrega = getFechaEntrega().plusDays(15);
        setFechaEntrega(fechaEntrega);

        for(Objeto objeto : getListObjetosAsociados()){
            objeto.setPrestamoAsociado(this);
            System.out.println("Se ha hecho un prestamo de " + objeto.getNombre());
        }

        getClienteAsociado().getListPrestamosAsociados().add(this);

        System.out.println("El prestamo ha sido procesado exitosamente");
    }


    @Override
    public double costo(){
        return 50; // valor para un prestamo local
    }
}
