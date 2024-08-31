package co.edu.uniquindio.Builder;

public class Arquitecto extends Empleado {
    private String especialidad;

    public Arquitecto(EmpleadoBuilder empleadoBuilder, String especialidad) {
        super(empleadoBuilder);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public static ArquitectoBuilder arquitectoBuilderbuilder (){
        return new ArquitectoBuilder();
    }
}
