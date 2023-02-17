package Clases;

public class Juego {
    private Jugador[] jugadores;
    private RevolverdeAgua r;
    
    public Juego(int numJugadores) {
        jugadores = new Jugador[comprobarJugadores(numJugadores)]; 
        crearJugadores();
        r = new RevolverdeAgua();
    }
    
    private int comprobarJugadores(int numJugadores) {
        if (!(numJugadores >= 1 && numJugadores <= 6)) {
            numJugadores = 6;
        }
        return numJugadores;
    }
    
    private void crearJugadores() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador(i + 1);
        }
    }
 
    public boolean finJuego() {
        for (int i = 0; i < jugadores.length; i++) {
            if (!jugadores[i].isMojado()) {
                return true;
            }
        }
        return false;
    }

    public void ronda() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].disparo(r);
        }
    }
     
    public void rondaV2() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].disparo(r);
            if(!jugadores[i].isMojado()){
                return;
            }
        }
    }
}
