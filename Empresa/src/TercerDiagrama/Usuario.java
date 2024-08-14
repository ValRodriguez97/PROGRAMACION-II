package TercerDiagrama;

import SegundoDiagrama.Vehiculo;

public class Usuario {
    private Vehiculo vehiculoAsociado;
    private String edad;
    private String nombre;

    public Usuario(Vehiculo vehiculoAsociado, String edad, String nombre) {
        this.vehiculoAsociado = vehiculoAsociado;
        this.edad = edad;
        this.nombre = nombre;
    }
}
