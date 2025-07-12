/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author jmoli
 */
public class MiembroMesa 
{
    private String nombres;
    private String apellidos;
    private String tipo; 

    public MiembroMesa(String nombres, String apellidos, String tipo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipo = tipo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String verInfo() 
    {
        return "\nNombres: " + nombres + 
                "\nApellidos: " + apellidos + 
                "\nTipo: " + tipo;
    }
    
    @Override
    public String toString()
    {
    return verInfo(); 
    }

  
}


