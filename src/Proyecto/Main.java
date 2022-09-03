
package Proyecto;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner c = new Scanner(System.in);
        
        ArrayList<Docente> docentes = new ArrayList<Docente>();
        
        ArrayList<Administrativo> admins = new ArrayList<Administrativo>();
        
        Carrera derecho = new Carrera ();
        derecho.setNombre("Derecho");
        derecho.setnCreditosCarrera(180);
        
        Carrera comunicacion = new Carrera ("Comunicacion Social", 190);
        Carrera sistemas = new Carrera ("Sistemas", 164);
        Carrera enfermeria = new Carrera ("Enfermeria", 154);
        
        //_________________________________Prueba RF1_______________________________________________
        
        //código, nombre, apellidos, profesión, salario, estatura y peso
        Docente dc1 = new Docente("Olga", "Castillo", "1151978", "Ing de Sistemas", 3200000, 1.90, 80);
        System.out.println("El docente: "+dc1.getNombre() + " de "+ dc1.getEstatura() + "m /" + dc1.getPeso() + 
        		"kg, es de composicion corporal: " + dc1.calcularIMC() + "\n");
        
        Docente dc2 = new Docente("Claudia", "Gómez", "1150050", "Ing de Sistemas", 8200000, 1.65, 60);
        System.out.println("El docente: "+dc2.getNombre() + " de "+ dc2.getEstatura() + "m /" + dc2.getPeso() + 
        		"kg, es de composicion corporal: " + dc1.calcularIMC() + "\n");
        
        docentes.add(dc1);
        docentes.add(dc2);
        
        System.out.println("___________________________________________________________________________________");
        
        //_________________________________Prueba RF2_______________________________________________
        
        //código, nombre, apellidos, carrera, semestre actual y número de créditos.
        Estudiante est1 = new Estudiante("Jezael", "Ropero", "1151920", sistemas, 8, 150);
        est1.presentacionProyecto();
        
        Estudiante est2 = new Estudiante("Pablo", "Perez", "1151925", sistemas, 10, 142);
        est2.presentacionProyecto();        
        System.out.println("___________________________________________________________________________________");
        
        //_________________________________Prueba RF3_______________________________________________
        
        Administrativo admin1 = new Administrativo("Carlos", "Ramirez", "1010102931", 2007, 4500000);
        System.out.println("El administrativo: "+admin1.getNombre()+" tiene "+admin1.calcularAntiguedad()+" años de antiguedad.");
        System.out.println("___________________________________________________________________________________");
        
        admins.add(admin1);
        
        //_________________________________Prueba RF4_______________________________________________
        
        //Primero Modificaremos los salarios Docentes
        //***********Y la profe Claudia tiene un aumento de $1.200.000 por tenerme paciencia***********
        for (Docente DocenteActual: docentes) {
        	System.out.println("Ingrese el nuevo salario para: "+DocenteActual.getNombre() +" "+ DocenteActual.getApellido());
        	double salario=0;
            salario=Double.parseDouble(JOptionPane.showInputDialog("Ingresar Salario nuevo"));
            DocenteActual.setSalario(salario);
            
            System.out.println("El nuevo salario para: "+DocenteActual.getNombre() +" "
            + DocenteActual.getApellido()+" será de: $"+DocenteActual.getSalario());
            System.out.println("\n");
    	}
        
        //Segundo modificaremos los salarios Administrativos.
        
        for (Administrativo AdminActual: admins) {
        	System.out.println("Ingrese el nuevo salario para: "+AdminActual.getNombre() +" "+ AdminActual.getApellido());
        	double salario=0;
            salario=Double.parseDouble(JOptionPane.showInputDialog("Ingresar Salario nuevo"));
            AdminActual.setSalario(salario);
            
            System.out.println("El nuevo salario para: "+AdminActual.getNombre() +" "
            + AdminActual.getApellido()+" será de: $"+AdminActual.getSalario());
            System.out.println("\n");
    	}
    }
    
    
}
