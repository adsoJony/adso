/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;                  //  Import para traer el BCrypt

/**
 *
 * @author jogof
 */
public class Logger {

    public boolean logged;
    public Rol rol;
    private Stakeholder stakeholder;
    

    public Logger() {
        this.stakeholder = new Stakeholder();
        this.logged = logged;
        this.rol = new Rol();
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Stakeholder getStakeholder() {
        return stakeholder;
    }

    public void setStakeholder(Stakeholder stakeholder) {
        this.stakeholder = stakeholder;
    }
    
    
    
    
    
    
    

    public boolean checkUser(String eMail, String pwd) throws SQLException {
        Boolean login = false;
        try {
            Boolean checkMail = stakeholder.checkEmail(eMail);
            
            if (checkMail){
                //System.out.println("Se validó ChaecMail");
                stakeholder = stakeholder.findStakeholderByEmail(eMail);
                //System.out.println("Stakeholder CheckUser "+stakeholder.toString()+"\n PSSW: "+stakeholder.getPsw_usuario());
                String pswDb = stakeholder.getPsw_usuario();
                //var emailDb = stakeholder.getEmail_usuario();
                
                //System.out.println("pass : "+pswDb);
                
                //String generatedHash = BCrypt.hashpw(pwd, BCrypt.gensalt(10));
                boolean matched = BCrypt.checkpw(pwd, pswDb);
                if (matched){
                    this.logged = true;
                    login = true;
                   JOptionPane.showMessageDialog(null, "Session Iniciada");
                }else{
                    JOptionPane.showMessageDialog(null,"Sessión no ha sido Iniciada... ");
                }
                
                
            }else{
                JOptionPane.showMessageDialog(null, "Los datos no coinciden");
            }
            
            
        } catch (SQLException e) {
            System.err.println("Error Login: "+e);
            
        }

        return login;

    }
    
    public String generarHash(String pwd){
        var generatedHash = BCrypt.hashpw(pwd, BCrypt.gensalt(10));
        
        return generatedHash;
        
    }
    
    public boolean checkHash(String originalPassword, String pwdDb){
        
        return BCrypt.checkpw(originalPassword, pwdDb);
                       
    }    

}
