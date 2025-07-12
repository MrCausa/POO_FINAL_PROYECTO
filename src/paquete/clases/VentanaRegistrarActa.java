/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author matic
 */
public class VentanaRegistrarActa extends JFrame {
    private JTextField txtTitulo, txtFecha, txtHora, txtLugar, txtResultadosC, txtVotosBlanco, txtFirmas, txtNumeroActa;
    private JCheckBox chkSello;
    private JButton btnRegistrar;
    private GestionActas gestor;


    public VentanaRegistrarActa(GestionActas gestor) {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.gestor = gestor;
        setTitle("Registrar Acta Electoral");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblTitulo = new JLabel("Título:");
        JLabel lblFecha = new JLabel("Fecha:");
        JLabel lblHora = new JLabel("Hora:");
        JLabel lblLugar = new JLabel("Lugar:");
        JLabel lblResultadosC = new JLabel("Votos Válidos:");
        JLabel lblVotosBlanco = new JLabel("Votos Blanco:");
        JLabel lblFirmas = new JLabel("Firmas (coma):");
        JLabel lblActa = new JLabel("N° Acta:");

        txtTitulo = new JTextField();
        txtFecha = new JTextField();
        txtHora = new JTextField();
        txtLugar = new JTextField();
        txtResultadosC = new JTextField();
        txtVotosBlanco = new JTextField();
        txtFirmas = new JTextField();
        txtNumeroActa = new JTextField();

        chkSello = new JCheckBox("Sello Oficial");

        btnRegistrar = new JButton("Registrar Acta");

        
        lblTitulo.setBounds(20, 20, 100, 20);
        txtTitulo.setBounds(150, 20, 200, 20);

        lblFecha.setBounds(20, 50, 100, 20);
        txtFecha.setBounds(150, 50, 200, 20);

        lblHora.setBounds(20, 80, 100, 20);
        txtHora.setBounds(150, 80, 200, 20);

        lblLugar.setBounds(20, 110, 100, 20);
        txtLugar.setBounds(150, 110, 200, 20);

        lblResultadosC.setBounds(20, 140, 120, 20);
        txtResultadosC.setBounds(150, 140, 200, 20);

        lblVotosBlanco.setBounds(20, 170, 120, 20);
        txtVotosBlanco.setBounds(150, 170, 200, 20);

        lblFirmas.setBounds(20, 200, 120, 20);
        txtFirmas.setBounds(150, 200, 200, 20);

        lblActa.setBounds(20, 230, 100, 20);
        txtNumeroActa.setBounds(150, 230, 200, 20);

        chkSello.setBounds(150, 260, 200, 20);
        btnRegistrar.setBounds(130, 300, 150, 30);

        add(lblTitulo); add(txtTitulo);
        add(lblFecha); add(txtFecha);
        add(lblHora); add(txtHora);
        add(lblLugar); add(txtLugar);
        add(lblResultadosC); add(txtResultadosC);
        add(lblVotosBlanco); add(txtVotosBlanco);
        add(lblFirmas); add(txtFirmas);
        add(lblActa); add(txtNumeroActa);
        add(chkSello); add(btnRegistrar);

        btnRegistrar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        
        if (txtResultadosC.getText().trim().isEmpty() ||
            txtVotosBlanco.getText().trim().isEmpty() ||
            txtNumeroActa.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos numéricos.");
            return;
        }

        try {
            int resultadosC = Integer.parseInt(txtResultadosC.getText().trim());
            int votosBlanco = Integer.parseInt(txtVotosBlanco.getText().trim());
            int numeroActa = Integer.parseInt(txtNumeroActa.getText().trim());

            // Ahora sí creamos el acta
            ActaElectoral acta = new ActaElectoral();
            acta.setTitulo(txtTitulo.getText().trim());
            acta.setFecha(txtFecha.getText().trim());
            acta.setHora(txtHora.getText().trim());
            acta.setLugar(txtLugar.getText().trim());
            acta.setFirmas(txtFirmas.getText().split(","));
            acta.setSello(chkSello.isSelected());
            acta.setResultadosC(resultadosC);
            acta.setVotosBlanco(votosBlanco);
            acta.setActaunico(numeroActa);

            gestor.registrarActa(acta);

            JOptionPane.showMessageDialog(null, "Acta registrada correctamente:\n" + acta);

            
            txtTitulo.setText("");
            txtFecha.setText("");
            txtHora.setText("");
            txtLugar.setText("");
            txtResultadosC.setText("");
            txtVotosBlanco.setText("");
            txtFirmas.setText("");
            txtNumeroActa.setText("");
            chkSello.setSelected(false);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingresa valores numéricos válidos.");
        }
    }
});

    }

    
    
}

