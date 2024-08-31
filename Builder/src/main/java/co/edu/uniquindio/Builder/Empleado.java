package co.edu.uniquindio.Builder;


public class Empleado {
    private String nombre;
    private String id;
    private double salario;
    private int edad;

    protected Empleado(EmpleadoBuilder builder) {
        this.nombre = builder.getNombre();
        this.id = builder.getId();
        this.salario = builder.getSalario();
        this.edad = builder.getEdad();
    }

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

    public static EmpleadoBuilder builder() {
        return new EmpleadoBuilder() ;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", salario=" + salario +
                ", edad=" + edad +
                '}';
    }
}
