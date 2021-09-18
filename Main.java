/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Zonia Roldan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
 public static Alumno alumno = new Alumno();
    public static List<Alumno> lista = new ArrayList();
    static byte seleccion;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
         seleccionar();
    }
    
    public static void seleccionar (){
    System.out.println("\n¿Qué accion desea realizar? \nIngresar un nuevo alumno (1)\nMostrar el listado de alumnos (2)\nBorrar el registro de un alumno (3)\nSalir y mostrar a los alumnos registrados (4)\n");
    seleccion = sc.nextByte();
        switch (seleccion){
            case 1 -> registrar();
            case 2 -> listado();
             case 3 -> borrar();
             case 4 -> fin();
            default -> {
         }
        }
    }
    
    public static void eleccion2(){
        System.out.println("\n¿Qué accion desea realizar?\nBorrar otro registro(1)\nRegresar al menú principal(2)\n");
        seleccion = sc.nextByte();
        switch (seleccion){
            case 1: borrar();
                break;
            case 2: seleccionar();
                break;
            default:
                break;
        }
    }
    
    public static void registrar(){
        Alumno alumno = new Alumno();
        System.out.println("Ingrese el nombre del alumno: ");
        alumno.setNombre(sc.next());
        System.out.println("Ingrese el apellido del alumno: ");
        alumno.setApellido(sc.next());
        System.out.println("Ingrese el ID del alumno: ");
        alumno.setId(sc.nextInt());
        System.out.println("Ingrese edad del alumno: ");
        alumno.setEdad(sc.nextInt());

        if(existente(alumno)){
        }
        else{
            lista.add(alumno);
        }
        seleccionar();
    }
    
    public static boolean existente(Alumno alumnos){
        Iterator<Alumno> iterador = lista.iterator();
        while(iterador.hasNext()){
            if(alumnos.getId() == iterador.next().getId()){
                System.out.println("Este registro ya existe");
                return true;
            }
        }
        return false;
    }
    
    public static void borrar(){
        int remover;
        Iterator<Alumno> iterador = lista.iterator();
        fin();
        System.out.println("\t\tIngrese el ID del alumno que desea eliminar: ");
        remover = sc.nextInt();
            while(iterador.hasNext()){
                if(remover == iterador.next().getId()){
                iterador.remove();
                }
            }
        fin();
        eleccion2();
    }
    
    public static void listado(){
        System.out.println("Nombres\t\t\tApellidos\t\t\t\tID's\t\t\tEdades");
        Iterator<Alumno> iterador = lista.iterator();
        while(iterador.hasNext()){
            iterador.next().mostrarDatos();  
        }
        seleccionar();  
    }
    
    public static void fin (){
        System.out.println("Nombres\t\t\tApellidos\t\t\t\tID's\t\t\tEdades");
        Iterator<Alumno> iterador = lista.iterator();
        while(iterador.hasNext()){
            iterador.next().mostrarDatos();  
        }
    }
       
}
