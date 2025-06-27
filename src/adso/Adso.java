/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adso;

import conexion.Conexion;
import controller.Usuario;
import java.util.List;
import model.UsuarioModel;
import controller.Cliente;

/**
 *
 * @author jogof
 */
public class Adso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Usuario usuario = new Usuario();
        usuario.setPrimerNombre_usuario("jonathan");
        usuario.setPrimerApellido_usuario("Gomez");
        usuario.setNickName_usuario("usuario");
        usuario.setEmail_usuario("email.com");
        usuario.setPsw_usuario("password");
        usuario.setId_tipoUsuario_usuario(1);
        usuario.setId_rol_usuario(1);
        
        usuario.inputUsuario(usuario);
        
    }

}
