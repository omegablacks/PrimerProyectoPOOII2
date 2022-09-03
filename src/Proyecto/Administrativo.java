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
    private double salario;
    public Administrativo() {
        super();
    }

    public Administrativo(String nombre, String apellido, String codigo, int anoIngreso, double salario) {
        super(nombre, apellido, codigo);
        this.anoIngreso = anoIngreso;
        this.salario = salario;
    }

    public int getAnoIngreso() {
        return anoIngreso;
    }
    public void setAnoIngreso(int anoIngreso) {
        this.anoIngreso = anoIngreso;
    }
    
    public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	public int calcularAntiguedad (){
        return (2022-anoIngreso);
    }
    
}
