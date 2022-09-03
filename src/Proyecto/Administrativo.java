package Proyecto;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiante
 */
public class Administrativo extends Persona{
    
    private int anoIngreso;

    public Administrativo() {
        super();
    }

    public Administrativo(String nombre, String apellido, String codigo, int anoIngreso) {
        super(nombre, apellido, codigo);
        this.anoIngreso = anoIngreso;
    }

    public int getAnoIngreso() {
        return anoIngreso;
    }
    public void setAnoIngreso(int anoIngreso) {
        this.anoIngreso = anoIngreso;
    }
    
    public int calcularAnos (){
        return 0;
    }
    
}
