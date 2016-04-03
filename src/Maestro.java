
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
public class Maestro {
    
    private String nombre;
    private ArrayList<Clase> clases_posibles;
    private ArrayList<Integer> horas_posibles;
    private int posicion;

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }   
    

    public Maestro(String nombre, ArrayList<Clase> clases_posibles, ArrayList<Integer> horas_posibles) {
        this.nombre = nombre;
        this.clases_posibles = clases_posibles;
        this.horas_posibles = horas_posibles;
    }
    
    public ArrayList<Clase> getClases_posibles() {
        return clases_posibles;
    }

    public void setClases_posibles(ArrayList<Clase> clases_posibles) {
        this.clases_posibles = clases_posibles;
    }

    public ArrayList<Integer> getHoras_posibles() {
        return horas_posibles;
    }

    public void setHoras_posibles(ArrayList<Integer> horas_posibles) {
        this.horas_posibles = horas_posibles;
    }
        

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getHorasString(){
        String toString="Horas: ";
        for(Integer hora: horas_posibles){
            switch(hora){
                case 0:
                    toString+=" 7:00-8:30,  ";
                    break;
                case 1:
                    toString+=" 8:30-10:00,  ";
                    break;
                case 2:
                    toString+=" 10:00-11:30,  ";
                    break;
                case 3:
                    toString+=" 11:30-1:00,  ";
                    break;
                case 4:
                    toString+=" 1:00-2:20,  ";
                    break;
                case 5:
                    toString+=" 2:20-3:40,  ";
                    break;
                case 6:
                    toString+=" 3:40-5:00,  ";
                    break;
                case 7:
                    toString+=" 5:10-6:30,  ";
                case 8:
                    toString+=" 6:30-8:00,  ";
                default:
            }
        }
            
        return toString;
    }
    
    public String getClasesString(){
        String toString = "Clases: ";
        for(Clase clase:clases_posibles)
            toString+=" "+clase.getNombre()+",  ";
        return toString;
    }

    @Override
    public String toString() {
        String toString = "Nombre: "+nombre+"\n Clases: ";
        for(Clase clase:clases_posibles)
            toString+=clase.getNombre()+" ";
        toString+="\n Horas: ";
        for(Integer hora: horas_posibles){
            switch(hora){
                case 0:
                    toString+="7:00-8:30 ";
                    break;
                case 1:
                    toString+="8:30-10:00 ";
                    break;
                case 2:
                    toString+="10:00-11:30 ";
                    break;
                case 3:
                    toString+="11:30-1:00 ";
                    break;
                case 4:
                    toString+="1:00-2:20 ";
                    break;
                case 5:
                    toString+="2:20-3:40 ";
                    break;
                case 6:
                    toString+="3:40-5:00 ";
                    break;
                case 7:
                    toString+="5:10-6:30 ";
                case 8:
                    toString+="6:30-8:00 ";
                default:
            }
        }
            
        return toString;
    }
    
    

}
