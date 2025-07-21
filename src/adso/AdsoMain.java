/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adso;

//import java.io.UnsupportedEncodingException;
import java.io.UnsupportedEncodingException;                      //Menu de consola - ConsoleView
import view.DashBoardAdso;
import java.sql.SQLException;
import view.Login;


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
            //runDashBoardAdso();          //Mostramos el DashBoardAdso frame con sus cardLayouts
            runLogin();
            
            
            
            /**
             *
             * Logger session = new Logger();
             *
             * var checkSes = session.login("jonathangomezf@gmail.com",
             * "password");
             *
             * System.out.println("\n \t Check Method: "+checkSes);
             *
             */
            
            
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }

    /**
     * Método para mostrar el Frame DashBoardAdso de View
     *
     * @return Mostramos el Frame DashBoardAdso de el paquete view
     */
    final static void runDashBoardAdso() throws SQLException {
        DashBoardAdso dashBoardAdso = new DashBoardAdso();
        dashBoardAdso.setVisible(true);
    }
    
    final static void runLogin() throws SQLException{
        Login login = new Login();
        login.setVisible(true);
        
        
        
        
    }

}
