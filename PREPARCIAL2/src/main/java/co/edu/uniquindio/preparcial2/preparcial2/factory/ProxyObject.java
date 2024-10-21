package co.edu.uniquindio.preparcial2.preparcial2.factory;

import co.edu.uniquindio.preparcial2.preparcial2.mapping.dto.PrestamoDto;
import co.edu.uniquindio.preparcial2.preparcial2.model.Cliente;
import co.edu.uniquindio.preparcial2.preparcial2.model.Empleado;
import co.edu.uniquindio.preparcial2.preparcial2.model.Objeto;
import co.edu.uniquindio.preparcial2.preparcial2.model.Prestamo;
import org.controlsfx.control.PropertySheet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ProxyObject {
    private Objeto objeto;
    private String nombre;
    private List<String> clientesAutorizados;

    public ProxyObject(String nombre){
        this.nombre = nombre;
        this.objeto = new Objeto(nombre, clientesAutorizados);
        this.clientesAutorizados = new ArrayList<>();
    }
}
