package co.edu.uniquindio.observable.services;

import co.edu.uniquindio.observable.mapping.dto.ProductoDto;
import co.edu.uniquindio.observable.model.Producto;

public interface IProductoMapping {

    ProductoDto productoToProductoDto(Producto producto);
    Producto productoDtoToProducto(ProductoDto productoDto);
    }

