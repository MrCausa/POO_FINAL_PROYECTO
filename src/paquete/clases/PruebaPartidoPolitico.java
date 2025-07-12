/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author jmoli
 */
public class PruebaPartidoPolitico 
{
    public static void main(String[] args)
    {
        GestionPartidos obj1 = new GestionPartidos(); 

        obj1.registrarPartido("Partido Azul", 'A', true, "Laura Salazar");
        obj1.registrarPartido("Partido Verde", 'V', false, "Mario Torres");
        obj1.registrarPartido("Partido Rojo", 'R', true, "Sofía López");
        
        System.out.println("\nLista inicial:");
        //obj1.MostrarPartidos();
        System.out.println("\n");

        obj1.modificarPartido(1, "Partido Verde Renovado", 'G', true, "Mario T. Delgado");
        System.out.println("\nLista modificada:");
        //obj1.MostrarPartidos();
        System.out.println("\n");

        obj1.eliminarPartido(0);
        System.out.println("\nLista final de partidos:");
        //obj1.MostrarPartidos();
        

    }
}
