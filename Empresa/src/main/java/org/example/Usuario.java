package org.example;

public class Usuario {
    private final String nombre;
    private final String edad;

    public Usuario(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

}
