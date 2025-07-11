package view.cliente;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DashboardApp extends JFrame  {

    // Panel con CardLayout
    private JPanel panelCentral;
    private CardLayout cardLayout;
    InsertCliente insertCliente;

    public DashboardApp() throws SQLException {
        this.insertCliente = new InsertCliente();
        setTitle("Dashboard CRUD");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel lateral con botones
        JPanel panelMenu = new JPanel();
        panelMenu.setLayout(new GridLayout(10, 1));
        panelMenu.setBackground(new Color(200, 220, 240));

        JButton btnUsuarios = new JButton("Usuarios");
        JButton btnEquipos = new JButton("Equipos");
        JButton btnComprobantes = new JButton("Comprobantes");
        JButton btnInsertCliente = new JButton("Insertar Cliente");

        panelMenu.add(btnUsuarios);
        panelMenu.add(btnEquipos);
        panelMenu.add(btnComprobantes);
        panelMenu.add(btnInsertCliente);
        

        add(panelMenu, BorderLayout.WEST);

        // Panel central con CardLayout
        cardLayout = new CardLayout();
        panelCentral = new JPanel(cardLayout);

        panelCentral.add(new UsuariosPanel(), "usuarios");
        panelCentral.add(new EquiposPanel(), "equipos");
        panelCentral.add(new ComprobantesPanel(), "comprobantes");
        panelCentral.add(insertCliente, "insertCliente");

        add(panelCentral, BorderLayout.CENTER);

        // Acciones de los botones
        btnUsuarios.addActionListener(e -> cardLayout.show(panelCentral, "usuarios"));
        btnEquipos.addActionListener(e -> cardLayout.show(panelCentral, "equipos"));
        btnComprobantes.addActionListener(e -> cardLayout.show(panelCentral, "comprobantes"));
        btnInsertCliente.addActionListener(e -> cardLayout.show(panelCentral, "insertCliente"));
    }

    // Panel de ejemplo para Usuarios
    class UsuariosPanel extends JPanel {
        public UsuariosPanel() {
            setLayout(new BorderLayout());
            add(new JLabel("CRUD de Usuarios", SwingConstants.CENTER), BorderLayout.NORTH);
            add(new JTextArea("Aquí irá el formulario y la tabla de usuarios..."), BorderLayout.CENTER);
        }
    }

    // Panel de ejemplo para Equipos
    class EquiposPanel extends JPanel {
        public EquiposPanel() {
            setLayout(new BorderLayout());
            add(new JLabel("CRUD de Equipos", SwingConstants.CENTER), BorderLayout.NORTH);
            add(new JTextArea("Aquí irá el formulario y la tabla de equipos..."), BorderLayout.CENTER);
        }
    }

    // Panel de ejemplo para Comprobantes de Servicio
    class ComprobantesPanel extends JPanel {
        public ComprobantesPanel() {
            setLayout(new BorderLayout());
            add(new JLabel("CRUD de Comprobantes", SwingConstants.CENTER), BorderLayout.NORTH);
            add(new JTextArea("Aquí irá el formulario y la tabla de comprobantes..."), BorderLayout.CENTER);
        }
    }

    public static void main(String[] args) throws SQLException {
        SwingUtilities.invokeLater(() -> {
            try {
                new DashboardApp().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(DashboardApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
}
