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

public class ProxyObject extends  Objeto{
    private boolean accesoPermitido;
    private Objeto objeto;

    public ProxyObject(String nombre, boolean accesoPermitido) {
        super(nombre);
        this.accesoPermitido = accesoPermitido;
        this.objeto = new Objeto(nombre);
    }

    @Override
    public void setPrestamoAsociado(Prestamo prestamo){
       verificarAcceso();
       objeto.setPrestamoAsociado(prestamo);
    }

    @Override
    public String getNombre() {
        return objeto.getNombre();
    }

    private void verificarAcceso(){
        if(!accesoPermitido){
            throw new UnsupportedOperationException("Accesso denegado");
        }
    }

    public Objeto getObjeto() {
        return objeto;
    }
}
