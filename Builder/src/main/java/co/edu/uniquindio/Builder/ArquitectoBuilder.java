package co.edu.uniquindio.Builder;

public class ArquitectoBuilder {
    private EmpleadoBuilder empleadoBuilder;
    private String especialidad;

    public ArquitectoBuilder() {
        this.empleadoBuilder = new EmpleadoBuilder();
    }

    public EmpleadoBuilder getEmpleadoBuilder() {
        return empleadoBuilder;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public ArquitectoBuilder setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
        return this;
    }

    public ArquitectoBuilder setNombre(String nombre) {
        empleadoBuilder.setNombre(nombre);
        return this;
    }

    public ArquitectoBuilder setId(String id){
        empleadoBuilder.setId(id);
        return this;
    }

    public ArquitectoBuilder setSalario (double salario){
        empleadoBuilder.setSalario(salario);
        return this;
    }

    public ArquitectoBuilder setEdad (int edad){
        empleadoBuilder.setEdad(edad);
        return this;
    }

    public Arquitecto build (){
        return new Arquitecto(empleadoBuilder, especialidad);
    }
}
