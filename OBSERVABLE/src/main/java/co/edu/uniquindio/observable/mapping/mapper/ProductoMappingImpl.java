package co.edu.uniquindio.observable.mapping.mapper;

import co.edu.uniquindio.observable.mapping.dto.ProductoDto;
import co.edu.uniquindio.observable.model.Producto;
import co.edu.uniquindio.observable.services.IProductoMapping;

public class ProductoMappingImpl implements IProductoMapping {

    @Override
    public ProductoDto productoToProductoDto(Producto producto) {
        return new ProductoDto(
                producto.getCantidad()
        );
    }

    @Override
    public Producto productoDtoToProducto(ProductoDto productoDto) {
        return new Producto(productoDto.cantidad());
    }
}
