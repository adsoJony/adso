/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import conexion.Conexion;
import controller.Cliente;
import java.S

/**
 *
 * @author jogof
 */
public class ClienteModel {

    Conexion con;
    
    
    public void ClienteModel(Conexion con){
    this.con = con;    
    }
    
    public int InputCliente(Cliente cliente) {
        int id_cliente = 0;
        String sqlUsuario = "insert into usuarios (primerNombre_usuario, primerApellido_usuario, nickname_usuario, ) values ();";
        String sqlCliente = "insert into cliente() values()";
        
        
        
        try {
            PreparedStatement ps;
            ps.Conexion.
                    
        } catch (SQLException e) {
            System.err.println("Error: "+e)
        }
        
        return id_cliente;
        
        
    }
}
