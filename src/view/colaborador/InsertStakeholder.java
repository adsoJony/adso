/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.colaborador;

import conexion.Conexion;
import controller.Cargo;
import controller.Rol;
import controller.TipoDocumento;
import java.sql.SQLException;
import controller.Cargo;
import controller.TipoDocumento;
import controller.Rol;
import controller.Stakeholder;
import java.util.HashMap;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;
import view.DashBoardAdso;

/**
 *
 * @author jogof
 */
public class InsertStakeholder extends javax.swing.JPanel {

    Rol rol = new Rol();
    Cargo cargo = new Cargo();
    TipoDocumento tipoDocumento = new TipoDocumento();

    //DashBoardAdso dashPruebaAdso = new DashBoardAdso();
    HashMap<String, Integer> cargoHas = new HashMap<>();
    HashMap<String, Integer> rolHas = new HashMap<>();
    HashMap<String, Integer> tipoDocumentoHas = new HashMap<>();

    /**
     * Creates new form InsertStakeholder
     */
    public InsertStakeholder() throws SQLException {

        //  HashMaps de los combBox
        cargoHas = cargo.hashMapCargo();
        rolHas = rol.hashMapRol();
        tipoDocumentoHas = tipoDocumento.hashMapTipoDocumento();

        initComponents();

        //      Cargamos los comboBox
        cargarCargos();
        cargarTipoDocumento();
        cargarRol();
        limpiarCampos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        UsuarioFormjPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jTextFieldPrimerNombreCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jTextFieldSegundoNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jTextFieldPrimerApellido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jTextFieldSegundoApellido = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jPanelNickname1 = new javax.swing.JPanel();
        jTextFieldNickname = new javax.swing.JTextField();
        jLabelNickname1 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        passAJLabel1 = new javax.swing.JLabel();
        jPasswordFieldA = new javax.swing.JPasswordField();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxRol = new javax.swing.JComboBox<>();
        UsuarioFormjPanel2 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jTextFieldIdentificacion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jComboBoxTipoDocumento = new javax.swing.JComboBox<>();
        jPanel20 = new javax.swing.JPanel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jComboBoxCargo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButtonIngresar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 800));
        setLayout(new java.awt.BorderLayout());

        jPanelTitulo.setPreferredSize(new java.awt.Dimension(900, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingreso de Stakeholder");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jPanelTitulo, java.awt.BorderLayout.NORTH);
        jPanelTitulo.getAccessibleContext().setAccessibleName("");

        jPanel1.setMaximumSize(new java.awt.Dimension(900, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 616));

        UsuarioFormjPanel1.setAutoscrolls(true);
        UsuarioFormjPanel1.setPreferredSize(new java.awt.Dimension(800, 200));

        jPanel8.setPreferredSize(new java.awt.Dimension(300, 25));

        jLabel7.setText("Primer Nombre");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jTextFieldPrimerNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrimerNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        UsuarioFormjPanel1.add(jPanel8);

        jPanel9.setPreferredSize(new java.awt.Dimension(300, 25));

        jLabel8.setText("Segundo Nombre");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        UsuarioFormjPanel1.add(jPanel9);

        jPanel13.setPreferredSize(new java.awt.Dimension(300, 25));

        jLabel10.setText("Primer Apellido");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jTextFieldPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        UsuarioFormjPanel1.add(jPanel13);

        jPanel14.setPreferredSize(new java.awt.Dimension(300, 25));

        jLabel12.setText("Segundo Apellido");
        jLabel12.setPreferredSize(new java.awt.Dimension(100, 16));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jTextFieldSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        UsuarioFormjPanel1.add(jPanel14);

        jPanel21.setMinimumSize(new java.awt.Dimension(350, 0));
        jPanel21.setPreferredSize(new java.awt.Dimension(300, 25));

        jLabel18.setText("Teléfono");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        UsuarioFormjPanel1.add(jPanel21);

        jPanelNickname1.setMinimumSize(new java.awt.Dimension(200, 0));
        jPanelNickname1.setPreferredSize(new java.awt.Dimension(300, 25));

        jLabelNickname1.setText("NickName ");

        javax.swing.GroupLayout jPanelNickname1Layout = new javax.swing.GroupLayout(jPanelNickname1);
        jPanelNickname1.setLayout(jPanelNickname1Layout);
        jPanelNickname1Layout.setHorizontalGroup(
            jPanelNickname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNickname1Layout.createSequentialGroup()
                .addComponent(jLabelNickname1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jTextFieldNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelNickname1Layout.setVerticalGroup(
            jPanelNickname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNickname1Layout.createSequentialGroup()
                .addGroup(jPanelNickname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNickname1))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        UsuarioFormjPanel1.add(jPanelNickname1);

        jPanel15.setPreferredSize(new java.awt.Dimension(600, 25));

        jLabel13.setText("Email");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)))
        );

        UsuarioFormjPanel1.add(jPanel15);

        jPanel16.setPreferredSize(new java.awt.Dimension(350, 28));

        passAJLabel1.setText("Password");

        jPasswordFieldA.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passAJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jPasswordFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passAJLabel1)
                    .addComponent(jPasswordFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        UsuarioFormjPanel1.add(jPanel16);

        jPanel7.setPreferredSize(new java.awt.Dimension(300, 25));

        jLabel6.setText("Rol");

        jComboBoxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(55, 55, 55)
                .addComponent(jComboBoxRol, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        UsuarioFormjPanel1.add(jPanel7);

        jPanel1.add(UsuarioFormjPanel1);

        UsuarioFormjPanel2.setAutoscrolls(true);
        UsuarioFormjPanel2.setPreferredSize(new java.awt.Dimension(800, 100));

        jPanel19.setMinimumSize(new java.awt.Dimension(300, 0));
        jPanel19.setPreferredSize(new java.awt.Dimension(300, 25));

        jLabel16.setText("Identificacion ");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldIdentificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        UsuarioFormjPanel2.add(jPanel19);

        jPanel26.setMinimumSize(new java.awt.Dimension(200, 0));
        jPanel26.setPreferredSize(new java.awt.Dimension(300, 25));

        jLabel23.setText("Tipo Documento");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jComboBoxTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxTipoDocumento, 0, 182, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        UsuarioFormjPanel2.add(jPanel26);

        jPanel20.setMinimumSize(new java.awt.Dimension(350, 0));
        jPanel20.setPreferredSize(new java.awt.Dimension(300, 25));

        jLabel17.setText("Dirección");
        jLabel17.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        UsuarioFormjPanel2.add(jPanel20);

        jPanel23.setMinimumSize(new java.awt.Dimension(200, 0));
        jPanel23.setPreferredSize(new java.awt.Dimension(300, 25));

        jLabel19.setText("Cargo");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jComboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        UsuarioFormjPanel2.add(jPanel23);

        jPanel1.add(UsuarioFormjPanel2);

        jPanel2.setPreferredSize(new java.awt.Dimension(566, 50));

        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar campos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(294, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(44, 44, 44)
                .addComponent(jButtonIngresar)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIngresar)
                    .addComponent(jButton2))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        // TODO add your handling code here:

        int id_stakeholder;
        var tipoDocumentoSeleccionado = jComboBoxTipoDocumento.getSelectedItem();
        var cargoSeleccionado = jComboBoxCargo.getSelectedItem();
        var rolSeleccionado = jComboBoxRol.getSelectedItem();
        var id_tipoDocumento = tipoDocumentoHas.get(tipoDocumentoSeleccionado);
        var id_cargo = cargoHas.get(cargoSeleccionado);
        var id_rol = rolHas.get(rolSeleccionado);         //El id_rol_usuario de stakeholder es 4

        Stakeholder stakeholderFrm = new Stakeholder();

        try {
            //Datos de Usuario
            stakeholderFrm.setNickName_usuario(jTextFieldNickname.getText());
            stakeholderFrm.setPrimerNombre_usuario(jTextFieldPrimerNombreCliente.getText());
            stakeholderFrm.setSegundoNombre_usuario(jTextFieldSegundoNombre.getText());
            stakeholderFrm.setPrimerApellido_usuario(jTextFieldPrimerApellido.getText());
            stakeholderFrm.setSegundoApellido_usuario(jTextFieldSegundoApellido.getText());
            stakeholderFrm.setEmail_usuario(jTextFieldEmail.getText());

            //  Psw
            char[] passChars = jPasswordFieldA.getPassword();
            String psw_usuario = new String(passChars);
            String pswHash = BCrypt.hashpw(psw_usuario, BCrypt.gensalt(10));
            stakeholderFrm.setPsw_usuario(pswHash);

            //stakeholderFrm.rol.setId_rol(id_rol);
            stakeholderFrm.setId_rol_usuario(id_rol);
            stakeholderFrm.setId_tipoUsuario_usuario(1);

            //  Datos de Stakeholder
            stakeholderFrm.setId_cargo_stakeholder(id_cargo);
            stakeholderFrm.setId_tipoDocumento_stakeholder(id_tipoDocumento);
            stakeholderFrm.setDocumento_stakeholder(Integer.parseInt(jTextFieldIdentificacion.getText()));

            id_stakeholder = stakeholderFrm.inputStakeholder(stakeholderFrm, stakeholderFrm);
            //id_stakeholder = 3;
            if (id_stakeholder != 0) {
                System.out.println("Stakeholder registrado" + id_stakeholder);
                
                //Ejecutar metodo para lismpiar y repintar pantalla
                limpiarCampos();
                DashBoardAdso.cardLayout.show(DashBoardAdso.dashboard, "dashboardpanel");
            } else {
                System.err.println("No se pudo ingresar Stakeholder");

            }

        } catch (Exception e) {
            System.err.println("Errot: " + e.getMessage());
        } finally {
            Conexion.close();
        }


    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * *
     * Método para cargar ComboBox Cargos
     *
     * @throws SQLException
     * @return void Carga items del comboBox
     */
    final void cargarCargos() throws SQLException {
        jComboBoxCargo.removeAllItems();
        for (Cargo c : cargo.listarCargos()) {
            //cargoJCombo.addItem((Integer.toString( c.getId_cargo())));        //para listar por id y utilizar Int
            jComboBoxCargo.addItem(c.getCargo());                                  //Lo usamos con String
        }
    }

    /**
     * *
     * @return void carga los ComboBox de TipoDocumento
     */
    final void cargarTipoDocumento() {
        jComboBoxTipoDocumento.removeAllItems();
        for (TipoDocumento type : tipoDocumento.listarTipoDocumento()) {
            jComboBoxTipoDocumento.addItem(type.getTipoDocumento());                        //Para trabajar con String                      
            //jComboBoxTipoDocumento.addItem(Integer.toString(type.getId_tipoDocumento())); //Solo recibe un Integer no recigbe Integer
            //identificacionJTextField.add(type);                                           //No funciona agregandole el objeto
        }
    }

    final void cargarRol() throws SQLException {
        jComboBoxRol.removeAllItems();
        for (Rol r : rol.listarRol()) {
            jComboBoxRol.addItem(r.getDescripcion_rol());
        }
    }

    final void limpiarCampos() {
        jTextFieldDireccion.setText("");
        jTextFieldPrimerNombreCliente.setText("");
        jTextFieldSegundoNombre.setText("");
        jTextFieldEmail.setText("");
        jTextFieldIdentificacion.setText("");
        jTextFieldNickname.setText("");
        jTextFieldPrimerApellido.setText("");
        jTextFieldPrimerNombreCliente.setText("");
        jTextFieldSegundoApellido.setText("");;
        jTextFieldSegundoNombre.setText("");;
        jTextFieldTelefono.setText("");
        jPasswordFieldA.setText("");
        

        //dashPruebaAdso.goToDashboard();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UsuarioFormjPanel1;
    private javax.swing.JPanel UsuarioFormjPanel2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JComboBox<String> jComboBoxCargo;
    private javax.swing.JComboBox<String> jComboBoxRol;
    private javax.swing.JComboBox<String> jComboBoxTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelNickname1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelNickname1;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JPasswordField jPasswordFieldA;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldIdentificacion;
    private javax.swing.JTextField jTextFieldNickname;
    private javax.swing.JTextField jTextFieldPrimerApellido;
    private javax.swing.JTextField jTextFieldPrimerNombreCliente;
    private javax.swing.JTextField jTextFieldSegundoApellido;
    private javax.swing.JTextField jTextFieldSegundoNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JLabel passAJLabel1;
    // End of variables declaration//GEN-END:variables
}
