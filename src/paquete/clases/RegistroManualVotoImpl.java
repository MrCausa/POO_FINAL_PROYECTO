/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author matic
 */

public class RegistroManualVotoImpl implements RegistroManualVoto {


    @Override
    public void Registrarvoto() {
        ActaElectoral nuevaActa = new ActaElectoral();
        nuevaActa.setTitulo("Elección distrital");
        nuevaActa.setFecha("10/07/2025");
        nuevaActa.setHora("09:00");
        nuevaActa.setLugar("Lima");
        nuevaActa.setTotalvotantR(120);
        nuevaActa.setTotalvotantE(98);
        nuevaActa.setResultadosC(90);
        nuevaActa.setVotosBlanco(4);
        nuevaActa.setVotosNulos(4);
        nuevaActa.setActaunico(1);
        nuevaActa.setFirmas(new String[]{"Presidente", "Secretario"});
        nuevaActa.setSello(true);

        System.out.println("Acta registrada correctamente.");
        System.out.println(nuevaActa);
    }

}

