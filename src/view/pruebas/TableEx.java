/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.pruebas;

import controller.Cliente;
import java.awt.BorderLayout;
import java.awt.ScrollPane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jogof
 */
public class TableEx extends JPanel  {
    
    private JTable tabla;
    

    public TableEx() throws SQLException {
        setLayout(new BorderLayout());
        tabla = new JTable();
        tabla.add(new ScrollPane(), BorderLayout.CENTER);
        //cargarTabla();
    }
    
        
    //  Métodos de la tabla
    
    
    //  Cargamos la tabla con cliente
    public void cargarTabla() throws SQLException{
        try {
            
            List<Cliente> listaClientes = new ArrayList();
       Cliente cliente = new Cliente();
       listaClientes = cliente.listarClientes();
       
        //   Aqui tomamos el objeto de tipo Cliente por ejemplo y lo convertimos a objeto bidimencional o array bidimencional
       
       Object[][] data = new Object[listaClientes.size()][4];
       //   Recorremos un bucle for con la dimención del objeto
       for (int i=0; i < listaClientes.size(); i++){
           Cliente c= listaClientes.get(i);
           data[i][0] = c.getId_cliente();
           data[i][1] = c.getPrimerNombre_usuario();
           data[i][2] = c.getPrimerApellido_usuario();
           data[i][3] = c.getRazonSocial_cliente();
       }
       
       //   Seteamos las columnas
       String[] columnas = {"Id","Nombre","Apellido","Razón Social"};
       
       
       //   Creamos una DefaultTableMode
        DefaultTableModel modelo = new DefaultTableModel(data,columnas);
        tabla.setModel(modelo);
       
        } catch (SQLException e) {
            System.err.print("Error Jtable: "+e.getMessage());
        }
    }
    
    
}
