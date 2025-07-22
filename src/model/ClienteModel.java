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
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan Gómez
 */
public class ClienteModel {

    Conexion con;
    PreparedStatement ps;
    ResultSet rs;

    public void ClienteModel(Conexion con) {
        this.con = con;
    }

    /**
     * Buscar cliente por Id de tipo int
     *
     * @param idCliente
     * @return Cliente
     * @throws SQLException
     */
    public Cliente findClienteById(int idCliente) throws SQLException {
        Cliente cliente = new Cliente();
        //cliente.setTipoDocumento(new TipoDocumento());
        //cliente.setRol(new Rol());
        //cliente.setTipoUsuario(new TipoUsuario());

        String sql = "Select * from cliente "
                + "join usuarios on id_usuario=id_usuario_cliente "
                + "join cargo on id_cargo_cliente=id_cargo "
                + "join tipodocumento on id_tipoDocumento_cliente=id_tipoDocumento "
                + "join rol on id_rol=id_rol_usuario "
                + "join tipousuario on id_tipoUsuario=id_tipoUsuario_usuario "
                + "where id_cliente=? and deleted=0";
        try {
            ps = Conexion.prepararConsulta(sql);
            ps.setInt(1, idCliente);
            rs = ps.executeQuery();
            if (rs.next()) {
                //Datos de Cliente

                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setId_usuario_cliente(rs.getInt("id_usuario_cliente"));
                cliente.setId_cargo_cliente(rs.getInt("id_cargo_cliente"));
                //cliente.setId_cargo_cliente(rs.getInt("id_cargo"));
                cliente.cargo.setId_cargo(rs.getInt("id_cargo"));
                cliente.cargo.setCargo(rs.getString("cargo"));
                cliente.setDireccion_cliente(rs.getString("direccion_cliente"));
                cliente.setTelefono_cliente(rs.getInt("telefono_cliente"));
                cliente.setId_tipoDocumento_cliente(rs.getInt(rs.getInt("id_tipoDocumento_cliente")));
                cliente.tipoDocumento.setId_tipoDocumento(rs.getInt("id_tipoDocumento_cliente"));
                cliente.tipoDocumento.setTipoDocumento(rs.getString("tipoDocumento"));
                cliente.setDocumento_cliente(rs.getInt("documento_cliente"));
                cliente.setRazonSocial_cliente(rs.getString("razonSocial_cliente"));
                //Datos de usuario
                cliente.setId_usuario(rs.getInt("id_usuario"));
                cliente.setNickName_usuario(rs.getString("nickName_usuario"));
                cliente.setPrimerNombre_usuario(rs.getString("primerNombre_usuario"));
                cliente.setSegundoNombre_usuario(rs.getString("segundoNombre_usuario"));
                cliente.setPrimerApellido_usuario(rs.getString("primerApellido_usuario"));
                cliente.setSegundoApellido_usuario(rs.getString("segundoApellido_usuario"));
                cliente.setEmail_usuario(rs.getString("email_usuario"));
                cliente.rol.setId_rol(rs.getInt("id_rol_usuario"));
                cliente.rol.setDescripcion_rol(rs.getString("descripcion_rol"));
                //cliente.getRol().setDescripcion_rol(rs.getString("descripcion_rol"));
                Date fechaCreacion_u = rs.getDate("fechaCreacion");
                LocalDate gechaCreacion = (fechaCreacion_u != null) ? fechaCreacion_u.toLocalDate() : null;
                cliente.setFechaCreacion(gechaCreacion);
                Date fechaActualizacion_u = rs.getDate("fechaActualizacion");
                LocalDate fechaActualizacion = (fechaActualizacion_u != null) ? fechaActualizacion_u.toLocalDate() : null;
                cliente.setFechaActualizacion(fechaActualizacion);
                Date fechaEliminado_u = rs.getDate("fechaEliminado");
                LocalDate fechaEliminado = (fechaEliminado_u != null) ? fechaEliminado_u.toLocalDate() : null;
                cliente.setFechaEliminado(fechaEliminado);
                cliente.setActivation_token(rs.getString("activation_token"));
                cliente.setReset_token(rs.getString("reset_token"));
                Date reset_token_expires_at_u = rs.getDate("reset_token_expires_at");
                LocalDate reset_token_expires_at = (reset_token_expires_at_u != null) ? reset_token_expires_at_u.toLocalDate() : null;
                cliente.setReset_token_expires_at(reset_token_expires_at);
                cliente.setActive(rs.getBoolean("active"));
                cliente.setAvatar_usuario(rs.getString("avatar_usuario"));
                Date fechaRegistro = rs.getDate("fecha_registroUsuario");
                LocalDate fecha_registroUsuario = (fechaRegistro != null) ? fechaRegistro.toLocalDate() : null;
                cliente.setFecha_registroUsuario(fecha_registroUsuario);
                cliente.tipoUsuario.setId_tipoUsuario(rs.getInt("id_tipoUsuario_usuario"));
                cliente.tipoUsuario.setTipoUsuario(rs.getString("tipoUsuario"));
                cliente.setDeleted(rs.getBoolean("deleted"));
            } else {
                System.err.println("No se pudo encontrar al cliente buscado");
            }
            rs.close();
            ps.close();

        } catch (SQLException e) {
            System.err.println("error: " + e);
        } finally {
            Conexion.close();
        }
        return cliente;
    }

    /**
     * Función para listar clientes. Se obtiene una lista de usuarios de tipo
     * Cliente.
     *
     * @return Lista de Usuarios de tipo Cliente.
     * @throws SQLException
     */
    public List<Cliente> listarClientes() throws SQLException {
        List<Cliente> clientes = new ArrayList();
        String sql = "Select primerNombre_usuario, primerApellido_usuario, active, id_cliente, direccion_cliente, telefono_cliente, email_usuario, razonSocial_cliente, documento_cliente, id_tipoDocumento_cliente, tipoDocumento "
                + "from cliente "
                + "join usuarios on id_usuario_cliente = id_usuario "
                + "join tipoDocumento on id_tipoDocumento=id_tipoDocumento_cliente "
                + "where usuarios.deleted=0";

        try {
            ps = Conexion.prepararConsulta(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setPrimerNombre_usuario(rs.getString("primerNombre_usuario"));
                cliente.setPrimerApellido_usuario(rs.getString("primerApellido_usuario"));
                cliente.setDireccion_cliente(rs.getString("direccion_cliente"));
                cliente.setEmail_usuario(rs.getString("email_usuario"));
                cliente.setTelefono_cliente(rs.getInt("telefono_cliente"));
                cliente.setDocumento_cliente(rs.getInt("documento_cliente"));
                cliente.tipoDocumento.setId_tipoDocumento(rs.getInt("id_tipoDocumento_cliente"));
                cliente.tipoDocumento.setTipoDocumento(rs.getString("tipoDocumento"));
                cliente.setId_tipoDocumento_cliente(rs.getInt("id_tipoDocumento_cliente"));
                cliente.setDocumento_cliente(rs.getInt("documento_cliente"));
                cliente.setRazonSocial_cliente(rs.getString("razonSocial_cliente"));
                cliente.setActive(rs.getBoolean("active"));
                clientes.add(cliente);
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e);
        } finally {
            con.close();
        }
        return clientes;
    }

    /**
     * insertar cliente, y debe ingresar usuario
     *
     * @param cliente
     * @param usuario
     * @return Id del usuario de tipo int.
     * @throws SQLException
     */
    public int inputCliente(Cliente cliente, Usuario usuario) throws SQLException {
        var id_cliente = 0;
        // String sqlUsuario = "insert into usuarios (nickname_usuario, primerNombre_usuario, segundoNombre_usuario, primerApellido_usuario, segundoApellido_usuario, ) values ();";
        String sqlCliente = "insert into cliente(id_usuario_cliente, id_cargo_cliente, direccion_cliente, telefono_cliente, id_tipoDocumento_cliente, documento_cliente, razonSocial_cliente)"
                + " values(?,?,?,?,?,?,?)";

        ps = Conexion.prepararConsulta(sqlCliente, Statement.RETURN_GENERATED_KEYS);
        int id_usuario;

        try {
            Conexion.conexionSetAutoCommit(false);
            id_usuario = usuario.inputUsuario(usuario);

            if (id_usuario != 0) {

                System.out.println("Usuario registrado desde cliente!");

                try {
                    ps.setInt(1, id_usuario);
                    //ps.setInt(2, cliente.getId_cargo_cliente());
                    ps.setInt(2, cliente.getId_cargo_cliente());
                    ps.setString(3, cliente.getDireccion_cliente());
                    ps.setInt(4, cliente.getTelefono_cliente());
                    ps.setInt(5, cliente.getId_tipoDocumento_cliente());
                    ps.setInt(6, cliente.getDocumento_cliente());
                    ps.setString(7, cliente.getRazonSocial_cliente());

                    if (ps.executeUpdate() != 0) {
                        System.out.println("Cliente Ingresado.");
                        rs = ps.getGeneratedKeys();
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
        String sql = "update cliente set id_cargo_cliente=?, direccion_cliente=?, telefono_cliente=?, id_tipoDocumento_cliente=?,"
                + "documento_cliente=?, razonSocial_cliente=? where id_cliente=?";

        try {

            if (usuario.updateUsuario(usuario)) {
                ps = Conexion.prepararConsulta(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, cliente.getId_cargo_cliente());
                ps.setString(2, cliente.getDireccion_cliente());
                ps.setInt(3, cliente.getTelefono_cliente());
                ps.setInt(4, cliente.getId_tipoDocumento_cliente());
                ps.setInt(5, cliente.getDocumento_cliente());
                ps.setString(6, cliente.getRazonSocial_cliente());
                ps.setInt(7, cliente.getId_cliente());  //Where id_cliente=id_cliente

                if (ps.executeUpdate() != 0) {
                    update = true;
                    JOptionPane.showMessageDialog(null, "Cliente actualizado con exito!");
                }
            }

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
    public boolean delete(int id_usuario_cliente) throws SQLException {
        boolean deleted = false;
        String sql = "UPDATE usuarios "
                + "SET deleted=1, active=0 "
                + "WHERE=id_usuario=?";
        try {
            ps = Conexion.prepararConsulta(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id_usuario_cliente);

            if (ps.executeUpdate() != 0) {
                deleted = true;
                
                /**
                 * Ejecutamos para verificar el id del eliminado
                 */
                rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    //id_deleted = rs.getInt(1);
                }
            }
            rs.close();
            ps.close();

        } catch (SQLException e) {
            System.err.println("Error delete Usuario: " + e.getMessage());
        } finally {
            Conexion.close();
        }

        return deleted;
    }

}
