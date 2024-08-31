package co.edu.uniquindio.Builder;

public class DiseñadorGraficoBuilder {
    private EmpleadoBuilder empleadoBuilder;
    private String tipoDiseño;

    public DiseñadorGraficoBuilder() {
        this.empleadoBuilder = new EmpleadoBuilder();
    }

    public EmpleadoBuilder getEmpleadoBuilder() {
        return empleadoBuilder;
    }

    public String getTipoDiseño(){
        return tipoDiseño;
    }

    public DiseñadorGraficoBuilder setTipoDiseño(String tipoDiseño) {
        this.tipoDiseño = tipoDiseño;
        return this;
    }

    public DiseñadorGraficoBuilder setNombre(String nombre) {
        empleadoBuilder.setNombre(nombre);
        return this;
    }

    public DiseñadorGraficoBuilder setId(String id){
        empleadoBuilder.setId(id);
        return this;
    }

    public DiseñadorGraficoBuilder setSalario (double salario){
        empleadoBuilder.setSalario(salario);
        return this;
    }

    public DiseñadorGraficoBuilder setEdad (int edad){
        empleadoBuilder.setEdad(edad);
        return this;
    }

    public DiseñadorGrafico build (){
        return new DiseñadorGrafico(empleadoBuilder, tipoDiseño);
    }
}
