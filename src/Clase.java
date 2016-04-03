
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
public class Clase {
    
    private String nombre;    
    private int cant_alumnos;
    private int cant_maestros;
    private int[] proximidad_clases;
    private int posicion;
    private ArrayList<Maestro> maestros;
    private Maestro maestro_asignado = null;
    private int hora_asignada = -1;
    private int aula_asignada = -1;
    private ArrayList<Alumno> alumnos;
    
    public ArrayList<Alumno> getAlumnos(){
        return this.alumnos;
    }
    
    public void addAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public Maestro getMaestro_asignado() {
        return maestro_asignado;
    }

    public void setMaestro_asignado(Maestro maestro_asignado) {
        this.maestro_asignado = maestro_asignado;
    }

    public int getHora_asignada() {
        return hora_asignada;
    }

    public void setHora_asignada(int hora_asignada) {
        this.hora_asignada = hora_asignada;
    }

    public int getAula_asignada() {
        return aula_asignada;
    }

    public void setAula_asignada(int aula_asignada) {
        this.aula_asignada = aula_asignada;
    }
    
    
    
    public ArrayList<Maestro> getMaestros(){
        return this.maestros;
    }
    
    public void addMaestro(Maestro maestro){
        maestros.add(maestro);
    }
    
    public int[] getProximidadClases(){
        return proximidad_clases;
    }
    
    public int getProximidad(int pos){
        return proximidad_clases[pos];
    }
    
    public void printProximidad(){
        for(int i = 0; i<proximidad_clases.length; i++)
            System.out.print(proximidad_clases[i]+" ");
        System.out.println("");
    }
    
    public void setProximidad(int tamano){
        proximidad_clases = new int[tamano];
        for(int i = 0;i<proximidad_clases.length; i++){
            if(i == posicion){
                proximidad_clases[i] = -1;
            }else{
                proximidad_clases[i] = 0;
            }
        }            
    }
    
    public void addProximidad(int pos){      
        proximidad_clases[pos]++;        
    }
    
    public void subtractProximidad(int pos){
        proximidad_clases[pos]--;
    }
    
    public void addProximidad(Clase clase2){      
        proximidad_clases[clase2.getPosicion()]++;
        clase2.addProximidad(this.posicion);
    }
    
    public void addProximidad(LinkedList<Clase> clases,Clase clase2){
        int pos = -1;
        for(int i = 0; i<clases.size(); i++){
            if(clases.get(i).getNombre().equals(clase2.getNombre())){
                pos = i;
                break;
            }
        }        
        proximidad_clases[pos]++;
        clase2.addProximidad(this.posicion);
    }

    public Clase(String nombre) {
        this.nombre = nombre;
        this.cant_alumnos = 0;
        this.cant_maestros = 0;
        this.maestros = new ArrayList<Maestro>();
        this.alumnos = new ArrayList<Alumno>();
    }  

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
       
    
    public int getCant_alumnos() {
        return cant_alumnos;
    }

    public void setCant_alumnos(int cant_alumnos) {
        this.cant_alumnos = cant_alumnos;
    }
    
    public int getCant_maestros() {
        return cant_maestros;
    }

    public void setCant_maestros(int cant_maestros) {
        this.cant_alumnos = cant_maestros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String toString = nombre;
        return toString;
    }
    
    

}
