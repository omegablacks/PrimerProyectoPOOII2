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
public class Persona {
    
    protected String nombre;
    protected String apellido;
    protected String codigo;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
  
    
}
