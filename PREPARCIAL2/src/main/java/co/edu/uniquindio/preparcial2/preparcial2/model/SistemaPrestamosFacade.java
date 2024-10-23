package co.edu.uniquindio.preparcial2.preparcial2.model;

import java.util.ArrayList;
import java.util.List;

public class SistemaPrestamosFacade {
    private PrestamoUQ prestamoUQ;

    private List<Cliente> clientes;
    private List<Prestamo> prestamos;
    private List<Empleado> empleados;

    public SistemaPrestamosFacade(PrestamoUQ prestamoUQ) {
        clientes = new ArrayList<>();
        prestamos = new ArrayList<>();
        empleados = new ArrayList<>();
        this.prestamoUQ = prestamoUQ;
    }

    public void realizarPrestamo(Cliente cliente, Empleado empleado, Prestamo prestamo){
        prestamos.add(prestamo);
        cliente.addPrestamo(prestamo);
        empleado.agregarPrestamo(prestamo);
    }

    public void buscarObjetosMasPrestados(int cantidad){
        prestamoUQ.objetosMasPrestados(cantidad);
    }

    public void ClientesConVariosPrestamos(int minPrestamos, int maxPrestamos){
        prestamoUQ.getClientesConVariosPrestamos(minPrestamos, maxPrestamos);
    }

    public void objetosDisponibles(){
        prestamoUQ.objetosDisponible();
    }

    public void totalPrestamos(){
        prestamoUQ.totalPrestamos();
    }
}
