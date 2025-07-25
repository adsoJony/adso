/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.equipos;

import controller.Cliente;
import controller.Marca;
import controller.Modelo;
import controller.Topologia;
import controller.Ups;
import java.util.HashMap;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author jogof
 */
public class UpdateUps extends javax.swing.JPanel {

    public HashMap<String, Integer> cargoHas = new HashMap<>();
    public HashMap<String, Integer> rolHas = new HashMap<>();
    public HashMap<String, Integer> modeloHas = new HashMap<>();
    public HashMap<String, Integer> topologiaHas = new HashMap<>();
    public HashMap<String, Integer> marcaHas = new HashMap<>();
    public static Ups equipoUpdateFrm;
    Cliente cliente = new Cliente();
    
    Modelo modelo = new Modelo();
    Marca marca = new Marca();
    Topologia topologia = new Topologia();

    /**
     * Creates new form InsertCliente
     */
    public UpdateUps() throws SQLException {
        this.equipoUpdateFrm = new Ups();
        
        modeloHas = modelo.hashMap();
        topologiaHas = topologia.hashMap();
        marcaHas = marca.hashMap();

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        EquipoFormjPanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jTextFieldSerieEquipo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jComboBoxModelo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTextFieldUbicacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        UpsFormjPanel1 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldBatNom = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldPotencia = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxTopologia = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldTiempoAutonomia = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldCantBancosBateria = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jTextFieldVoltajeBanco = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButtonActualizar = new javax.swing.JButton();
        jButtonLimpiarFormulario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Update Equipo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(jLabel1)
                .addContainerGap(439, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel4.setMinimumSize(new java.awt.Dimension(600, 110));
        jPanel4.setPreferredSize(new java.awt.Dimension(700, 500));

        EquipoFormjPanel.setAutoscrolls(true);
        EquipoFormjPanel.setPreferredSize(new java.awt.Dimension(700, 150));

        jLabel6.setText("Serie del equipo");
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 16));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jTextFieldSerieEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSerieEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        EquipoFormjPanel.add(jPanel8);

        jPanel2.setPreferredSize(new java.awt.Dimension(178, 25));

        jComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Marca");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        EquipoFormjPanel.add(jPanel2);

        jPanel9.setPreferredSize(new java.awt.Dimension(178, 25));

        jComboBoxModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Modelo");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jComboBoxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        EquipoFormjPanel.add(jPanel9);

        jLabel5.setText("Ubicación:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addComponent(jTextFieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        EquipoFormjPanel.add(jPanel7);

        jPanel4.add(EquipoFormjPanel);

        UpsFormjPanel1.setAutoscrolls(true);
        UpsFormjPanel1.setPreferredSize(new java.awt.Dimension(700, 200));

        jPanel18.setMinimumSize(new java.awt.Dimension(200, 0));

        jLabel16.setText("Cantida de baterias");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldBatNom, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextFieldBatNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        UpsFormjPanel1.add(jPanel18);

        jPanel26.setMinimumSize(new java.awt.Dimension(200, 0));

        jLabel23.setText("Potencia - vA -");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel14.setMinimumSize(new java.awt.Dimension(200, 0));

        jLabel12.setText("Topología ");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jComboBoxTopologia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jComboBoxTopologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBoxTopologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextFieldPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        UpsFormjPanel1.add(jPanel26);

        jLabel17.setText("Tiempo de Autonomia");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jTextFieldTiempoAutonomia, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldTiempoAutonomia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UpsFormjPanel1.add(jPanel11);

        jLabel18.setText("Cantidad Bancos de Batería");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldCantBancosBateria, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldCantBancosBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UpsFormjPanel1.add(jPanel12);

        jPanel16.setMinimumSize(new java.awt.Dimension(200, 0));

        jLabel14.setText("Voltaje banco");

        jLabel11.setText("Vdc");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jTextFieldVoltajeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldVoltajeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        UpsFormjPanel1.add(jPanel16);

        jPanel4.add(UpsFormjPanel1);

        jPanel5.setPreferredSize(new java.awt.Dimension(600, 50));

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonLimpiarFormulario.setText("Limpiar formulario");
        jButtonLimpiarFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarFormularioActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jButtonLimpiarFormulario)
                .addGap(28, 28, 28)
                .addComponent(jButtonActualizar)
                .addGap(189, 189, 189))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActualizar)
                    .addComponent(jButtonLimpiarFormulario)
                    .addComponent(jButton1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5);

        add(jPanel4, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        // TODO add your handling code here:
        try {
            boolean update;
            var transformador = false;
            var marcaSeleccionada = jComboBoxMarca.getSelectedItem();
            var id_marca = marcaHas.get(marcaSeleccionada);
            var modeloSeleccionado = jComboBoxModelo.getSelectedItem();
            var id_modelo = modeloHas.get(modeloSeleccionado);
            var topologiaSeleccionada = jComboBoxTopologia.getSelectedItem();
            var id_topologia = topologiaHas.get(topologiaSeleccionada);
            //int id_cliente = Integer.parseInt(jTextFieldId_cliente.getText()); //Ingresamos el idCLiente en un txtField
            //String fechaInstalacion = "-"+jTextFieldMesinstalacion+"-"+jTextFieldDiaInstalacion.getText();

            //Datos del Equipo
            equipoUpdateFrm.setId_cliente_equipo(equipoUpdateFrm.getId_cliente_equipo());
            equipoUpdateFrm.setSerie_equipo(jTextFieldSerieEquipo.getText());
            equipoUpdateFrm.setUbicacion_equipo(jTextFieldUbicacion.getText());
            equipoUpdateFrm.setId_marca_equipo(id_marca);
            equipoUpdateFrm.setId_modelo_equipo(id_modelo);
            equipoUpdateFrm.setId_tipoEquipo_equipo(1);

            //Datos de Ups
            equipoUpdateFrm.setPotencia_va(Integer.parseInt(jTextFieldPotencia.getText()));
            equipoUpdateFrm.setVoltajebanco_ups(Integer.parseInt(jTextFieldVoltajeBanco.getText()));
            equipoUpdateFrm.setTransformadorAislamiento(transformador);
            equipoUpdateFrm.setId_topologia_ups(id_topologia);
            equipoUpdateFrm.setCant_batNom(Integer.parseInt(jTextFieldBatNom.getText()));
            equipoUpdateFrm.setTiempoAutonomia_ups(Integer.parseInt(jTextFieldTiempoAutonomia.getText()));
            equipoUpdateFrm.setCant_batTotal(Integer.parseInt(jTextFieldCantBancosBateria.getText()));
            equipoUpdateFrm.setCant_bancoBat(Integer.parseInt(jTextFieldCantBancosBateria.getText()));

            update = equipoUpdateFrm.update(equipoUpdateFrm);

            if (update) {
                JOptionPane.showMessageDialog(null, "Ups agregado con exito.");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo Actualizar la Ups: ");
            }

        } catch (Exception e) {
            System.err.println("error: " + e + " en Evento:" + evt);
        }

    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonLimpiarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarFormularioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLimpiarFormularioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(null, this.equipoUpdateFrm.toString()+ "id: "+equipoUpdateFrm.getId_equipo());
    }//GEN-LAST:event_jButton1ActionPerformed

    public void cargarFrm() {

        jComboBoxMarca.setSelectedItem(equipoUpdateFrm.marca.getDetalle_marca());
        jComboBoxModelo.setSelectedItem(equipoUpdateFrm.modelo.getDetalle_modelo());
        jComboBoxTopologia.setSelectedItem(equipoUpdateFrm.topologia.getDetalle_topologia());

        jTextFieldBatNom.setText(Integer.toString(equipoUpdateFrm.getCant_batNom()));
        jTextFieldCantBancosBateria.setText(Integer.toString(equipoUpdateFrm.getCant_bancoBat()));
        jTextFieldPotencia.setText(Integer.toString(equipoUpdateFrm.getPotencia_va()));
        jTextFieldSerieEquipo.setText(equipoUpdateFrm.getSerie_equipo());
        jTextFieldTiempoAutonomia.setText(Integer.toString(equipoUpdateFrm.getTiempoAutonomia_ups()));
        jTextFieldUbicacion.setText(equipoUpdateFrm.getUbicacion_equipo());
        jTextFieldVoltajeBanco.setText(Integer.toString(equipoUpdateFrm.getVoltajebanco_ups()));

        String marca = equipoUpdateFrm.marca.getDetalle_marca();
        jComboBoxMarca.setSelectedItem(marca);
        String modelo = equipoUpdateFrm.modelo.getDetalle_modelo();
        jComboBoxModelo.setSelectedItem(modelo);
        String topologia = equipoUpdateFrm.topologia.getDetalle_topologia();
        jComboBoxTopologia.setSelectedItem(topologia);

    }
    
    public void limpiarCampos() throws SQLException{
        
        
        cargarMarca();
        cargarModelo();
        cargarTopologia();
        
    }
    
    
    final void cargarModelo() throws SQLException {
        jComboBoxModelo.removeAllItems();
        for (Modelo type : modelo.listarModelo()) {
            jComboBoxModelo.addItem(type.getDetalle_modelo());                        //Para trabajar con String                      
            //jComboBoxTipoDocumento.addItem(Integer.toString(type.getId_tipoDocumento())); //Solo recibe un Integer no recigbe Integer
            //identificacionJTextField.add(type);                                           //No funciona agregandole el objeto
        }
    }

    final void cargarMarca() throws SQLException {
        jComboBoxMarca.removeAllItems();
        for (Marca type : marca.listarMarca()) {
            jComboBoxMarca.addItem(type.getDetalle_marca());                        //Para trabajar con String                      
            //jComboBoxTipoDocumento.addItem(Integer.toString(type.getId_tipoDocumento())); //Solo recibe un Integer no recigbe Integer
            //identificacionJTextField.add(type);                                           //No funciona agregandole el objeto
        }
    }

    final void cargarTopologia() throws SQLException {
        jComboBoxTopologia.removeAllItems();
        for (Topologia type : topologia.listar()) {
            jComboBoxTopologia.addItem(type.getDetalle_topologia());                        //Para trabajar con String                      
            //jComboBoxTipoDocumento.addItem(Integer.toString(type.getId_tipoDocumento())); //Solo recibe un Integer no recigbe Integer
            //identificacionJTextField.add(type);                                           //No funciona agregandole el objeto
        }
    }
    
    

    public Ups getEquipoUpdateFrm() {
        return equipoUpdateFrm;
    }

    public void setEquipoUpdateFrm(Ups equipoUpdateFrm) {
        this.equipoUpdateFrm = equipoUpdateFrm;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EquipoFormjPanel;
    private javax.swing.JPanel UpsFormjPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonLimpiarFormulario;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JComboBox<String> jComboBoxModelo;
    private javax.swing.JComboBox<String> jComboBoxTopologia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextFieldBatNom;
    private javax.swing.JTextField jTextFieldCantBancosBateria;
    private javax.swing.JTextField jTextFieldPotencia;
    private javax.swing.JTextField jTextFieldSerieEquipo;
    private javax.swing.JTextField jTextFieldTiempoAutonomia;
    private javax.swing.JTextField jTextFieldUbicacion;
    private javax.swing.JTextField jTextFieldVoltajeBanco;
    // End of variables declaration//GEN-END:variables
}
