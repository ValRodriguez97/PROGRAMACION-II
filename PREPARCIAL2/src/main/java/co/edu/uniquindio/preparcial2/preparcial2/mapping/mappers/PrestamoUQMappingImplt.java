package co.edu.uniquindio.preparcial2.preparcial2.mapping.mappers;

import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.ClienteDto;
import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.EmpleadoDto;
import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.ObjetoDto;
import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.PrestamoDto;
import co.edu.uniquindio.preparcial2.preparcial2.model.Cliente;
import co.edu.uniquindio.preparcial2.preparcial2.model.Empleado;
import co.edu.uniquindio.preparcial2.preparcial2.model.Objeto;
import co.edu.uniquindio.preparcial2.preparcial2.model.Prestamo;
import co.edu.uniquindio.preparcial2.preparcial2.service.IPrestamoUQMapping;

import java.util.ArrayList;
import java.util.List;

public class PrestamoUQMappingImplt implements IPrestamoUQMapping {

    @Override
    public List<ClienteDto> getClientesDto(List<Cliente> listClientes){
        if(listClientes==null){
            return null;
        }

        List<ClienteDto> clientesDto = new ArrayList<ClienteDto>(listClientes.size());
        for(Cliente cliente : listClientes){
            clientesDto.add(clienteToClienteDto(cliente));
        }
        return clientesDto;
    }

    @Override
    public ClienteDto clienteToClienteDto(Cliente cliente){
        return new ClienteDto(
               cliente.getCedula(),
               cliente.getNombre(),
               cliente.getApellido(),
                cliente.getEdad()
        );
    }

    @Override
    public Cliente clienteDtoToCliente(ClienteDto clienteDto){
        return Cliente.builder()
                .nombre(clienteDto.nombre())
                .apellido(clienteDto.apellido())
                .cedula(clienteDto.cedula())
                .edad(clienteDto.edad())
                .build();
    }

    @Override
    public List<EmpleadoDto> getEmpleadosDto(List<Empleado> listEmpleados){
        if(listEmpleados==null){
            return null;
        }

        List<EmpleadoDto> listEmpleadosDto = new ArrayList<>(listEmpleados.size());
        for(Empleado empleado : listEmpleados){
            listEmpleadosDto.add(empleadoToEmpleadoDto(empleado));
        }
        return listEmpleadosDto;
    }

    @Override
    public EmpleadoDto empleadoToEmpleadoDto(Empleado empleado){
        return new EmpleadoDto(
                empleado.getCedula(),
                empleado.getNombre(),
                empleado.getApellido(),
                empleado.getEdad()
        );
    }

    @Override
    public Empleado empleadoDtoToEmpleado(EmpleadoDto empleadoDto){
        return Empleado.builder()
                .nombre(empleadoDto.nombre())
                .apellido(empleadoDto.apellido())
                .cedula(empleadoDto.cedula())
                .edad(empleadoDto.edad())
                .build();
    }

    @Override
    public List<ObjetoDto> getObjetosDto (List<Objeto> listObjetos){
        if(listObjetos==null){
            return null;
        }

        List<ObjetoDto> listObjetosDto = new ArrayList<>(listObjetos.size());
        for(Objeto objeto : listObjetos){
            listObjetosDto.add(objetoToObjetoDto(objeto));
        }
        return listObjetosDto;
    }

    @Override
    public ObjetoDto objetoToObjetoDto(Objeto objeto){
        return new ObjetoDto(
                objeto.getNombre(),
                objeto.getPrestamoAsociado()
        );
    }

    @Override
    public Objeto objetoDtoToObjeto(ObjetoDto objetoDto){
        return Objeto.builder()
                .nombre(objetoDto.nombre())
                .prestamoAsociado(objetoDto.prestamoAsociado())
                .build();
    }

    @Override
    public List<PrestamoDto> getPrestamosDto(List<Prestamo> listPrestamos){
        if(listPrestamos == null){
            return null;
        }

        List<PrestamoDto> listPrestamosDto = new ArrayList<>(listPrestamos.size());
        for(Prestamo prestamo : listPrestamos){
            listPrestamosDto.add(prestamoToPrestamoDto(prestamo));
        }
        return listPrestamosDto;
    }

    @Override
    public PrestamoDto prestamoToPrestamoDto(Prestamo prestamo){
        return new PrestamoDto(
                prestamo.getNumeroPrestamo(),
                prestamo.getFechaPrestamo(),
                prestamo.getFechaEntrega(),
                prestamo.getDescripcion(),
                prestamo.getClienteAsociado(),
                prestamo.getEmpleadoAsociado()
        );
    }

    @Override
    public Prestamo prestamoDtoToPrestamo(PrestamoDto prestamoDto){
        return Prestamo.builder()
                .numeroPrestamo(prestamoDto.numeroPrestamo())
                .fechaPrestamo(prestamoDto.fechaPrestamo())
                .fechaEntrega(prestamoDto.fechaEntrega())
                .descripcion(prestamoDto.descripcion())
                .clienteAsociado(prestamoDto.clienteAsociado())
                .empleadoAsociado(prestamoDto.empleadoAsociado())
                .build();
    }
}
