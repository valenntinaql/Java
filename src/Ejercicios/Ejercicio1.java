package Ejercicios;

import Clases.Perro;
import Clases.Persona;
import Servicio.ServicioPersonaPerro;

public class Ejercicio1 {

    public static void main(String[] args) {
        ServicioPersonaPerro spp = new ServicioPersonaPerro();
        Persona p1 = spp.crearPersona();
        System.out.println("---------------------------");
        Persona p2 = spp.crearPersona();
        System.out.println("---------------------------");
        Perro pr1 = spp.crearPerro();
        System.out.println("---------------------------");
        Perro pr2 = spp.crearPerro();
        System.out.println("---------------------------");
        p1.setPerro(pr1);
        p2.setPerro(pr2);
        spp.mostrarPersonaPerro(p1);
        System.out.println("---------------------------");
        spp.mostrarPersonaPerro(p2);
    }
    
}
