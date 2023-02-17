package Clases;

public class Carta {
    private int numero;
    private String palo;

    public Carta() {
    }

    public static  final String [] Palos={"ESPADAS", "OROS", "COPAS", "BASTOS"};
    public static final int LimitePalo=12;
    
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "numero=" + numero + ", palo=" + palo;
    }
    
    
}
