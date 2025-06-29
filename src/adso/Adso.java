/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adso;


import controller.Usuario;
import java.util.List;
import controller.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import model.UsuarioModel;

/**
 *
 * @author jogof
 */
public class Adso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        // TODO code application logic here
        try {
            
            Usuario usuario = new Usuario();
            //Cliente cliente = new Cliente();
            usuario.setPrimerNombre_usuario("jonathan");
            usuario.setPrimerApellido_usuario("Gomez");
            usuario.setNickName_usuario("usuario");
            usuario.setEmail_usuario("jogofra_satelite@hotmail.com");
            usuario.setPsw_usuario("password");
            usuario.setId_tipoUsuario_usuario(1);
            usuario.setId_rol_usuario(1);
/*
            cliente.setRazonSocial_cliente("Razon social");
            cliente.setId_cargo_cliente(1);
            cliente.setDireccion_cliente("Cra 50 72 72");
            cliente.setId_tipoDocumento_cliente(1);
            cliente.setDocumento_cliente(1045666207);
            cliente.setRazonSocial_cliente("Razon social");
           // usuario.inputUsuario(usuario);

           cliente.inputCliente(cliente, usuario);

             */

         var clientes = Cliente.listarClientes();
         var usuarios = Usuario.listarUsuarios();
         System.out.println("imprimiendo Clientes");
          for (Cliente usr : clientes) {
                System.out.println(usr.getId_cliente()+"  "+usr.getNickName_usuario());
          }
          System.out.println("\r");
          
          System.out.println("Imprimiendo Usuarios");
          for (Usuario usr : usuarios){
              System.out.println(usr.getId_usuario()+"  "+usr.getPrimerNombre_usuario()+"   "+usr.getPrimerApellido_usuario());
          }
          
          
          //Usuario validacion = new Usuario();
          //var val = "jony@gmail.com";
         var val= usuario.checkEmail(usuario);
          System.out.println("la validación: "+usuario.getEmail_usuario()+" es "+val);
          
            
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }

    }

}
