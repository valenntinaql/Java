package Clases;

public class Baraja {
    private Carta cartas[];
    private int possiguuientecarta;
    
    public static final int NumCartas=40;

    public Baraja() {
    }

    public Baraja(Carta[] cartas, int possiguuientecarta) {
        this.cartas = new Carta[NumCartas];
        this.possiguuientecarta = 0;
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }

    public int getPossiguuientecarta() {
        return possiguuientecarta;
    }

    public void setPossiguuientecarta(int possiguuientecarta) {
        this.possiguuientecarta = possiguuientecarta;
    }
    
    
}
