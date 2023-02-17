package Clases;

public class Persona {
    private String nombre, apellido;
    private int edad;
    private long documento;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, long documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro p) {
        this.perro = p;
    }
    
    @Override
    public String toString() {
        return "----------------------------------"
                + "Nombre: " + nombre + "\n" 
                + "Apellido: " + apellido + "\n"
                + "Edad: " + edad + "\n"
                + "Documento: " + documento + "\n"
                + "Perro: " + perro + "\n";
    }
}
