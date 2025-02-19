package co.edu.uniquindio.observable.model;

import co.edu.uniquindio.observable.services.ICrudProducto;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements ICrudProducto {
    List<Producto> listaProductos;

    public Cliente() {
        listaProductos = new ArrayList<Producto>();
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    @Override
    public boolean updateStock(Producto producto) {
        producto.setCantidad(producto.getCantidad() + 1);
        return true;
    }

}
