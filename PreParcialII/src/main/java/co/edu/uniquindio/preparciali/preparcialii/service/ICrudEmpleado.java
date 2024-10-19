package co.edu.uniquindio.preparciali.preparcialii.service;

import co.edu.uniquindio.preparciali.preparcialii.model.Empleado;

import java.util.List;

public interface ICrudEmpleado {
    boolean createEmpleado(Empleado empleado);
    Empleado readEmpleado(String cedula);
    boolean updateEmpleado(String cedula, Empleado empleado);
    boolean deleteEmpleado(String cedula);
    List<Empleado> listEmpleados();
    boolean verificarEmpleadoExistente(String cedula);
}
