/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author jmoli
 */
public class Prueba5y6 
{
    public static void main(String[] args) {
        GestionMesaElectoral G1 = new GestionMesaElectoral();
        GestionMiembroMesa G2 = new GestionMiembroMesa();

        G1.crearMesa("ATE");
        G1.crearMesa("SURCO");
        
        
        G2.registrarMiembro("Laura", "Quispe", "Presidente");
        G2.registrarMiembro("Marco", "Lopez", "Vocal");
        G2.registrarMiembro("Sofia", "Reyes", "Secretario");

        G1.asignarMiembro("M-002", G2.obtenerMiembro(0)); 
        G1.asignarMiembro("M-002", G2.obtenerMiembro(1));

        System.out.println("\n--- Mesas registradas ---");
        G1.mostrarMesas();

        System.out.println("\n--- Miembros registrados ---");
        G2.mostrarMiembros();

        G1.modificarMesa("M-002", "LA MOLINA");

        G2.modificarMiembro(1, "Marco", "Lopez", "Presidente");

        G1.eliminarMesa("M-001");

        G2.eliminarMiembro(2);

        System.out.println("\n--- Mesas despues de modificar/eliminar ---");
        G1.mostrarMesas();

        System.out.println("\n--- Miembros despues de modificar/eliminar ---");
        G2.mostrarMiembros();
    }
}


