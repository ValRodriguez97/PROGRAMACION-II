package co.edu.uniquindio.preparciali.preparcialii.model;

import co.edu.uniquindio.preparciali.preparcialii.model.Decorator.PrestamoDecorator;

public class SeguroPrestamoDecorator extends PrestamoDecorator {
    private  double costoSeguroPrestamo;

    public SeguroPrestamoDecorator(Prestamo prestamo, double costoSeguroPrestamo) {
        super(prestamo);
        this.costoSeguroPrestamo = costoSeguroPrestamo;
    }

    @Override
    public double costo(){
        return prestamo.costo() + costoSeguroPrestamo;
    }
}
