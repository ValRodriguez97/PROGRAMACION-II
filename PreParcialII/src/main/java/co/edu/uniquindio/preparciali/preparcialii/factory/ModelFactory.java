package co.edu.uniquindio.preparciali.preparcialii.factory;

import co.edu.uniquindio.preparciali.preparcialii.mapping.dto.ClienteDto;
import co.edu.uniquindio.preparciali.preparcialii.mapping.mappers.PrestamoUQMappingImplt;
import co.edu.uniquindio.preparciali.preparcialii.model.PrestamoUQ;
import co.edu.uniquindio.preparciali.preparcialii.service.IModelFactoryService;

import java.util.List;

public class ModelFactory implements IModelFactoryService {
    private static ModelFactory instance;
    PrestamoUQ prestamoUQ;
    PrestamoUQMappingImplt mapper;

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    private ModelFactory() {
        mapper = new PrestamoUQMappingImplt();
       prestamoUQ = inicializarDatos();
    }

    public PrestamoUQ getPrestamoUQ() {
        return prestamoUQ;
    }

    @Override
    public List<ClienteDto> getClientes(){
        return mapper.getClientesDto(prestamoUQ.getListaClientes());
    }

    public static PrestamoUQ inicializarDatos() {
        PrestamoUQ prestamoUQ = new PrestamoUQ("Prestamos");
        return prestamoUQ;
    }
}
