
import java.util.ArrayList;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xavier2696
 */
public class Alumno {
    
    private String nombre;
    private ArrayList<Clase> clases;
    private double satisfaccion;
    private ArrayList<Clase> clases_matriculadas;

    public ArrayList<Clase> getClases_matriculadas() {
        return clases_matriculadas;
    }

    public void setClases_matriculadas(ArrayList<Clase> clases_matriculadas) {
        this.clases_matriculadas = clases_matriculadas;
    }
    
    public void addClase_matriculada(Clase clase){
        this.clases_matriculadas.add(clase);
    }
    
    public double getSatisfaccion(){
        return this.satisfaccion;
    }
    
    public void setSatisfaccion(double satisfaccion){
        this.satisfaccion = satisfaccion;
    }
    
    public void subtractSatisfaccion(){
        this.satisfaccion--;
    }

    public Alumno(String nombre, ArrayList<Clase> clases) {
        this.nombre = nombre;
        this.clases = clases; 
        this.satisfaccion = 5;
        this.clases_matriculadas = new ArrayList();
    }    
    

    public ArrayList<Clase> getClases() {
        return clases;
    }
    
    public String getClasesString(){
        String toString = "Clases: ";
        for(Clase clase:clases)
            toString+=" "+clase.getNombre()+",  ";
        return toString;
    }

    
    public Clase getClase(int pos){
        return clases.get(pos);
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String toString = "Nombre: "+nombre+"\n Clases: ";
        for(Clase clase:clases)
            toString+=clase.getNombre()+"  ";
        return toString;
    }

    
}
