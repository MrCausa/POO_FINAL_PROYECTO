/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author matic
 */
public class GestionElecciones {
    private Eleccion[] elecciones;
    private int cantidad;

    public GestionElecciones() {
        elecciones = new Eleccion[100];
        cantidad = 0;
    }

    public void agregarEleccion(Eleccion e) {
        if (cantidad < elecciones.length) {
            elecciones[cantidad++] = e;
        }
    }

    public Eleccion[] getElecciones() {
        return elecciones;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cantidad; i++) {
            sb.append("===== ELECCIÓN #").append(i + 1).append(" =====\n");
            sb.append(elecciones[i].verInfo()).append("\n\n");
        }
        return sb.toString();
    }
}

