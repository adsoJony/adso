/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.pruebas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jogof
 */
public class JtablePrueba {

    /**
     * public void listarEmpleadosEnTabla(){
     *
     *
     * try {
     *
     * EmpleadoModel modelo =new EmpleadoModel();
     *
     * List<Empleado> listaEmpleados = modelo.obtenerEmpleados();
     *
     * DefaultTableModel tabla= new DefaultTableModel();
     *
     * tabla.addColumn("ID");
     *
     * tabla.addColumn("Número cédula");
     *
     * tabla.addColumn("Primer Nombre");
     *
     * tabla.addColumn("Segundo Nombre");
     *
     * tabla.addColumn("Primer Apellido");
     *
     * tabla.addColumn("Segundo Apellido");
     *
     * tabla.addColumn("Número del Célular");
     *
     * tabla.addColumn ("Correo Electrónico");
     *
     *
     * // se agrega cada fila de empleado a la Tabla //
     *
     * for (Empleado e:listaEmpleados){
     *
     * Object[] fila = new Object[]{
     *
     * e.getId_empleado(),
     *
     * e.getNumeroCedula_empleado(),
     *
     * e.getPrimerNombre_empleado(),
     *
     * e.getSegundoNombre_empleado(),
     *
     * e.getPrimerApellido_empleado(),
     *
     * e.getSegundoApellido_empleado(),
     *
     * e.getNumeroCelular_empleado(),
     *
     * e.getCorreoElectronico_empleado()
     *
     * };
     *
     * tabla.addRow(fila);
     *
     * }
     *
     * //asignamos el modelo a la tabla //
     *
     * jTable1_TABLAEMPLEADO.setModel(tabla);
     *
     *
     * } catch (Exception e) {
     *
     * JOptionPane.showMessageDialog(null, "Error al obtener lista de empleados"
     * + e.getMessage());
     *
     * }
     *
     *
     * }
     *
     */
}
