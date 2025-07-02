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

/**
 *
 * @author jogof
 */
public class Adso {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws Exception {

        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));      //Línea para que aparescan las tildes en la consila!!

        try {
            
            var usuario = new Usuario();
            
            usuario.setPsw_usuario("PassworStakeholder");
            usuario.setEmail_usuario("email@mail.com");
            usuario.setPrimerNombre_usuario("StakeholderName");
            usuario.setPrimerApellido_usuario("stakeholderApellido");
            usuario.setNickName_usuario("nicknameStakeholder");
            usuario.setId_tipoUsuario_usuario(1);
            usuario.setId_rol_usuario(4);
            
            
            var stakeholder = new Stakeholder();
            
            stakeholder.setDocumento_stakeholder(1045666207);
            stakeholder.setId_cargo_stakeholder(1);
            stakeholder.setId_tipoDocumento_stakeholder(1);
            
            stakeholder.inputStakeholder(stakeholder, usuario);
            
            
            System.out.println("Imprimiendo Stakehholder con función find.");
            System.out.println(stakeholder.findStakeholder(6));
            
            System.out.println("imprimiendo lista Stakeholder");
            var stakeholders = stakeholder.listarStakeholder();
            for (Stakeholder stk : stakeholders){
                System.out.println(stk);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }

    }

}
