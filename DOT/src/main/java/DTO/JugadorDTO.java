package DTO;

import java.io.Serializable;

public class JugadorDTO implements Serializable {
    private String nombre;
    private String apellido;
    private int edad;
    private int cuentaBancaria;
    private String contraseña;
    private String direccion;
    private String apodoUsuario;
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getApodoUsuario() {
        return apodoUsuario;
    }

    public void setApodoUsuario(String apodoUsuario) {
        this.apodoUsuario = apodoUsuario;
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", cuentaBancaria="
                + cuentaBancaria + ", contraseña=" + contraseña + ", direccion=" + direccion + ", apodoUsuario="
                + apodoUsuario + "]";
    }

    

}
