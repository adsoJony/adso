/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.tables;

import view.pruebas.*;
import controller.Cliente;
import controller.Ups;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.DashBoardAdso;
import static view.DashBoardAdso.cardLayout;
import static view.DashBoardAdso.dashboard;
import view.pruebas.DashboardApp;
import view.cliente.UpdateCliente;
import view.cliente.UpdateCliente;
import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import view.equipos.UpdateUps;

/**
 *
 * @author jogof
 */
public class UpsTable extends javax.swing.JPanel {

    //CardLayout cardLayout = new CardLayout();
    //JPanel dashboard = new JPanel();
    // UpdateCliente updateCliente;
    
    Ups upsTable;
    UpdateUps updateEquipo ;
    public static int id_cliente;

    /**
     * Creates new form JtableSwing
     *
     * @throws java.sql.SQLException
     */
    public UpsTable() throws SQLException /*throws SQLException */ {
        this.updateEquipo= new UpdateUps();
        this.id_cliente = 0;
        this.upsTable = new Ups();

        initComponents();
        //cargarTabla();

    }

    public UpsTable(CardLayout cardLayout, JPanel dashboard, UpdateCliente updateCliente) throws SQLException {
        // this.cardLayout = cardLayout;
        //this.updateCliente = updateCliente;
        //this.dashboard = dashboard;
        initComponents();
        //cargarTabla();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUps = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonInicio = new javax.swing.JButton();

        jTableUps.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableUps);

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonInicio.setText("Inicio");
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonActualizar)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonInicio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButtonActualizar)
                .addGap(18, 18, 18)
                .addComponent(jButtonEliminar)
                .addGap(18, 18, 18)
                .addComponent(jButtonInicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed

        //  Mostramos un mensaje con los datos de la fila seleccionada
        int filaSeleccionada = jTableUps.getSelectedRow();
        if (filaSeleccionada >= 0) {
            Object id = jTableUps.getValueAt(filaSeleccionada, 0);
            //JOptionPane.showMessageDialog(null, "El ide seleccionado tiene el id; " + Integer.parseInt(id.toString()));

            try {
                //UpdateUps updateUps = new UpdateUps();
                Ups u = new Ups();
                u = u.findUpsById(Integer.parseInt(id.toString()));
                
                
                updateEquipo.setEquipoUpdateFrm(u);
                updateEquipo.limpiarCampos();
                DashBoardAdso.dashboard.add(updateEquipo, "updateEquipo");
                updateEquipo.cargarFrm();             //setamos los campos del formulario 
                
                DashBoardAdso.cardLayout.show(DashBoardAdso.dashboard, "updateEquipo");    //Se puede cambiar por 
                


            } catch (Exception e) {
                System.err.println("Error Actualizando Ups: "+e);
            }

        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado un Ups....");
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed

        DashBoardAdso.cardLayout.show(DashBoardAdso.dashboard, "dashboardpanel");  //Nos dirige a la pagina central del dash
    }//GEN-LAST:event_jButtonInicioActionPerformed

    //  Métodos de la tabla
    //  Cargamos la tabla con cliente
    //  Este método nos sirve para carga una tabla desde la BD
    public void cargarTabla() throws SQLException {
        System.out.println("Entrando a funcion cargarTabla()");
        try {

            List<Ups> listaUpsByCliente = new ArrayList();
            //Cliente cliente = new Cliente();
            listaUpsByCliente = upsTable.listarUpsByCliente(15);       //  Listamos a los clientes en un objeto tipo  lista
            //   Aqui tomamos el objeto de tipo Cliente por ejemplo y lo convertimos a objeto bidimencional o array bidimencional
            Object[][] data = new Object[listaUpsByCliente.size()][6];
            //   Recorremos un bucle for con la dimención del objeto
            for (int i = 0; i < listaUpsByCliente.size(); i++) {
                Ups u = listaUpsByCliente.get(i);
                data[i][0] = u.getId_ups();
                data[i][1] = u.getPotencia_va();
                data[i][2] = u.topologia.getDetalle_topologia();
                data[i][3] = u.marca.getDetalle_marca();
                data[i][4] = u.modelo.getDetalleEquipo_modelo();
                data[i][5] = u.getUbicacion_equipo();
            }

            //   Seteamos las columnas, agregandoles el nombre a cada una
            String[] columnas = {"Id", "Potencia", "Topologia", "Marca", "Detalle", "Ubicación"};

            //   Creamos una DefaultTableMode
            DefaultTableModel modelo = new DefaultTableModel(data, columnas);
            jTableUps.setModel(modelo);

        } catch (SQLException e) {
            System.err.print("Error Jtable: " + e.getMessage());
        }
    }
    
    
    public void cargarTablaById(int id) throws SQLException {
        System.out.println("Entrando a funcion cargarTabla()");
        try {

            List<Ups> listaUpsByCliente = new ArrayList();
            //Cliente cliente = new Cliente();
            listaUpsByCliente = upsTable.listarUpsByCliente(id);       //  Listamos a los clientes en un objeto tipo  lista
            //   Aqui tomamos el objeto de tipo Cliente por ejemplo y lo convertimos a objeto bidimencional o array bidimencional
            Object[][] data = new Object[listaUpsByCliente.size()][6];
            //   Recorremos un bucle for con la dimención del objeto
            for (int i = 0; i < listaUpsByCliente.size(); i++) {
                Ups u = listaUpsByCliente.get(i);
                data[i][0] = u.getId_ups();
                data[i][1] = u.getPotencia_va();
                data[i][2] = u.topologia.getDetalle_topologia();
                data[i][3] = u.marca.getDetalle_marca();
                data[i][4] = u.modelo.getDetalleEquipo_modelo();
                data[i][5] = u.getUbicacion_equipo();
            }

            //   Seteamos las columnas, agregandoles el nombre a cada una
            String[] columnas = {"Id", "Potencia", "Topologia", "Marca", "Detalle", "Ubicación"};

            //   Creamos una DefaultTableMode
            DefaultTableModel modelo = new DefaultTableModel(data, columnas);
            jTableUps.setModel(modelo);

        } catch (SQLException e) {
            System.err.print("Error Jtable: " + e.getMessage());
        }
    }
    

    public int getIdSelectedRow() {
        int id = 0;
        int filaSeleccionada = jTableUps.getSelectedRow();
        if (filaSeleccionada >= 0) {
            Object id_object = jTableUps.getValueAt(filaSeleccionada, 0);
            id = Integer.parseInt(id_object.toString());
        }
        return id;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUps;
    // End of variables declaration//GEN-END:variables
}
