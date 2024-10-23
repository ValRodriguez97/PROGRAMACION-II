package co.edu.uniquindio.preparcial2.preparcial2.model;

import co.edu.uniquindio.preparcial2.preparcial2.service.ICrudCliente;
import co.edu.uniquindio.preparcial2.preparcial2.service.ICrudEmpleado;
import co.edu.uniquindio.preparcial2.preparcial2.service.ICrudObjeto;
import co.edu.uniquindio.preparcial2.preparcial2.service.ICrudPrestamo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrestamoUQ implements ICrudCliente, ICrudPrestamo, ICrudEmpleado, ICrudObjeto {
    private String nombre;
    private List<Cliente> listaClientes;
    private List<Prestamo> listaPrestamos ;
    private List<Empleado> listaEmpleados;
    private List<Objeto> listaObjetos;


    public PrestamoUQ (String nombre){
        this.nombre = nombre;
        this.listaClientes = new ArrayList<>();
        this.listaPrestamos = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
        this.listaObjetos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Objeto> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(List<Objeto> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }

    @Override
    public boolean createObjeto(Objeto newObjeto){
        if (newObjeto  != null) {
            getListaObjetos().add(newObjeto);
            return true;
        }
        return false;
    }

    @Override
    public Objeto readObjeto(String nombre){
        Objeto objeto = verificarObjeto(nombre);
        if(objeto != null) {
            return objeto;
        }
        return null;
    }

    @Override
    public boolean updateObjeto(String nombre, Objeto objeto){
        Objeto objetoExistente = verificarObjeto(nombre);
        if(objetoExistente != null){
            objetoExistente.setNombre(objeto.getNombre());
            objetoExistente.setPrestamoAsociado(objeto.getPrestamoAsociado());
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteObjeto(String nombre){
        Objeto objeto = verificarObjeto(nombre);
        if(objeto != null) {
            getListaObjetos().remove(objeto);
            return true;
        }
        return false;
    }

    @Override
    public List<Objeto> listObjetos(){
        return new ArrayList<>(listaObjetos);
    }

    @Override
    public boolean verificarObjetoExistente(String nombre){
        if(verificarObjeto(nombre) == null){
            return false;
        }
        return true;
    }

    public Objeto verificarObjeto(String nombre){
        Objeto objetoExistente = null;
        for (Objeto objeto : listaObjetos){
            if (objeto.getNombre().equals(nombre)){
                objetoExistente = objeto;
                break;
            }
        }
        return objetoExistente;
    }

    @Override
    public boolean createPrestamo(Prestamo prestamo){
        if (prestamo != null) {
            getListaPrestamos().add(prestamo);
            prestamo.getClienteAsociado().addPrestamo(prestamo);
            prestamo.getEmpleadoAsociado().agregarPrestamo(prestamo);
            for (Objeto objeto : prestamo.getListObjetosAsociados()){
                objeto.setPrestamoAsociado(prestamo);
            }
            return true;
        }
        return false;
    }

    @Override
    public Prestamo readPrestamo (String numeroPrestamo){
        Prestamo prestamoExistente = verificarPrestamo(numeroPrestamo);
        if(prestamoExistente != null){
            return prestamoExistente;
        }
        return null;
    }

    @Override
    public boolean updatePrestamo (String numeroPrestamo, Prestamo prestamo){
        Prestamo prestamoExistente = verificarPrestamo(numeroPrestamo);
        if (prestamoExistente != null){
            prestamoExistente.setNumeroPrestamo(prestamo.getNumeroPrestamo());
            prestamoExistente.setFechaPrestamo(prestamo.getFechaPrestamo());
            prestamoExistente.setFechaEntrega(prestamo.getFechaEntrega());
            prestamoExistente.setDescripcion(prestamo.getDescripcion());
            prestamoExistente.setClienteAsociado(prestamo.getClienteAsociado());
            prestamoExistente.setEmpleadoAsociado(prestamo.getEmpleadoAsociado());
            return true;
        }
        return false;
    }

    @Override
    public boolean deletePrestamo(String numeroPrestamo){
        Prestamo prestamoExistente = verificarPrestamo(numeroPrestamo);
        if(prestamoExistente != null){
            getListaPrestamos().remove(prestamoExistente);
            return true;
        }
        return false;
    }

    @Override
    public List<Prestamo> listPrestamos(){
        return new ArrayList<>(listaPrestamos);
    }

    @Override
    public boolean verificarPrestamoExistente(String numeroPrestamo){
        if(verificarPrestamo(numeroPrestamo) == null){
            return false;
        }
        return true;
    }

    public Prestamo verificarPrestamo(String numeroPrestamo){
        Prestamo prestamoExistente = null;
        for (Prestamo prestamo : listaPrestamos){
            if (prestamo.getNumeroPrestamo().equals(numeroPrestamo)){
                prestamoExistente = prestamo;
                break;
            }
        }
        return prestamoExistente;
    }

    @Override
    public boolean createCliente(Cliente cliente){
        if (cliente != null) {
            getListaClientes().add(cliente);
            return true;
        }
        return false;
    }

    @Override
    public Cliente readCliente(String cedula){
        Cliente clienteExistente = verificarCliente(cedula);
        if (clienteExistente != null){
            return clienteExistente;
        }
        return null;
    }

    @Override
    public boolean updateCliente(String cedula, Cliente cliente){
        Cliente clienteExistente = verificarCliente(cedula);
        if (clienteExistente != null){
            clienteExistente.setCedula(cliente.getCedula());
            clienteExistente.setNombre(cliente.getNombre());
            clienteExistente.setApellido(cliente.getApellido());
            clienteExistente.setEdad(cliente.getEdad());
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteCliente(String cedula){
        Cliente clienteExistente = verificarCliente(cedula);
        if (clienteExistente != null){
            getListaClientes().remove(clienteExistente);
            return true;
        }
        return false;
    }

    @Override
    public List<Cliente> listClientes(){
        return new ArrayList<>(listaClientes);
    }

    @Override
    public boolean verificarClienteExistente(String cedula){
        if (verificarCliente(cedula) == null){
            return false;
        }
        return true;
    }

    public Cliente verificarCliente(String cedula){
        Cliente clienteExistente = null;
        for (Cliente cliente : getListaClientes()){
            if (cliente.getCedula().equals(cedula)){
                clienteExistente = cliente;
                break;
            }
        }
        return clienteExistente;
    }

    @Override
    public boolean createEmpleado(Empleado empleado){
        if (empleado != null) {
            getListaEmpleados().add(empleado);
            return true;
        }
        return false;
    }

    @Override
    public Empleado readEmpleado(String cedula){
        Empleado empleadoExistente = verificarEmpleado(cedula);
        if (empleadoExistente != null){
            return empleadoExistente;
        }
        return null;
    }

    @Override
    public boolean updateEmpleado(String cedula, Empleado empleado){
        Empleado  empleadoExistente = verificarEmpleado(cedula);
        if (empleadoExistente != null){
            empleadoExistente.setNombre(empleado.getNombre());
            empleadoExistente.setApellido(empleado.getApellido());
            empleadoExistente.setCedula(empleado.getCedula());
            empleadoExistente.setEdad(empleado.getEdad());
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteEmpleado(String cedula){
        Empleado  empleadoExistente = verificarEmpleado(cedula);
        if (empleadoExistente != null){
            getListaEmpleados().remove(empleadoExistente);
            return true;
        }
        return false;
    }

    @Override
    public List<Empleado> listEmpleados(){
        return new ArrayList<>(listaEmpleados);
    }

    @Override
    public boolean verificarEmpleadoExistente(String cedula){
        if (verificarEmpleado(cedula) == null){
            return true;
        }
        return false;
    }

    public Empleado verificarEmpleado(String cedula){
        Empleado empleadoExistente = null;
        for (Empleado empleado : getListaEmpleados()){
            if (empleado.getCedula().equals(cedula)){
                empleadoExistente = empleado;
                break;
            }
        }
        return empleadoExistente;
    }

    public List<Objeto> objetosMasPrestados(int cantidad){
        Map<Objeto, Integer> contarPrestamos = new HashMap<>();

        for(Prestamo prestamo : listaPrestamos){
            for(Objeto objeto : prestamo.getListObjetosAsociados()){
                contarPrestamos.put(objeto, contarPrestamos.getOrDefault(objeto, 0) + 1);
            }
        }

        return contarPrestamos.entrySet().stream().filter(entry -> entry.getValue() > cantidad).map(Map.Entry::getKey).collect(Collectors.toList());
    }

    public List<Cliente> getClientesConVariosPrestamos( int minimoPrestamos, int maximoPrestamos){
        return listaClientes.stream().filter(cliente -> cliente.totalPrestamos() > minimoPrestamos && cliente.totalPrestamos() <= maximoPrestamos ).collect(Collectors.toList());
    }

    public void objetosDisponible(){
        int disponibles = 0;
        int nodisponibles = 0;

        for(Objeto objeto : listaObjetos){
            if (objeto.isDisponible()){
                disponibles++;
            } else {
                nodisponibles++;
            }
        }

        System.out.println("Disponibles: " + disponibles);
        System.out.println("Nodisponibles: " + nodisponibles);
    }

    public int totalPrestamos(){
        return getListaPrestamos().size();
    }

}
