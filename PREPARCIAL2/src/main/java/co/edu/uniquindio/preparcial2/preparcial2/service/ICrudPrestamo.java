package co.edu.uniquindio.preparcial2.preparcial2.service;

import co.edu.uniquindio.preparcial2.preparcial2.model.Prestamo;

import java.util.List;

public interface ICrudPrestamo {
    boolean createPrestamo(Prestamo prestamo);
    Prestamo readPrestamo(String numeroPrestamo);
    boolean updatePrestamo(String numeroPrestamo, Prestamo prestamo);
    boolean deletePrestamo(String numeroPrestamo);
    List<Prestamo> listPrestamos();
    boolean verificarPrestamoExistente(String numeroPrestamo);
}
