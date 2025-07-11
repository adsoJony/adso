/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adso;

//import java.io.UnsupportedEncodingException;

import controller.Cargo;
import java.sql.SQLException;
import java.io.UnsupportedEncodingException;
import view.ConsoleView;                        //Menu de consola - ConsoleView
import view.DashBoardAdso;
import view.combos.CargoCombo;

/**
 *
 * @author Jonathan Gomez
 */
public class AdsoMain {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.io.UnsupportedEncodingException
     */
    public static void main(String[] args) throws SQLException, UnsupportedEncodingException {

        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));      //Línea para que aparescan las tildes en la consola!!

        try {

            //ConsoleView.menu();
            mostarDashBoardAdso();
           
            CargoCombo cargoCombo = new CargoCombo();
            for (Cargo cargo : cargoCombo.listarCargos()){
                System.out.println(cargo.getCargo());
            }
           

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }

    /**
     * Método para mostrar el Frame DashBoardAdso de View
     * 
     * @return Mostramos el Frame DashBoardAdso de el paquete view
     */
    final static void mostarDashBoardAdso() throws SQLException {
        DashBoardAdso dashBoardAdso = new DashBoardAdso();
        dashBoardAdso.setVisible(true);

    }

}
