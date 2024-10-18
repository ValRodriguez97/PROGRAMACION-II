package co.edu.uniquindio.preparciali.preparcialii.service;

import co.edu.uniquindio.preparciali.preparcialii.mapping.dto.ClienteDto;
import co.edu.uniquindio.preparciali.preparcialii.mapping.dto.ObjetoDto;
import co.edu.uniquindio.preparciali.preparcialii.model.Objeto;

import java.util.List;

public interface IPrestamosUQControllerService {
    Objeto readObjeto(String nombre);
    List<ObjetoDto> readObjetos();
    List<ClienteDto> readClientes();
}
