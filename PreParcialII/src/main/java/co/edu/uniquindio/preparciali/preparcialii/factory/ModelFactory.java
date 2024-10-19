package co.edu.uniquindio.preparciali.preparcialii.factory;

import co.edu.uniquindio.preparciali.preparcialii.mapping.dto.ClienteDto;
import co.edu.uniquindio.preparciali.preparcialii.mapping.dto.EmpleadoDto;
import co.edu.uniquindio.preparciali.preparcialii.mapping.dto.ObjetoDto;
import co.edu.uniquindio.preparciali.preparcialii.mapping.dto.PrestamoDto;
import co.edu.uniquindio.preparciali.preparcialii.mapping.mappers.PrestamoUQMappingImplt;
import co.edu.uniquindio.preparciali.preparcialii.model.*;
import co.edu.uniquindio.preparciali.preparcialii.service.IModelFactoryService;

import java.time.LocalDate;
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

    @Override
    public boolean addCliente(ClienteDto clienteDto) {
        if(prestamoUQ.verificarClienteExistente(clienteDto.cedula())){
            Cliente newCliente = mapper.clienteDtoToCliente(clienteDto);
            return prestamoUQ.createCliente(newCliente);
        }
        return false;
    }

    @Override
    public boolean deleteCliente (String cedula){
        return prestamoUQ.deleteCliente(cedula);
    }

    @Override
    public boolean updateCliente (String cedula, ClienteDto clienteDto) {
        if(!prestamoUQ.verificarClienteExistente(cedula)){
            Cliente newCliente = mapper.clienteDtoToCliente(clienteDto);
            prestamoUQ.updateCliente(cedula, newCliente);
            return true;
        }
        return false;
    }

    @Override
    public List<EmpleadoDto> getEmpleados(){
        return mapper.getEmpleadosDto(prestamoUQ.getListaEmpleados());
    }

    @Override
    public boolean addEmpleado(EmpleadoDto empleadoDto) {
        if(prestamoUQ.verificarEmpleadoExistente(empleadoDto.cedula())){
            Empleado newEmpleado = mapper.empleadoDtoToEmpleado(empleadoDto);
            return prestamoUQ.createEmpleado(newEmpleado);
        }
        return false;
    }

    @Override
    public boolean deleteEmpleado(String cedula){
        return prestamoUQ.deleteEmpleado(cedula);
    }

    @Override
    public boolean updateEmpleado (String cedula, EmpleadoDto empleadoDto) {
        if(!prestamoUQ.verificarEmpleadoExistente(cedula)){
            Empleado newEmpleado = mapper.empleadoDtoToEmpleado(empleadoDto);
            prestamoUQ.updateEmpleado(cedula, newEmpleado);
            return true;
        }
        return false;
    }

    @Override
    public List<ObjetoDto> getObjetos(){
        return mapper.getObjetosDto(prestamoUQ.getListaObjetos());
    }

    @Override
    public boolean addObjeto(ObjetoDto objetoDto) {
        if(prestamoUQ.verificarObjetoExistente(objetoDto.nombre())){
            Objeto newObjeto = mapper.objetoDtoToObjeto(objetoDto);
            return prestamoUQ.createObjeto(newObjeto);
        }
        return false;
    }

    @Override
    public boolean deleteObjeto(String nombre){
        return prestamoUQ.deleteObjeto(nombre);
    }

    @Override
    public boolean updateObjeto (String nombre, ObjetoDto objetoDto) {
        if(!prestamoUQ.verificarObjetoExistente(nombre)){
            Objeto newObjeto = mapper.objetoDtoToObjeto(objetoDto);
            prestamoUQ.updateObjeto(nombre, newObjeto);
            return true;
        }
        return false;
    }

    @Override
    public List<PrestamoDto> getPrestamos(){
        return mapper.getPrestamosDto(prestamoUQ.getListaPrestamos());
    }

    @Override
    public boolean addPrestamo (PrestamoDto prestamoDto) {
        if(!prestamoUQ.verificarPrestamoExistente(prestamoDto.numeroPrestamo())){
            Prestamo newPrestamo = mapper.prestamoDtoToPrestamo(prestamoDto);
            return prestamoUQ.createPrestamo(newPrestamo);
        }
        return false;
    }

    @Override
    public boolean deletePrestamo (String numeroPrestamo){
        return prestamoUQ.deletePrestamo(numeroPrestamo);
    }

    @Override
    public boolean updatePrestamo(String numeroPrestamo, PrestamoDto prestamoDto){
        if(!prestamoUQ.verificarPrestamoExistente(numeroPrestamo)){
            Prestamo newPrestamo = mapper.prestamoDtoToPrestamo(prestamoDto);

            prestamoUQ.updatePrestamo(numeroPrestamo, newPrestamo);
            return true;
        }
        return true;
    }

    public static PrestamoUQ inicializarDatos() {
        PrestamoUQ prestamoUQ = new PrestamoUQ("Prestamos");
        Cliente cliente1 = Cliente.builder()
                .cedula("1234")
                .nombre("Valentina")
                .apellido("Rodriguez")
                .edad("19")
                .build();

        Cliente cliente2 = Cliente.builder()
                .cedula("81892")
                .nombre("Jose")
                .apellido("Suarez")
                .edad("31")
                .build();

        //Empleados
        Empleado empleado1 = Empleado.builder()
                .cedula("81721")
                .nombre("Carlos")
                .apellido("Londoño")
                .edad("61")
                .build();

        Empleado empleado2 = Empleado.builder()
                .cedula("6719")
                .nombre("Sara")
                .apellido("Velasquez")
                .edad("34")
                .build();

        //Prestamos
        Prestamo prestamo1 = Prestamo.builder()
                .numeroPrestamo("1234")
                .fechaPrestamo(LocalDate.now())
                .fechaEntrega(LocalDate.of(2024, 11, 02))
                .descripcion("adiao")
                .clienteAsociado(cliente1)
                .empleadoAsociado(empleado2)
                .build();


        //Objetos
        Objeto objeto1 = Objeto.builder()
                .nombre("TV Samsung")
                .prestamo(prestamo1)
                .build();
        return prestamoUQ;
    }
}
