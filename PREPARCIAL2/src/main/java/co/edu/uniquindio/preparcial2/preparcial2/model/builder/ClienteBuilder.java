package co.edu.uniquindio.preparcial2.preparcial2.model.builder;

import co.edu.uniquindio.preparcial2.preparcial2.model.Cliente;

public class ClienteBuilder extends PersonaBuilder<ClienteBuilder> {
    @Override
    protected ClienteBuilder self() {
        return this;
    }

    @Override
    public Cliente build() {
        return new Cliente(nombre, apellido, cedula, edad);
    }
}
