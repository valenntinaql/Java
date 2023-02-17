package Clases;

public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = true;
    }
    
    public void disparo (RevolverdeAgua r){
        System.out.println("El " + nombre + " agarra la pistola");
        if(r.Mojar()){
            this.mojado = false;
            System.out.println("El " + nombre + " queda eliminado");
        } else {
            System.out.println("El " + nombre + " sigue jugando");
        }
    }
    
    public boolean isMojado(){
        return mojado;
    }
}
