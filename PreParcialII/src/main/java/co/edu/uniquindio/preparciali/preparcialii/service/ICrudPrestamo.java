package co.edu.uniquindio.preparciali.preparcialii.service;

import co.edu.uniquindio.preparciali.preparcialii.model.Cliente;
import co.edu.uniquindio.preparciali.preparcialii.model.Empleado;
import co.edu.uniquindio.preparciali.preparcialii.model.Prestamo;

import java.time.LocalDate;
import java.util.List;

public interface ICrudPrestamo {
    boolean createPrestamo(Prestamo prestamo);
    Prestamo readPrestamo(String numeroPrestamo);
    boolean updatePrestamo(String numeroPrestamo, Prestamo prestamo);
    boolean deletePrestamo(String numeroPrestamo);
    List<Prestamo> listPrestamos();
    boolean verificarPrestamoExistente(String numeroPrestamo);
}
