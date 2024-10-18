package co.edu.uniquindio.preparciali.preparcialii.model.builder;

import co.edu.uniquindio.preparciali.preparcialii.model.Cliente;

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