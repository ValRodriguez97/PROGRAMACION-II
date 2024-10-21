package co.edu.uniquindio.preparcial2.preparcial2.factory;

import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.PrestamoDto;
import co.edu.uniquindio.preparcial2.preparcial2.model.Cliente;
import co.edu.uniquindio.preparcial2.preparcial2.model.Empleado;
import co.edu.uniquindio.preparcial2.preparcial2.model.Objeto;
import co.edu.uniquindio.preparcial2.preparcial2.model.Prestamo;
import co.edu.uniquindio.preparcial2.preparcial2.service.IObjeto;
import org.controlsfx.control.PropertySheet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ProxyObject implements IObjeto {
    private Objeto objeto;

    public ProxyObject(Objeto objeto) {
        this.objeto = objeto;
    }

    @Override
    public String getNombre(){
        return objeto.getNombre();
    }

    @Override
    public void prestar(Cliente cliente){
        if(accesoCliente(cliente)){
            objeto.prestar(cliente);
            registrarAcceso(cliente);
        } else {
            System.out.println("Se ha denegado el prestamo del objeto, el cliente no tiene acceso");
        }
    }

    private boolean accesoCliente(Cliente cliente){
        return cliente.getListPrestamosAsociados().size() < 3;
    }

    private void registrarAcceso(Cliente cliente){
        System.out.println("El cliente " + cliente.getNombre() + " ha solicitado el prestamo del objeto " + objeto.getNombre());
    }

    @Override
    public void devolver(){
        objeto.devolver();
    }

}
