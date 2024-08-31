package co.edu.uniquindio.Builder;

public class Ingeniero  extends Empleado {
    private String tipoIngeniero;

    public Ingeniero(EmpleadoBuilder empleadoBuilder, String tipoIngeniero) {
        super(empleadoBuilder);
        this.tipoIngeniero = tipoIngeniero;
    }

    public String getTipoIngeniero() {
        return tipoIngeniero;
    }

    public static IngenieroBuilder ingenieroBuilderbuilder() {
        return new IngenieroBuilder();
    }
}
