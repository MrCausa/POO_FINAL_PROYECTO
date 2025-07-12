/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class VentanaGestionCandidatos extends javax.swing.JFrame {

    private DefaultListModel<String> modeloLista;
    private GestionCandidato gestor;

    public VentanaGestionCandidatos(GestionCandidato gestor) {
        this.gestor = gestor;
        initComponents();
        setLocationRelativeTo(null);
        modeloLista = new DefaultListModel<>();
        listaCandidatos.setModel(modeloLista);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        cargarListaDesdeGestor();
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtPartido.setText("");
        listaCandidatos.clearSelection();
    }

    private void cargarListaDesdeGestor() {
        modeloLista.clear();
        for (int i = 0; i < gestor.getCantidad(); i++) {
            Candidato c = gestor.getCandidatos()[i];
            modeloLista.addElement(c.getNombre() + " - " + c.getPartido());
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPartido = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCandidatos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión de Candidatos");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel1.setText("Gestión de Candidatos");

        jLabel2.setText("Nombre del Candidato:");
        jLabel3.setText("Partido Político:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(evt -> {
            String nombre = txtNombre.getText().trim();
            String partido = txtPartido.getText().trim();

            if (!nombre.isEmpty() && !partido.isEmpty()) {
                Candidato nuevo = new Candidato(nombre, partido);
                gestor.agregarCandidato(nuevo);

                modeloLista.addElement(nombre + " - " + partido);
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Completa ambos campos.");
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(evt -> {
            int index = listaCandidatos.getSelectedIndex();
            if (index != -1) {
                String nuevoNombre = txtNombre.getText().trim();
                String nuevoPartido = txtPartido.getText().trim();

                if (!nuevoNombre.isEmpty() && !nuevoPartido.isEmpty()) {
                    Candidato modificado = new Candidato(nuevoNombre, nuevoPartido);
                    gestor.getCandidatos()[index] = modificado;
                    modeloLista.set(index, nuevoNombre + " - " + nuevoPartido);
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "Completa ambos campos.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecciona un candidato.");
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(evt -> {
            int index = listaCandidatos.getSelectedIndex();
            if (index != -1) {
                gestor.eliminarCandidato(index);
                modeloLista.remove(index);
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Selecciona un candidato.");
            }
        });

        listaCandidatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int index = listaCandidatos.getSelectedIndex();
                if (index != -1) {
                    String seleccionado = modeloLista.get(index);
                    String[] partes = seleccionado.split(" - ");
                    if (partes.length == 2) {
                        txtNombre.setText(partes[0]);
                        txtPartido.setText(partes[1]);
                    }
                }
            }
        });

        jScrollPane1.setViewportView(listaCandidatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }

    
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaCandidatos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPartido;
}
