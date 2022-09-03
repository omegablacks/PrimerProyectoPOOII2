/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner c = new Scanner(System.in);
        
        Carrera derecho = new Carrera ("Derecho", 180);
        Carrera comunicacion = new Carrera ("Comunicacion Social", 190);
        Carrera sistemas = new Carrera ("Sistemas", 164);
        Carrera enfermeria = new Carrera ("Enfermeria", 154);
        
        Docente dc1 = new Docente("Olga", "Castillo", "1151978", "Ing de Sistemas", 3200000, 1.75, 100.1);
        System.out.println(dc1.calcularIMC());
        
        Estudiante est1 = new Estudiante("Jezael", "Ropero", "1151920", sistemas, 8, 40);
    }
    
}
