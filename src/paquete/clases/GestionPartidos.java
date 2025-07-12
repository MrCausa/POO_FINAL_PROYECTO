/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author jmoli
 */
public class GestionPartidos 
{
     private PartidoPolitico[] partidos;
     private int puntero;

    public GestionPartidos() 
    {
        partidos = new PartidoPolitico[100];
        puntero = 0;
    }
    
    public PartidoPolitico[] getPartido() {
    return partidos;
}

    public int getCantidad() {
        return puntero;
    }
    
    public int getPuntero() {
        return puntero;
    }
    
    public PartidoPolitico[] getPartidos() {
        return partidos;
    }


    public void registrarPartido(String nombre, char sigla, boolean tieneLogo, String representanteLegal) 
    {
        if (puntero < partidos.length) {
            partidos[puntero] = new PartidoPolitico(nombre, sigla, tieneLogo, representanteLegal);
            puntero++;
            System.out.println("Partido registrado.");
        } else {
            System.out.println("No hay espacio para más partidos.");
        }
    }

    public void modificarPartido(int indice, String nombre, char sigla, boolean tieneLogo, String representanteLegal) 
    {
        if (indice >= 0 && indice < puntero) {
            partidos[indice].setNombre(nombre);
            partidos[indice].setSigla(sigla);
            partidos[indice].setTieneLogo(tieneLogo);
            partidos[indice].setRLegal(representanteLegal);
            System.out.println("Partido modificado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void eliminarPartido(int indice) 
    {
        if (indice >= 0 && indice < puntero) 
        {
            for (int i = indice; i < puntero - 1; i++) 
            {
                partidos[i] = partidos[i + 1];
            }
            partidos[puntero - 1] = null;
            puntero--;
            System.out.println("Partido eliminado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public String listarPartidos() {
    if (puntero == 0) {
        return "No hay partidos registrados.";
    } else {
        StringBuilder sb = new StringBuilder("Lista de partidos registrados:\n");
        for (int i = 0; i < puntero; i++) {
            sb.append((i + 1)).append(". ").append(partidos[i].toString()).append("\n");
        }
        return sb.toString();
    }
}


}
