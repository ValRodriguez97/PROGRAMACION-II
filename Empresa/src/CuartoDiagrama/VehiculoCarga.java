package CuartoDiagrama;

public class VehiculoCarga extends Vehiculo
{
    private double capacidadMaxima;
    private int numeroEjes;

    public VehiculoCarga(String placa, String modelo, String marca, String color, double capacidadMaxima, int numeroEjes){
        super(placa, modelo, marca, color);
        this.capacidadMaxima = capacidadMaxima;
        this.numeroEjes = numeroEjes;
    }

}
