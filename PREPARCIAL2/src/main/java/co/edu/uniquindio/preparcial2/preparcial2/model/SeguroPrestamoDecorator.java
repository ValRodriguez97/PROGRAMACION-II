package co.edu.uniquindio.preparcial2.preparcial2.model;
//Decorator
public class SeguroPrestamoDecorator extends PrestamoDecorator {
    private double valorSeguro;

    public SeguroPrestamoDecorator(Prestamo prestamo, double valorSeguro) {
        super(prestamo);
        this.valorSeguro = valorSeguro;
    }

    @Override
    public double costo(){
        return super.costo() + valorSeguro;
    }

    @Override
    public void procesarPrestamo(){
        super.procesarPrestamo();
        System.out.println("Se ha añadido un seguro a su prestamo por un valor de " + valorSeguro);
    }
}
