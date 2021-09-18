/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zonia Roldan
 */
public class Alumno {
    protected String nombre;
    protected String apellido;
     protected int id;
    protected int edad;
    
    public Alumno(String nombre, String apellido, int id, int edad ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.edad = edad;
    }
    
    public Alumno (){
    }
    
    public void mostrarDatos(){
        
        System.out.println(this.nombre +"\t\t\t"+ this.apellido + "\t\t\t\t\t" + this.id + "\t\t\t" + this.edad + "\t\t\t\t" );
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
       }


