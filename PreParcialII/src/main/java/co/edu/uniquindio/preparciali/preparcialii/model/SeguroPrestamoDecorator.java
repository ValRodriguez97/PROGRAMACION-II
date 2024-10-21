package co.edu.uniquindio.preparciali.preparcialii.model;

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
