/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexion.Conexion;
import controller.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import controller.Usuario;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jogof
 */
public class ClienteModel {

    Conexion con;

    public void ClienteModel(Conexion con) {
        this.con = con;
    }

    public Cliente findCliente(int idCliente) throws SQLException {
        var cliente = new Cliente();
        String sql = "select * from cliente where id_cliente=?";

        //ResultSet rs;
        try {
            PreparedStatement ps;
            ps = Conexion.prepararConsulta(sql);
            ps.setInt(1, idCliente);
            ResultSet rs;
            rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("se encontró cliente:");
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setId_usuario_cliente(rs.getInt("id_usuario_cliente"));
                cliente.setId_cargo_cliente(rs.getInt("id_cargo_cliente"));
                cliente.setDireccion_cliente(rs.getString("direccion_cliente"));
                cliente.setTelefono_cliente(rs.getInt("telefono_cliente"));
                cliente.setId_tipoDocumento_cliente(rs.getInt("id_tipoDocumento_cliente"));
                cliente.setDocumento_cliente(rs.getInt("documento_cliente"));
                cliente.setRazonSocial_cliente(rs.getString("razonSocial_cliente"));

            } else {
                System.err.println("No se encontró cliente");
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }
        return cliente;
    }

    public List<Cliente> listarClientes() throws SQLException {
        List<Cliente> clientes = new ArrayList();
        String sql = "Select * "
                + " from cliente "
                + "join usuarios on id_usuario_cliente = id_usuario "
                + "where deleted=0";

        try {
            PreparedStatement ps = Conexion.prepararConsulta(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setId_usuario_cliente(rs.getInt("id_usuario_cliente"));
                cliente.setId_cargo_cliente(rs.getInt("id_cargo_cliente"));
                cliente.setDireccion_cliente(rs.getString("direccion_cliente"));
                cliente.setTelefono_cliente(rs.getInt("telefono_cliente"));
                cliente.setId_tipoDocumento_cliente(rs.getInt("id_tipoDocumento_cliente"));
                cliente.setDocumento_cliente(rs.getInt("documento_cliente"));
                cliente.setRazonSocial_cliente(rs.getString("razonSocial_cliente"));

                clientes.add(cliente);
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }
        return clientes;
    }

    public int InputCliente(Cliente cliente, Usuario usuario) throws SQLException {
        var id_cliente = 0;
        // String sqlUsuario = "insert into usuarios (nickname_usuario, primerNombre_usuario, segundoNombre_usuario, primerApellido_usuario, segundoApellido_usuario, ) values ();";
        String sqlCliente = "insert into cliente(id_usuario_cliente, id_cargo_cliente, direccion_cliente, telefono_cliente, id_tipoDocumento_cliente, documento_cliente, razonSocial_cliente)"
                + " values(?,?,?,?,?,?,?)";

        PreparedStatement ps;
        ps = Conexion.prepararConsulta(sqlCliente, Statement.RETURN_GENERATED_KEYS);
        int id_usuario;

        try {
            Conexion.conexionSetAutoCommit(false);
            id_usuario = usuario.inputUsuario(usuario);

            if (id_usuario != 0) {

                System.out.println("Usuario registrado desde cliente!");

                try {
                    ps.setInt(1, id_usuario);
                    ps.setInt(2, cliente.getId_cargo_cliente());
                    ps.setString(3, cliente.getDireccion_cliente());
                    ps.setInt(4, cliente.getTelefono_cliente());
                    ps.setInt(5, cliente.getId_tipoDocumento_cliente());
                    ps.setInt(6, cliente.getDocumento_cliente());
                    ps.setString(7, cliente.getRazonSocial_cliente());

                    if (ps.executeUpdate() != 0) {
                        System.out.println("Cliente Ingresado.");
                        ResultSet rs = ps.getGeneratedKeys();
                        if (rs.next()) {
                            id_cliente = rs.getInt(1);
                            System.out.println("EL id del cliente registrado es: " + id_cliente);
                        }

                        rs.close();
                    }

                    Conexion.commit();
                } catch (SQLException e) {
                    System.err.println("Error: " + e);
                }
            } else {
                Conexion.rollBack();
            }
            Conexion.commit();
            ps.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e);

        }
        Conexion.close();
        return id_cliente;

    }

    //Update de cliente recibiendo el id dentro del objeto usuario
    public boolean updateCliente(Cliente cliente, Usuario usuario) throws SQLException {
        var update = false;
        String sql = "update cliente set id_cargo_cliente=?, direccion_cliente=?, telefono_cliente=?, id_documento_cliente=?,"
                + "documento_cliente=?, razonSocial_cliente=? where id_cliente=?";
        PreparedStatement ps;
        try {
            ps = Conexion.prepararConsulta(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cliente.getId_cargo_cliente());
            ps.setString(2, cliente.getDireccion_cliente());
            ps.setInt(3, cliente.getTelefono_cliente());
            ps.setInt(4, cliente.getId_tipoDocumento_cliente());
            ps.setInt(5, cliente.getDocumento_cliente());
            ps.setString(6, cliente.getRazonSocial_cliente());
            ps.setInt(7, cliente.getId_cliente());

        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }

        return update;
    }
    /*
    public boolean deleteCliente(int id_usuario){
        var deleted = false;
        
        return deleted;
    }*/
}
