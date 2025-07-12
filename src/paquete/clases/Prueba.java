/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;
import paquete.clases.Controlador;

/**
 *
 * @author jmoli
 */


public class Prueba {
    public static void main(String[] args) {
        Controlador objG = new Controlador();
        
        PartidoPolitico p1 = new PartidoPolitico("La Pala",'a',true,"Ivan");
        PartidoPolitico p2 = new PartidoPolitico("Lapiz",'p',false,"Molina");
        
        //Candidato c1 = new Candidato("Ana", "Garcia", "12345", p1);
        //Candidato c2 = new Candidato("Luis", "Torres", "54321", p2);
        //objG.ingresar(c1);
        //objG.ingresar(c2);

        objG.mostrarTodo();
        System.out.println("\n");
        
        objG.modificar("12345", "Ana Maria", "Garcia Rios", p2);
        objG.mostrarTodo();
        System.out.println("\n");
        
        objG.eliminar("54321");
        objG.mostrarTodo();
        System.out.println("\n");
        
        objG.crearEleccion(1234,"05-07-2025", "Municipal");
        //objG.agregarCandidatoAEleccion(1234, c2);
        
        objG.mostrarElecciones();
        
        
    }
}


