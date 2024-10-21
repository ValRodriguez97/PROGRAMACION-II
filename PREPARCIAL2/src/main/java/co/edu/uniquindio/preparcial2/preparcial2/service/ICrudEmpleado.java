package co.edu.uniquindio.preparcial2.preparcial2.service;

import co.edu.uniquindio.preparcial2.preparcial2.model.Empleado;

import java.util.List;

public interface ICrudEmpleado {
    boolean createEmpleado(Empleado empleado);
    Empleado readEmpleado(String cedula);
    boolean updateEmpleado(String cedula,Empleado empleado);
    boolean deleteEmpleado(String cedula);
    List<Empleado> listEmpleados();
    boolean verificarEmpleadoExistente(String cedula);
}
