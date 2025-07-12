/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;


/**
 *
 * @author ivanp
 */
public class ActaElectoral extends GestionMesaElectoral
{
    private ActaElectoral[] actas;
    private int cantidad;
    private String titulo,fecha,hora ,lugar, observaciones;
    private int totalvotantR, totalvotantE,resultadosC, votosBlanco, votosNulos,actaunico;
    private String[] firmas;
    private boolean sello;
    
    public ActaElectoral() 
    {
        
    }

    public ActaElectoral(String titulo, String fecha, String hora, String lugar, String observaciones) 
    {
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.observaciones = observaciones;
        actas = new ActaElectoral[100];
        cantidad = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getTotalvotantR() {
        return totalvotantR;
    }

    public void setTotalvotantR(int totalvotantR) {
        this.totalvotantR = totalvotantR;
    }

    public int getTotalvotantE() {
        return totalvotantE;
    }

    public void setTotalvotantE(int totalvotantE) {
        this.totalvotantE = totalvotantE;
    }

    public int getResultadosC() {
        return resultadosC;
    }

    public void setResultadosC(int resultadosC) {
        this.resultadosC = resultadosC;
    }

    public int getVotosBlanco() {
        return votosBlanco;
    }

    public void setVotosBlanco(int votosBlanco) {
        this.votosBlanco = votosBlanco;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public void setVotosNulos(int votosNulos) {
        this.votosNulos = votosNulos;
    }

    public int getActaunico() {
        return actaunico;
    }

    public void setActaunico(int actaunico) {
        this.actaunico = actaunico;
    }

    public String[] getFirmas() {
        return firmas;
    }

    public void setFirmas(String[] firmas) {
        this.firmas = firmas;
    }

    public boolean isSello() {
        return sello;
    }

    public void setSello(boolean sello) {
        this.sello = sello;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public ActaElectoral getActa(int i) {
        return actas[i];
    }
    
    public void registrarActa(ActaElectoral acta) {
        if (cantidad < actas.length) {
            actas[cantidad++] = acta;
        }
    }
    
    
    @Override
    public String toString() {
        return "\n===== ACTA #" + actaunico + " =====" +
           "\nTítulo: " + titulo +
           "\nFecha: " + fecha +
           "\nHora: " + hora +
           "\nLugar: " + lugar +
           "\nVotantes Registrados: " + totalvotantR +
           "\nVotantes que Votaron: " + totalvotantE +
           "\nVotos Válidos: " + resultadosC +
           "\nVotos en Blanco: " + votosBlanco +
           "\nVotos Nulos: " + votosNulos +
           "\nFirmas: " + (firmas != null ? String.join(", ", firmas) : "Ninguna") +
           "\nSello Oficial: " + (sello ? "Sí" : "No");
    }
 }
