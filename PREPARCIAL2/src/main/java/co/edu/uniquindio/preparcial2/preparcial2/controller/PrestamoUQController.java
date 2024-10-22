package co.edu.uniquindio.preparcial2.preparcial2.controller;

import co.edu.uniquindio.preparcial2.preparcial2.factory.ModelFactory;
import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.ClienteDto;
import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.EmpleadoDto;
import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.ObjetoDto;
import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.PrestamoDto;
import co.edu.uniquindio.preparcial2.preparcial2.model.Prestamo;
import co.edu.uniquindio.preparcial2.preparcial2.service.IPrestamoUQControllerService;

import java.util.List;

public class PrestamoUQController implements IPrestamoUQControllerService {
    ModelFactory modelFactory;

    public PrestamoUQController(ModelFactory modelFactory) {
        this.modelFactory = ModelFactory.getInstance();
    }

    @Override
    public List<PrestamoDto> getPrestamosDto(){
        return modelFactory.getPrestamos();
    }

    @Override
    public boolean addPrestamo(PrestamoDto prestamoDto) {
         return modelFactory.addPrestamo(prestamoDto);
    }

    @Override
    public boolean updatePrestamo(String numeroPrestamo, PrestamoDto prestamoDto) {
        return modelFactory.updatePrestamo(numeroPrestamo, prestamoDto);
    }

    @Override
    public boolean deletePrestamo(String numeroPrestamo) {
        return modelFactory.deletePrestamo(numeroPrestamo);
    }

    @Override
    public List<ClienteDto> getClientesDto(){
        return modelFactory.getClientes();
    }

    @Override
    public boolean addCliente(ClienteDto clienteDto){
        return modelFactory.addCliente(clienteDto);
    }

    @Override
    public boolean updateCliente(String cedula, ClienteDto clienteDto){
        return modelFactory.updateCliente(cedula, clienteDto);
    }

    @Override
    public boolean deleteCliente(String cedula){
        return modelFactory.deleteCliente(cedula);
    }

    @Override
    public List<EmpleadoDto> getEmpleadosDto(){
        return  modelFactory.getEmpleados();
    }

    @Override
    public boolean addEmpleado(EmpleadoDto empleadoDto) {
        return modelFactory.addEmpleado(empleadoDto);
    }

    @Override
    public boolean updateEmpleado(String cedula, EmpleadoDto empleadoDto){
        return modelFactory.updateEmpleado(cedula, empleadoDto);
    }

    @Override
    public boolean deleteEmpleado(String cedula){
        return modelFactory.deleteEmpleado(cedula);
    }

    @Override
    public List<ObjetoDto> getObjetosDto(){
        return modelFactory.getObjetos();
    }

    @Override
    public boolean addObjeto(ObjetoDto objetoDto){
        return modelFactory.addObjeto(objetoDto);
    }

    @Override
    public boolean updateObjeto(String nombre, ObjetoDto objetoDto){
        return modelFactory.updateObjeto(nombre, objetoDto);
    }

    @Override
    public boolean deleteObjeto(String nombre){
        return modelFactory.deleteObjeto(nombre);    }
}
