/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author estudiante
 */
public class Estudiante extends Persona{
    
    private Carrera carrera;
    private int semestreActual;
    private int nCreditos;

    public Estudiante() {
        super();
    }

    public Estudiante(String nombre, String apellido, String codigo, Carrera carrera, int semestreActual, int nCreditos) {
        super(nombre, apellido, codigo);
        this.carrera = carrera;
        this.semestreActual = semestreActual;
        this.nCreditos = nCreditos;
    }

    public Carrera getCarrera() {
        return carrera;
    }
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public int getSemestreActual() {
        return semestreActual;
    }
    public void setSemestreActual(int semestreActual) {
        this.semestreActual = semestreActual;
    }

    public int getnCreditos() {
        return nCreditos;
    }
    public void setnCreditos(int nCreditos) {
        this.nCreditos = nCreditos;
    }
    
    /*
    RF2: Cuándo pueden matricular
    proyecto de grado, para lo que se debe mostrar un mensaje así:
    “Estudiante NN ya puedes matricular Proyecto de Grado�?.
    */
    public String presentacionProyecto(){
        return "Si es posible";
    }
    
}
