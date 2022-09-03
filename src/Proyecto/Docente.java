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
public class Docente extends Persona{
    
    private String profesion;
     private double salario;
    //___________Estatura m - Peso Kg______
     private double estatura, peso;

    public Docente() {
        super();
    }

    public Docente(String nombre, String apellido, String codigo, String profesion, double salario, double estatura, double peso) {
        super(nombre, apellido, codigo);
        this.profesion = profesion;
        this.salario = salario;
        this.estatura = estatura;
        this.peso = peso;
    }
   
    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    //Falta hacer el metodo de calcular el IMC ____________________________________________________ 
    public String calcularIMC(){
        double imc = peso/(Math.pow(estatura, 2));
        
        if (imc > 0 && imc <18.5) return "Peso inferior al normal";
        else if (imc >= 18.5 && imc <= 24.9) return "Normal";
            else if (imc >= 25 && imc <= 29.9) return "Peso superior al normal";
                else if (imc >= 30) return "Obesidad";
    return "";
    }
    
}
