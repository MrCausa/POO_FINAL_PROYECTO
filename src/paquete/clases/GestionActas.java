/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author matic
 */
public class GestionActas {
    private ActaElectoral[] actas;
    private int cantidad;

    public GestionActas() {
        actas = new ActaElectoral[100];
        cantidad = 0;
    }

    public void registrarActa(ActaElectoral acta) {
        if (cantidad < actas.length) {
            actas[cantidad++] = acta;
        }
    }

    public ActaElectoral[] getActas() {
        return actas;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        if (cantidad == 0) {
            return "No hay actas electorales registradas.";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cantidad; i++) {
            sb.append(actas[i].toString()).append("\n\n");
        }
        return sb.toString();
    }
    
    public ActaElectoral getActa(int index) {
        if (index >= 0 && index < cantidad) {
            return actas[index];
        } 
        else 
        {
            return null;
        }
    }

}


