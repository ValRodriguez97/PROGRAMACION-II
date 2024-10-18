package co.edu.uniquindio.preparciali.preparcialii.model.builder;

import co.edu.uniquindio.preparciali.preparcialii.model.Empleado;

public class EmpleadoBuilder extends PersonaBuilder<EmpleadoBuilder> {
    private String nombre;
    private String apellido;
    private String cedula;
    private String edad;

    @Override
    protected EmpleadoBuilder self() {
        return this;
    }

    @Override
    public Empleado build() {
        return new Empleado(nombre, apellido, cedula, edad);
    }
}