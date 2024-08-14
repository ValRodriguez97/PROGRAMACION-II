package PrimerDiagrama;

import java.util.ArrayList;
import java.util.Collection;

public class EmpresaTransporte {
    private Collection<Propietario> propietarios;
    private Collection<Usuario> usuarios;
    private Collection<VehiculoCarga> vehiculosCarga;
    private Collection<VehiculoTransporte> vehiculosTransporte;

    public EmpresaTransporte() {
        this.propietarios = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.vehiculosCarga = new ArrayList<>();
        this.vehiculosTransporte = new ArrayList<>();
    }

}
