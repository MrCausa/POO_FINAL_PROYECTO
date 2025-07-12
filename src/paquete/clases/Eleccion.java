/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author jmoli
 */

public class Eleccion {
    private String fecha;
    private String tipo;
    private Candidato[] candidatos;
    private int cantCandidatos;
    private int id;

    public Eleccion(int id ,String fecha, String tipo) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.candidatos = new Candidato[50]; 
        this.cantCandidatos = 0;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

     
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Candidato[] getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(Candidato[] candidatos) {
        this.candidatos = candidatos;
    }

    public int getCantCandidatos() {
        return cantCandidatos;
    }

    public void setCantCandidatos(int cantCandidatos) {
        this.cantCandidatos = cantCandidatos;
    }


    public void agregarCandidato(Candidato ref) {
        if (cantCandidatos < candidatos.length) 
        {
            candidatos[cantCandidatos] = ref;
            cantCandidatos++;
        } 
        else 
        {
           System.out.println("No se pueden agregar más candidatos a esta elección.");
        }
    }
    
    public String verInfo() 
    {
        String cat = "";
        for (int i = 0; i < cantCandidatos; i++) 
        {
           //cat = cat+ candidatos[i].VerInfo(); 
        } 
        
        return "Fecha: " + fecha +
               "\nTipo: " + tipo +
               "\nNumero de Candidatos: "+ cantCandidatos+
                "\nCandidatos: \n" + cat;
    }
    
    
   
}
