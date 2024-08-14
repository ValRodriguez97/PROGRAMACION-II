package CuartoDiagrama;

public abstract class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String color;

    public Vehiculo(String placa, String modelo, String marca, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }
}
