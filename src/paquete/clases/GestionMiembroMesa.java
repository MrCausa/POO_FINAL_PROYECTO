/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author jmoli
 */
public class GestionMiembroMesa 
{
    private MiembroMesa[] miembros;
    private int puntero;

    public GestionMiembroMesa() 
    {
        miembros = new MiembroMesa[100];
        puntero = 0;
    }

    public MiembroMesa[] getMiembros() {
        return miembros;
    }

    public void setMiembros(MiembroMesa[] miembros) {
        this.miembros = miembros;
    }

    public int getPuntero() {
        return puntero;
    }

    public void setPuntero(int puntero) {
        this.puntero = puntero;
    }

    public void registrarMiembro(String nombres, String apellidos, String tipo) {
        if (puntero < miembros.length)
        {
            miembros[puntero] = new MiembroMesa(nombres, apellidos, tipo);
            puntero++;
            System.out.println("Miembro registrado.");
        } 
        else 
        {
            System.out.println("No hay espacio para más miembros.");
        }
    }

    public void modificarMiembro(int indice, String nombres, String apellidos, String tipo) {
        if (indice >= 0 && indice < puntero) 
        {
            miembros[indice].setNombres(nombres);
            miembros[indice].setApellidos(apellidos);
            miembros[indice].setTipo(tipo);
            System.out.println("Miembro modificado.");
        } 
        else 
        {
            System.out.println("Índice inválido.");
        }
    }

    public void eliminarMiembro(int indice) {
        if (indice >= 0 && indice < puntero) {
            for (int i = indice; i < puntero - 1; i++) 
            {
               miembros[i] = miembros[i + 1];
            }
            miembros[puntero - 1] = null;
            puntero--;
            System.out.println("Miembro eliminado.");
        } 
        else 
        {
            System.out.println("Índice inválido.");
        }
    }

    public void mostrarMiembros() {
        if (puntero == 0) 
        {
            System.out.println("No hay miembros registrados.");
        } 
        else 
        {
            for (int i = 0; i < puntero; i++) {
                System.out.println("Miembro " + (i + 1) + ":\n" + miembros[i]);
                System.out.println("----------------------");
            }
        }
    }
    
    public MiembroMesa obtenerMiembro(int index) {
    if (index >= 0 && index < puntero) {
        return miembros[index];
    }
    return null;
}

}

