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

    public void agregarPropietario(Propietario propietario) {
        listaPropietarios.add(propietario);
    }

    public void agregarVehiculoTransporte(VehiculoTransporte vehiculoTransporte) {
        listaVehiculoTransportes.add(vehiculoTransporte);
    }

    public void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public void agregarVehiculoCarga(VehiculoCarga vehiculoCarga) {
        listaVehiculoCargas.add(vehiculoCarga);
    }

    public VehiculoTransporte consultarVehiculo (String placa){
        for (VehiculoTransporte vehiculoTransporte : listaVehiculoTransportes){
            if (vehiculoTransporte.getPlaca().equals(placa)){
                return vehiculoTransporte;
            }
        }
        return null;
    }

}
