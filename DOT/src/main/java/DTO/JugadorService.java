package DTO;

import java.util.ArrayList;
import java.util.List;

public class JugadorService {

    private List<JugadorDTO> jugadores = new ArrayList<>();

    public void añadirJugador(JugadorDTO jugadorDTO){
        jugadores.add(jugadorDTO);
    }

    public List<JugadorDTO> getJugadorDTOs(){
        return jugadores;
    }


}
