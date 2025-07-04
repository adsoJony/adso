/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adso;

import conexion.Conexion;
import controller.Usuario;
import java.util.List;
import controller.Cliente;
//import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.ArrayList;
import model.UsuarioModel;
import controller.Stakeholder;
import model.StakeholderModel;
import controller.Marca;
import controller.Ups;
import java.io.UnsupportedEncodingException;
import view.ConsoleView;

/**
 *
 * @author jogof
 */
public class Adso {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.io.UnsupportedEncodingException
     */
    public static void main(String[] args) throws SQLException, UnsupportedEncodingException {

        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));      //Línea para que aparescan las tildes en la consola!!

        try {

            ConsoleView.menu();
            
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }

    }

}
