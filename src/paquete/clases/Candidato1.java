/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author jmoli
 */

public class Candidato1 {
    
    private Candidato1[] candidatos;
    private int puntero;
    private String nombre;
    private String apellidos;
    private String dni;
    private String partido;

    public Candidato1(String nombre, String apellidos, String dni, String partido) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.partido = partido;
        candidatos = new Candidato1[100];
        puntero = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
    
    public int getCantidad() {
        return puntero;
    }
    
    public Candidato1 getCandidato(int i) {
        return candidatos[i];
    }
    
    public void registrarCandidato(Candidato1 c) {
        if (puntero < candidatos.length) {
            candidatos[puntero++] = c;
        }
    }
    


   
    public String VerInfo() {
        return "Nombres: " + nombre + 
                "\nApellidos: " + apellidos + 
                "\nDni: " + dni + 
                "\nPartido: " + partido;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Partido: " + partido;
    }

}

