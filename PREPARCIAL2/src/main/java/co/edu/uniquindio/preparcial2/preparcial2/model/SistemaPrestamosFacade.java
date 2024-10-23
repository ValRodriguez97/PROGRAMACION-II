package co.edu.uniquindio.preparcial2.preparcial2.model;

import java.util.ArrayList;
import java.util.List;

public class SistemaPrestamosFacade {
    private List<Cliente> clientes;
    private List<Prestamo> prestamos;
    private List<Empleado> empleados;

    public SistemaPrestamosFacade() {
        clientes = new ArrayList<>();
        prestamos = new ArrayList<>();
        empleados = new ArrayList<>();
    }

    public void realizarPrestamo(Cliente cliente, Empleado empleado, Prestamo prestamo){
        prestamos.add(prestamo);
        cliente.addPrestamo(prestamo);
        empleado.agregarPrestamo(prestamo);
    }

    public List<Prestamo> getPrestamos(){
        return prestamos;
    }
}
