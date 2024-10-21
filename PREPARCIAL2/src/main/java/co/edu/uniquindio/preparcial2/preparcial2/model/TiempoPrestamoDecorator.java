package co.edu.uniquindio.preparcial2.preparcial2.model;
//Decorator

import java.time.LocalDate;

public class TiempoPrestamoDecorator extends PrestamoDecorator {
    private int diasAdicionales;

    public TiempoPrestamoDecorator(Prestamo prestamo,int diasAdicionales) {
        super(prestamo);
        this.diasAdicionales = diasAdicionales;
    }

    @Override
    public double costo(){
        return super.costo()+(diasAdicionales * 3);
    }

    @Override
    public void procesarPrestamo(){
        super.procesarPrestamo();
        LocalDate fechaNueva = prestamo.getFechaEntrega().plusDays(diasAdicionales);
        prestamo.setFechaEntrega(fechaNueva);
        System.out.println("Se ha extendido la fecha de entrega de su prestamo, ahora tendra que entregar el objeto en " + prestamo.getFechaEntrega() + " dias");
    }
}
