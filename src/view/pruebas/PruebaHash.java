/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view.pruebas;

import org.mindrot.jbcrypt.BCrypt;                  //  Import para traer el BCrypt
import controller.*;
import java.sql.SQLException;


/**
 *
 * @author jogof
 */
public class PruebaHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        String originalPassword = "password";
        String generatedSecuredPasswordHash = BCrypt.hashpw(originalPassword, BCrypt.gensalt(10));
        
        Stakeholder stakeholder = new Stakeholder();
        Logger login = new Logger();
        var checked = login.checkUser("mail@mail.com", "password");
        
        if ( checked){
            System.out.println("Verificaión en TRUE");
        }else{
            System.out.println("Verificación en FALSE");
        }
        
        
        
        
        
        System.out.println(generatedSecuredPasswordHash);
        
        //boolean matched = BCrypt.checkpw(originalPassword, generatedSecuredPasswordHash);
        //System.out.println(matched);
    }

}
