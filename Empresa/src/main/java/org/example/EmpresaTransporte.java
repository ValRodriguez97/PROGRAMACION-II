package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class EmpresaTransporte {
    private Collection<Propietario> listaPropietarios;
    private Collection<VehiculoTransporte> listaVehiculoTransportes;
    private Collection<VehiculoCarga> listaVehiculoCargas;
    private Collection<Usuario> listaUsuarios;

    public EmpresaTransporte() {
        listaPropietarios = new ArrayList<>();
        listaVehiculoTransportes = new ArrayList<>();
        listaVehiculoCargas = new ArrayList<>();
        listaUsuarios = new ArrayList<>();
    }

    public Collection<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public Collection<VehiculoTransporte> getListaVehiculoTransportes() {
        return listaVehiculoTransportes;
    }

    public Collection<VehiculoCarga> getListaVehiculoCargas() {
        return listaVehiculoCargas;
    }

    public Collection<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
}
