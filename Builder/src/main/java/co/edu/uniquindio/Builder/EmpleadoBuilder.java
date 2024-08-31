package co.edu.uniquindio.Builder;

public class EmpleadoBuilder {
    private String nombre;
    private String id;
    private double salario;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public int getEdad() {
        return edad;
    }

    public EmpleadoBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public EmpleadoBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public EmpleadoBuilder setSalario(double salario) {
        this.salario = salario;
        return this;
    }

    public EmpleadoBuilder setEdad(int edad) {
        this.edad = edad;
        return this;

    }

    public Empleado build() {
        return new Empleado(this);
    }
}
