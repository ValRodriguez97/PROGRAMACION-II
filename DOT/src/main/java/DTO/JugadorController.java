package DTO;

public class JugadorController {

    public JugadorService jugadorService;

    public JugadorController(JugadorService jugadorService){
        this.jugadorService = jugadorService;
    }
    public static JugadorDTO toDTO(Jugador jugador){
        JugadorDTO jugadorddto = new JugadorDTO();
        jugadorddto.setNombre(jugador.getNombre());
        jugadorddto.setApellido(jugador.getApellido());
        jugadorddto.setApodoUsuario(jugador.getApodoUsuario());
        jugadorddto.setContraseña(jugador.getContraseña());
        jugadorddto.setCuentaBancaria(jugador.getCuentaBancaria());
        jugadorddto.setDireccion(jugador.getDireccion());
        jugadorddto.setEdad(jugador.getEdad());

        return jugadorddto;
    }
}
