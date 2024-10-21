package co.edu.uniquindio.preparcial2.preparcial2.model;
//Decorator
public class PrestamoDecorator extends Prestamo {
    protected Prestamo prestamo;

    public PrestamoDecorator(Prestamo prestamo) {
        super(prestamo.getNumeroPrestamo(), prestamo.getFechaPrestamo(), prestamo.getFechaEntrega(), prestamo.getDescripcion(), prestamo.getClienteAsociado(), prestamo.getEmpleadoAsociado(), prestamo.getEntrega());
        this.prestamo = prestamo;
    }

    @Override
    public double costo(){
        return prestamo.costo();
    }

    @Override
    public void procesarPrestamo(){
        prestamo.procesarPrestamo();
    }
}
