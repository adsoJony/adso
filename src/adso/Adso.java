/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adso;

//import java.io.UnsupportedEncodingException;
import com.mysql.cj.jdbc.DatabaseMetaData;
import com.sun.jdi.connect.spi.Connection;
import conexion.Conexion;
import controller.Cargo;
import controller.Cliente;
import java.sql.SQLException;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
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
         

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }

}
