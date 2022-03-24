package paquete;

public class Pila {
    private int TOS;
    private Persona vector[];
    private final int VACIO=-1;
    
    public Pila(int tamano){
        TOS=-1;
        vector=new Persona[tamano];
    }//CONSTRUCTOR

    private boolean estaPilaLlena(){
        return TOS==vector.length-1;
    }
    private boolean estaPilaVacia(){
        return TOS==VACIO;
    }
    
    public boolean push(String nombre, String domicilio,long telefono,int edad){
        if (estaPilaLlena())return false;
        TOS++;
        vector[TOS]= new Persona(nombre,domicilio,telefono,edad);
        return true;           
    }
    public boolean pop(){
        if (estaPilaVacia())return false;
        vector[TOS]=null;
        TOS--;
        return true;
    }
    public String mostrarDatos(){
        String cadena="";
        for(int i=0;i<TOS+1;i++){
                cadena="["+i+"]"+vector[i].getNombre()+"   "+vector[i].getDomicilio()+"   "+vector[i].getTelefono()+"   "+vector[i].getEdad()+"\n"+cadena;
        }
        return cadena;
    }
}//FIN class Pila
