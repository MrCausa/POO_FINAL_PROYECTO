/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

import java.util.Random;
import paquete.clases.MiembroMesa;


/**
 *
 * @author jmoli
 */
public class MesaElectoral 
{
    protected String codigo; 
    protected String ubicacion;
    protected MiembroMesa[] miembros;
    protected int numMiembros;
  

    public MesaElectoral(String ubicacion) {
      
        this.ubicacion = ubicacion;
        this.miembros = new MiembroMesa[5]; 
        this.numMiembros = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public MiembroMesa[] getMiembros() {
        return miembros;
    }

    public void setMiembros(MiembroMesa[] miembros) {
        this.miembros = miembros;
    }

    public int getNumMiembros() {
        return numMiembros;
    }

    public void setNumMiembros(int numMiembros) {
        this.numMiembros = numMiembros;
    }

    public void agregarMiembro(MiembroMesa ref) {
        if (numMiembros < miembros.length) 
        {
            miembros[numMiembros] = ref;
            numMiembros++;
        } 
        else 
        {
            System.out.println("No se pueden agregar más miembros a esta mesa.");
        }
    }

    public String mostrarMiembros() 
    {
        if (numMiembros == 0)
        {
            return "\n - (Sin miembros)";
        }
        else
        {
            String cad = "";
            for (int i = 0; i < numMiembros; i++) 
            {
                cad += "\n  - " + miembros[i];
            }
            return cad;
        }


    }

    public String verInfo() 
    {
    return "\nCodigo: " + codigo +
           "\nUbicacion: " + ubicacion +
           "\nMiembros:" + mostrarMiembros();
    }
    
    @Override
    public String toString() {
        return "Código: " + codigo + ", Ubicación: " + ubicacion;
    }




}


