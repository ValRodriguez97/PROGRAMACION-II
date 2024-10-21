package co.edu.uniquindio.preparciali.preparcialii.model;

import co.edu.uniquindio.preparciali.preparcialii.service.ICliente;

public class EmpleadoAdapter implements ICliente {
    private Empleado empleado;

    public EmpleadoAdapter(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public void solicitarPrestamo(Prestamo prestamo){
        System.out.println("El empleado "+ empleado.getNombre() + " solicito un prestamo con las siguientes caracteristicas " + prestamo);
    }
}
