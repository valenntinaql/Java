package Clases;

public class RevolverdeAgua {
    private  int posicionact, posicionagua;
    
    public RevolverdeAgua(){
        posicionact = ((int) (Math.random() * (6 - 1)) + 1);
        posicionagua = ((int) (Math.random() * (6 - 1)) + 1);
        System.out.println("El revolver se ha llenado");
    }
    
    public boolean Mojar(){
        boolean ver = false;
        if(posicionagua == posicionact){
            ver = true;
            System.out.println("Se disparó el chorro de agua");
        } else{
            System.out.println("No ha salido agua");
            siguienteChoro();
        }
        return ver;
    }
    
    public void siguienteChoro(){
        if (posicionact == 6){
            posicionact = 1;
        } else {
            posicionact++;
        }
        System.out.println("Pasó a la siguiente posición");
    }
    
    public void Mostrar(RevolverdeAgua r1){
        System.out.println("La posición actual es " + posicionact + ", la posición del chorro es: " + posicionagua);
    }
}
