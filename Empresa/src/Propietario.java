public class Propietario {
    private final String nombre;
    private final String cedula;
    private final String email;
    private final String celular;
    public Propietario(String nombre, String cedula, String email, String celular){
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.celular = celular;

    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula(){
        return cedula;
    }

    public String getEmail(){
        return email;
    }

    public String getCelular() {
        return celular;
    }


}
