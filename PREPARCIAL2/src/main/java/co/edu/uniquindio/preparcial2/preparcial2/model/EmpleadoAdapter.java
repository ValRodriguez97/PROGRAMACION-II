package co.edu.uniquindio.preparcial2.preparcial2.model;

import co.edu.uniquindio.preparcial2.preparcial2.service.ICliente;
//Adapter
public class EmpleadoAdapter implements ICliente {
    private Empleado empleado;

    public EmpleadoAdapter(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public void realizarPrestamo(){
        System.out.println("Prestamo Realizado");
    }

}
