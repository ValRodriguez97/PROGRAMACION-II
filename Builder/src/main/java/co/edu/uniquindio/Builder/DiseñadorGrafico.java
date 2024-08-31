package co.edu.uniquindio.Builder;

public class DiseñadorGrafico extends Empleado {
    private String tipoDiseño;

    public DiseñadorGrafico (EmpleadoBuilder empleadoBuilderr, String tipoDiseño) {
        super(empleadoBuilderr);
        this.tipoDiseño = tipoDiseño;
    }

    public String getTipoDiseño(){
        return tipoDiseño;
    }

    public static DiseñadorGraficoBuilder diseñadorGraficoBuilderbuilder() {
        return new DiseñadorGraficoBuilder();
    }
}
