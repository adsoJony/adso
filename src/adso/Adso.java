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
            
            Usuario usuario = new Usuario();
            Cliente cliente = new Cliente();
            usuario.setPrimerNombre_usuario("Jonathan");          
            usuario.setPrimerApellido_usuario("Gomez");
            usuario.setSegundoApellido_usuario("Franco");
            usuario.setNickName_usuario("usuario");
            usuario.setEmail_usuario("correo@mail.com");
            usuario.setPsw_usuario("password");
            usuario.setId_tipoUsuario_usuario(1);
            usuario.setId_rol_usuario(1);
            
            cliente.setRazonSocial_cliente("Razon social");
            cliente.setId_cargo_cliente(1);
            cliente.setDireccion_cliente("Cra 50 72 72");
            cliente.setId_tipoDocumento_cliente(1);
            cliente.setDocumento_cliente(1045666207);
            cliente.setRazonSocial_cliente("Razon social");
           // usuario.inputUsuario(usuario);

          // cliente.inputCliente(cliente, usuario);

             
            //var update = usuario.updateUsuario(usuario, 113);
            

            //var usuario = usuario.findUsuario(71);
            //System.out.println("Nombre: "+usuario.getPrimerNombre_usuario()+" "+"Apellido: "+usuario.getPrimerApellido_usuario());
            //System.out.println(usuario.toString());
            //var cliente = Cliente.findCliente(3);
            //System.out.println("Imprimiendo el dato del cliente que se está buscando: "+cliente.getRazonSocial_cliente());
            
            //Cliente cliente = new Cliente();
            //var clientes = cliente.listarClientes();

            //var usuario = new Usuario();
            var usuarios = usuario.listarUsuarios();
/*
            System.out.println("imprimiendo Clientes");
            for (Cliente usr : clientes) {
                System.out.println(usr);
            }
            System.out.println("\r");

            System.out.println("Imprimiendo Usuarios");
            for (Usuario usr : usuarios) {
                System.out.println(usr.getId_usuario() + "  " + usr.getPrimerNombre_usuario() + "   " + usr.getPrimerApellido_usuario());
                System.out.println(usr);
            }
*/
            var deleted = usuario.deleteUsuario(74);
            System.out.println("Deleted: "+deleted);
            
             System.out.println("Imprimiendo Usuarios");
            for (Usuario usr : usuarios) {
                System.out.println(usr.getId_usuario() + "  " + usr.getPrimerNombre_usuario() + "   " + usr.getPrimerApellido_usuario());
                System.out.println(usr);
            }
            //System.out.println("El update ha sido: "+update);
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }

    }

}
