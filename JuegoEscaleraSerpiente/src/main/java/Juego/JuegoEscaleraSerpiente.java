/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Juego;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author julimantilla
 */
public class JuegoEscaleraSerpiente {

    private ArrayList<Jugador> jugadores;
    private Tablero tablero;
    private ArrayList<Escalera> escaleras;
    private ArrayList<Serpiente> serpientes;

    public Tablero getTablero() {
        return tablero;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public JuegoEscaleraSerpiente(int tamaño) {
        tablero = new Tablero(tamaño);
        tablero.crearTablero();
        this.jugadores = new ArrayList<Jugador>();
        this.serpientes = new ArrayList<Serpiente>();
        this.escaleras = new ArrayList<Escalera>();
    }

    public void registrarJugador(String nombre){
        Jugador j = new Jugador(nombre);
        jugadores.add(j);
    }
    
    public void agregarEscalera(int a, int b){
        Escalera x = new Escalera(a,b);
        escaleras.add(x);
    }
    
    public void agregarSerpiente(int a, int b){
        Serpiente x = new Serpiente(a,b);
        serpientes.add(x);
    }
    
    public void actualizarTablero() {
    int tamaño = tablero.getTablero().length;

    switch (tamaño) {
        case 10 ->  {
            for (Escalera escalera : escaleras) {
                tablero.getTablero()[(escalera.getInicio() - 1) / 10][(escalera.getInicio() - 1) % 10] = "E" + (escaleras.indexOf(escalera) + 1);
                tablero.getTablero()[(escalera.getFin() - 1) / 10][(escalera.getFin() - 1) % 10] = "E" + (escaleras.indexOf(escalera) + 1);
            }

            for (Serpiente serpiente : serpientes) {
                tablero.getTablero()[(serpiente.getInicio() - 1) / 10][(serpiente.getInicio() - 1) % 10] = "S" + (serpientes.indexOf(serpiente) + 1);
                tablero.getTablero()[(serpiente.getFin() - 1) / 10][(serpiente.getFin() - 1) % 10] = "S" + (serpientes.indexOf(serpiente) + 1);
            }
        }
        case 13 ->  {
            for (Escalera escalera : escaleras) {
                tablero.getTablero()[(escalera.getInicio() - 1) / 13][(escalera.getInicio() - 1) % 13] = "E" + (escaleras.indexOf(escalera) + 1);
                tablero.getTablero()[(escalera.getFin() - 1) / 13][(escalera.getFin() - 1) % 13] = "E" + (escaleras.indexOf(escalera) + 1);
            }

            for (Serpiente serpiente : serpientes) {
                tablero.getTablero()[(serpiente.getInicio() - 1) / 13][(serpiente.getInicio() - 1) % 13] = "S" + (serpientes.indexOf(serpiente) + 1);
                tablero.getTablero()[(serpiente.getFin() - 1) / 13][(serpiente.getFin() - 1) % 13] = "S" + (serpientes.indexOf(serpiente) + 1);
            }
        }
        case 15 ->  {
            for (Escalera escalera : escaleras) {
                tablero.getTablero()[(escalera.getInicio() - 1) / 15][(escalera.getInicio() - 1) % 15] = "E" + (escaleras.indexOf(escalera) + 1);
                tablero.getTablero()[(escalera.getFin() - 1) / 15][(escalera.getFin() - 1) % 15] = "E" + (escaleras.indexOf(escalera) + 1);
            }

            for (Serpiente serpiente : serpientes) {
                tablero.getTablero()[(serpiente.getInicio() - 1) / 15][(serpiente.getInicio() - 1) % 15] = "S" + (serpientes.indexOf(serpiente) + 1);
                tablero.getTablero()[(serpiente.getFin() - 1) / 15][(serpiente.getFin() - 1) % 15] = "S" + (serpientes.indexOf(serpiente) + 1);
            }
        }
        default -> {
            }
    }
}
 
    public int cambiarTurno(int turno) {

        switch (jugadores.size()) {
            case 2 -> {
                if (turno == 1) {
                    return 2;
                } else {
                    return 1;
                }
            }
            case 3 -> {
                return switch (turno) {
                    case 1 ->
                        2;
                    case 2 ->
                        3;
                    default ->
                        1;
                };
            }

            default -> {
                return switch (turno) {
                    case 1 ->
                        2;
                    case 2 ->
                        3;
                    case 3 ->
                        4;
                    default ->
                        1;
                };
            }

        }
    }
    
    public String jugarFicha(int turno){
        
        Jugador aux = new Jugador();
        
        switch(turno){
            case 1 -> {
                aux = jugadores.get(0);
            }
            case 2 -> {
                aux = jugadores.get(1);
            }
            case 3 -> {
                aux = jugadores.get(2);
            }
            case 4 -> {
                aux = jugadores.get(3);
            }
        }
        
        int resultado = 0;
        String mensaje = "";
        
                resultado = aux.echarDado();

                if ((aux.getPosicion() + resultado) > Integer.parseInt(tablero.getTablero()[tablero.getTablero().length-1][tablero.getTablero().length-1])) {
                    mensaje = "El dado cayó: " + resultado + " y sobrepasa el tamaño del tablero, pierde el turno y debe volver a jugar"+"\n";
                } else {
                    aux.setPosicion(aux.getPosicion() + resultado);
                    mensaje = "El jugador: " + aux.getNombre() + " echó el dado, resultado: " + resultado + ", ahora su posición es: " + aux.getPosicion() + "\n";
                    mensaje += comprobarGanador(aux);
                    mensaje += comprobarReglas(aux);
                }
        return mensaje;   
    }
    
    public String comprobarReglas(Jugador aux){
        
        for (Escalera e : this.escaleras) {
            if (e.getInicio() == aux.getPosicion()) {
                aux.setPosicion(e.getFin());
                return "EL jugador: " + aux.getNombre() + " uso una escalera, la nueva posición: " + aux.getPosicion() + "\n";
            }
        }

        for (Serpiente s : this.serpientes) {
            if (s.getInicio()== aux.getPosicion()) {
                aux.setPosicion(s.getFin());
                return "EL jugador: " + aux.getNombre() + " fue mordido por una serpiente, la nueva posición: " + aux.getPosicion() + "\n";
            }
        }
        return "";  
    }
    
    public String comprobarGanador(Jugador aux){
           
        switch (tablero.getTablero().length) {
            case 10 -> {
                if (aux.getPosicion() == 100) {
                    JOptionPane.showInternalMessageDialog(null, "La Partida ha finalizado, ganador: " + aux.getNombre());
                    return "El jugador " + aux.getNombre() + " ha ganado el juego";
                }
            }
            case 13 -> {
                if (aux.getPosicion() == 169) {
                    JOptionPane.showInternalMessageDialog(null, "La Partida ha finalizado, ganador: " + aux.getNombre());
                    return "El jugador " + aux.getNombre() + " ha ganado el juego";
                }
            }
            case 15 -> {
                if (aux.getPosicion() == 225) {
                    JOptionPane.showInternalMessageDialog(null, "La Partida ha finalizado, ganador: " + aux.getNombre());
                    return "El jugador " + aux.getNombre() + " ha ganado el juego";
                }
            }
            default -> {
            }
        }
        return "";
    }


    
    
    
    
    
}
