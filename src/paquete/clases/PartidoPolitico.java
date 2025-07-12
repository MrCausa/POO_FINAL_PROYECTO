/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author jmoli
 */
public class PartidoPolitico 
{
    private String nombre;
    private char sigla;
    private boolean tieneLogo;
    private String RLegal;

    public PartidoPolitico(String nombre, char sigla, boolean tieneLogo, String RLegal) {
        this.nombre = nombre;
        this.sigla = sigla;
        this.tieneLogo = tieneLogo;
        this.RLegal = RLegal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSigla() {
        return sigla;
    }

    public void setSigla(char sigla) {
        this.sigla = sigla;
    }

    public boolean isTieneLogo() {
        return tieneLogo;
    }

    public void setTieneLogo(boolean tieneLogo) {
        this.tieneLogo = tieneLogo;
    }

    public String getRLegal() {
        return RLegal;
    }

    public void setRLegal(String RLegal) {
        this.RLegal = RLegal;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Sigla: " + sigla + ", Tiene logo: " + (tieneLogo ? "Sí" : "No") + ", Representante: " + RLegal;
    }
}
