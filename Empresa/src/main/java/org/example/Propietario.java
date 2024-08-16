package org.example;

public class Propietario {
    private String nombre;
    private String cedula;
    private String email;
    private String telefono;
    private VehiculoCarga vehiculoCarga;

    public Propietario(String nombre, String cedula, String email, String telefono, VehiculoCarga vehiculoCarga) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.telefono = telefono;
        this.vehiculoCarga = vehiculoCarga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public VehiculoCarga getVehiculoCarga() {
        return vehiculoCarga;
    }

    public void setVehiculoCarga(VehiculoCarga vehiculoCarga) {
        this.vehiculoCarga = vehiculoCarga;
    }
}
