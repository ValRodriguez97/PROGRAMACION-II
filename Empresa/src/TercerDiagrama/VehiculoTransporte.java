package TercerDiagrama;

import java.util.ArrayList;
import java.util.Collection;

public class VehiculoTransporte {
    private Collection<Usuario> listaUsuariosAsociados;
    private int maxPasajeros;

    public VehiculoTransporte(int maxPasajeros) {
        this.maxPasajeros = maxPasajeros;
        this.listaUsuariosAsociados = new ArrayList<Usuario>();
    }
}
