
package Proyecto;

/*
 * @author estudiante
 */
public class Carrera {
    private String nombre;
    private int nCreditosCarrera;

    public Carrera() {
    }

    public Carrera(String nombre, int nCreditosCarrera) {
        this.nombre = nombre;
        this.nCreditosCarrera = nCreditosCarrera;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnCreditosCarrera() {
        return nCreditosCarrera;
    }
    public void setnCreditosCarrera(int nCreditosCarrera) {
        this.nCreditosCarrera = nCreditosCarrera;
    }
    
    
}
