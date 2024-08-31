package co.edu.uniquindio.Builder;

public class IngenieroBuilder extends EmpleadoBuilder{
    private String tipoIngeniero;
    private EmpleadoBuilder empleadoBuilder;

    public IngenieroBuilder(){
        this.empleadoBuilder = new EmpleadoBuilder();
    }

    public EmpleadoBuilder getEmpleadoBuilder() {
        return empleadoBuilder;
    }

    public String getTipoIngeniero() {
        return tipoIngeniero;
    }

    public IngenieroBuilder setTipoIngeniero(String tipoIngeniero) {
        this.tipoIngeniero = tipoIngeniero;
        return this;
    }

    public IngenieroBuilder setNombre(String nombre) {
        empleadoBuilder.setNombre(nombre);
        return this;
    }

    public IngenieroBuilder setId(String id) {
        empleadoBuilder.setId(id);
        return this;
    }

    public IngenieroBuilder setSalario(double salario) {
        empleadoBuilder.setSalario(salario);
        return this;
    }

    public IngenieroBuilder setEdad(int edad) {
        empleadoBuilder.setEdad(edad);
        return this;
    }

    public Ingeniero build (){
        return new Ingeniero(empleadoBuilder, tipoIngeniero);
    }
}
