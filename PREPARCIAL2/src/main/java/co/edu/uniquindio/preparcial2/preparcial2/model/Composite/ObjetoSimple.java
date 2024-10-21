package co.edu.uniquindio.preparcial2.preparcial2.model.Composite;
//Composite
public class ObjetoSimple extends  ObjectComponent{
    private String nombre;

    public ObjetoSimple(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getCosto(){
        return 10;
    }
}
