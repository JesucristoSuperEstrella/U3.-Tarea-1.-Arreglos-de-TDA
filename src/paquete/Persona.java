package paquete;

public class Persona {
    private String nombre,domicilio;
    private long telefono;
    private int edad;

    public Persona(String nombre, String domicilio, long telefono, int edad) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.edad = edad;
    }//Fin CONSTRUCTOR

    //GETTERS Y SETTERS 
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getDomicilio() {return domicilio;}
    public void setDomicilio(String domicilio) {        this.domicilio = domicilio;}
    public long getTelefono() {return telefono;}
    public void setTelefono(long telefono) {        this.telefono = telefono;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) { this.edad = edad;}
}
