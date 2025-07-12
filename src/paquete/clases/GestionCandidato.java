/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author matic
 */
public class GestionCandidato {
    
    private Candidato[] candidatos;
    private int cantidad;

public GestionCandidato() {
    candidatos = new Candidato[100]; 
    cantidad = 0;
}

public void agregarCandidato(Candidato c) {
    if (cantidad < candidatos.length) {
        candidatos[cantidad] = c;
        cantidad++;
    }
}
public void eliminarCandidato(int indice) {
    if (indice >= 0 && indice < cantidad) {
        
        for (int i = indice; i < cantidad - 1; i++) {
            candidatos[i] = candidatos[i + 1];
        }
        candidatos[cantidad - 1] = null; 
        cantidad--;
    }
}

public Candidato[] getCandidatos() {
    return candidatos;
}

public int getCantidad() {
    return cantidad;
}

    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < cantidad; i++) {
        sb.append((i + 1)).append(". ").append(candidatos[i].toString()).append("\n");
    }
    return sb.toString();
}


}


