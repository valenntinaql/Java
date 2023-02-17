package Ejercicios;

import Clases.Juego;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la cantidad de jugadores, esta debe estar entre 1 y 6");
        int cant = read.nextInt();
        Juego juego = new Juego(cant);
        while(!juego.finJuego()){
            juego.ronda();
        }
        System.out.println("El juego ha terminado");
    }
    
}
