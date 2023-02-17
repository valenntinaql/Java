package Servicio;

import Clases.Perro;
import Clases.Persona;
import java.util.Locale;
import java.util.Scanner;

public class ServicioPersonaPerro {
    Scanner read = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Persona crearPersona(){
        Persona p = new Persona();
        System.out.println("Ingrese su nombre: "); p.setNombre(read.next());
        System.out.println("Ingrese su apellido: "); p.setApellido(read.next());
        System.out.println("Ingrese su edad: "); p.setEdad(read.nextInt());
        System.out.println("Ingrese su documento: "); p.setDocumento(read.nextLong());
        return p;
    }
    
    public Perro crearPerro(){
        Perro p1 = new Perro();
        System.out.println("Ingrese el nombre de su perro: "); p1.setNombre(read.next());
        System.out.println("Ingrese la raza de su perro: "); p1.setRaza(read.next());
        System.out.println("Ingrese la edad de su perro: "); p1.setEdad(read.nextInt());
        System.out.println("Ingrese el tamaño de su perro: "); p1.setTamaño(read.nextDouble());
        return p1;
    }
    
    public void mostrarPersonaPerro(Persona p){
        System.out.println(p.toString());
    }
}
