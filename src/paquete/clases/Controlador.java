/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

import java.util.Random;

/**
 *
 * @author jmoli
 */

public class Controlador {
    private Candidato1[] arreglo;
    private int puntero;
    private int puntero1;
    private Eleccion[] elecciones;


    public Controlador() {
        arreglo = new Candidato1[100];
        elecciones = new Eleccion[50];
        puntero = 0;
        puntero1 = 0;
    }

    public void ingresar(Candidato1 ref) {
        if (puntero < arreglo.length) {
            arreglo[puntero] = ref;
            puntero++;
            System.out.println("Candidato registrado correctamente.");
        } else {
            System.out.println("No hay espacio para más candidatos.");
        }
    }

    public void modificar(String dni, String nuevosNombres, String nuevosApellidos, PartidoPolitico nuevoPartido) {
        for (int i = 0; i < puntero; i++) {
            if (arreglo[i].getDni().equals(dni)) {
                arreglo[i].setNombre(nuevosNombres);
                arreglo[i].setApellidos(nuevosApellidos);
                //arreglo[i].setPartido(nuevoPartido);
                System.out.println("Candidato modificado.");
                return;
            }
        }
        System.out.println("Candidato no encontrado.");
    }

    public void eliminar(String dni) {
        for (int i = 0; i < puntero; i++) {
            if (arreglo[i].getDni().equals(dni)) {
                for (int j = i; j < puntero - 1; j++) {
                    arreglo[j] = arreglo[j + 1];
                }
                arreglo[puntero - 1] = null;
                puntero--;
                System.out.println("Candidato eliminado.");
                return;
            }
        }
        System.out.println("Candidato no encontrado.");
    }

    public void mostrarTodo() {
        if (puntero == 0) {
            System.out.println("No hay candidatos registrados.");
        } else {
            System.out.println("Lista de candidatos:");
            for (int i = 0; i < puntero; i++) {
                System.out.print((i + 1) + ". ");
                System.out.println(arreglo[i].VerInfo());
            }
        }
    }
    

    public void crearEleccion(int id,String fecha, String tipo) {
        
        if (puntero1 < elecciones.length) {
            elecciones[puntero1] = new Eleccion(id, fecha, tipo);
            puntero1++;
            System.out.println("Eleccion creada.");
        } else {
            System.out.println("Límite de elecciones alcanzado.");
        }
    }
    
    public void agregarCandidatoAEleccion(int id, Candidato1 c) {
        
         for (int i = 0; i < puntero1; i++) 
         {
             if (elecciones[i].getId() == id )
             {
                //elecciones[i].agregarCandidato(c);
                 System.out.println("Candidato agreado a la Eleccion: "+id);
             }
             else
             {
                 System.out.println("No se encontro eleccion");
             }
  
        }

    }

    public void modificarEleccion(int i, String nuevaFecha, String nuevoTipo) {
        if (i >= 0 && i < puntero1) {
            elecciones[i].setFecha(nuevaFecha);
            elecciones[i].setTipo(nuevoTipo);
            System.out.println("Eleccion modificada.");
        } else {
            System.out.println("Indice inválido.");
        }
    }

    public void eliminarEleccion(int in) {
        if (in >= 0 && in < puntero1) {
            for (int i = in; i < puntero1 - 1; i++) {
                elecciones[i] = elecciones[i + 1];
            }
            elecciones[puntero1 - 1] = null;
            puntero1--;
            System.out.println("Eleccion eliminada.");
        } else {
            System.out.println("Indice inválido.");
        }
    }

    public void mostrarElecciones() {
        if (puntero1 == 0) {
            System.out.println("No hay elecciones registradas.");
        } else {
            for (int i = 0; i < puntero1; i++) {
                System.out.println("Eleccion " + (i + 1) + ":\n" + elecciones[i].verInfo());
            }
        }
    }
}
