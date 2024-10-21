package co.edu.uniquindio.preparcial2.preparcial2.model.builder;

import co.edu.uniquindio.preparcial2.preparcial2.model.Empleado;

public class EmpleadoBuilder  extends  PersonaBuilder<EmpleadoBuilder>{

    @Override
    protected  EmpleadoBuilder self() {
        return this;
    }

    @Override
    public Empleado build() {
        return new Empleado(nombre, apellido, cedula, edad);
    }
}
