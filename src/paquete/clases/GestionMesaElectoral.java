/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author jmoli
 */
public class GestionMesaElectoral 
{
    private MesaElectoral[] mesas;
    private int puntero;

    public GestionMesaElectoral() 
    {
        mesas = new MesaElectoral[100];
        puntero = 0;
    }

    public MesaElectoral[] getMesas() {
        return mesas;
    }

    public void setMesas(MesaElectoral[] mesas) {
        this.mesas = mesas;
    }

    public int getPuntero() {
        return puntero;
    }

    public void setPuntero(int puntero) {
        this.puntero = puntero;
    }

    public void crearMesa(String ubicacion) {
        if (puntero < mesas.length)
        {
            mesas[puntero] = new MesaElectoral(ubicacion);
            System.out.println("Mesa creada.");
            puntero++;
            mesas[puntero-1].setCodigo("M-00"+puntero);
        } 
        else 
        {
            System.out.println("No se pueden registrar mas mesas.");
        }
        

    }

    public void modificarMesa(String codigo, String nuevaUbicacion) {
        for (int i = 0; i < puntero; i++) {
            if (mesas[i].getCodigo().equalsIgnoreCase(codigo)) {
                mesas[i].setUbicacion(nuevaUbicacion);
                System.out.println("Mesa modificada.");
                return;
            }
        }
        System.out.println("Mesa no encontrada.");
    }

    public void eliminarMesa(String codigo) {
        for (int i = 0; i < puntero; i++) {
            if (mesas[i].getCodigo().equals(codigo)) 
            {
                for (int j = i; j < puntero - 1; j++) 
                {
                    mesas[j] = mesas[j + 1];
                }
                mesas[puntero - 1] = null;
                puntero--;
                System.out.println("Mesa eliminada.");
                return;
            }
        }
        System.out.println("Mesa no encontrada.");
    }

    public void asignarMiembro(String codigo, MiembroMesa miembro) {
        for (int i = 0; i < puntero; i++) {
            if (mesas[i].getCodigo().equals(codigo)) 
            {
                mesas[i].agregarMiembro(miembro);
                System.out.println("Miembro asignado.");
                return;
            }
        }
        System.out.println("Mesa no encontrada.");
    }

    public void mostrarMesas() {
        if (puntero == 0) 
        {
            System.out.println("No hay mesas registradas.");
        } 
        else 
        {
            for (int i = 0; i < puntero; i++) {
                System.out.println("Mesa " + (i + 1) + ":\n" + mesas[i]);
                System.out.println("\n");
            }
        }
    }
}
