/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexion.Conexion;
import controller.Stakeholder;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import controller.Usuario;
import java.sql.Statement;
import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author JOES
 */
public class StakeholderModel {

    PreparedStatement ps;
    ResultSet rs;

    public StakeholderModel() {
    }

    public Stakeholder findStakeholderById(int idStakeholder) {

        Stakeholder stakeholder = new Stakeholder();
        String sql = "Select * from stakeholder "
                + "join usuarios on id_usuario=id_usuario_stakeholder "
                + "join cargo on id_cargo_stakeholder=id_cargo "
                + "join tipodocumento on id_tipoDocumento_stakeholder=id_tipoDocumento "
                + "join rol on id_rol=id_rol_usuario "
                + "join tipousuario on id_tipoUsuario=id_tipoUsuario_usuario "
                + "where id_stakeholder=?";
        try {
            ps = Conexion.prepararConsulta(sql);
            ps.setInt(1, idStakeholder);
            rs = ps.executeQuery();
            if (rs.next()) {
                //Datops de Stakeholder
                stakeholder.setId_stakeholder(rs.getInt("id_Stakleholder"));
                stakeholder.setDocumento_stakeholder(rs.getInt("documento_stakeholder"));
                stakeholder.cargo.setId_cargo(rs.getInt("id_cargo_stakeholder"));
                stakeholder.cargo.setCargo(rs.getString("cargo"));
                stakeholder.tipoDocumento.setId_tipoDocumento(rs.getInt("id_tipoDocumento_stakeholder"));
                stakeholder.tipoDocumento.setTipoDocumento(rs.getString("tipoDocumento"));
                stakeholder.setId_usuario_stakeholder(rs.getInt("id_usuario_stakeholder"));
                Date fechaCreacion_s = rs.getDate("fechaCreación");
                LocalDate fechaCreacion_stakeholder = (fechaCreacion_s != null) ? fechaCreacion_s.toLocalDate() : null;
                stakeholder.setFechaCreacion(fechaCreacion_stakeholder);
                Date fechaActualizacion_s = rs.getDate("fechaActualizacion");
                LocalDate fechaActualizacion_stakeholder = (fechaActualizacion_s != null) ? fechaActualizacion_s.toLocalDate() : null;
                stakeholder.setFechaActualizacion(fechaActualizacion_stakeholder);
                Date fechaEliminado_s = rs.getDate("fechaEliminado");
                LocalDate fechaEliminado_stakeholder = (fechaEliminado_s != null) ? fechaEliminado_s.toLocalDate() : null;
                stakeholder.setFechaEliminado(fechaEliminado_stakeholder);

                //Datos de usuario
                stakeholder.setId_stakeholder(rs.getInt("id_usuario"));
                stakeholder.setNickName_usuario(rs.getString("nickName_usuario"));
                stakeholder.setPrimerNombre_usuario(rs.getString("primerNombre_usuario"));
                stakeholder.setSegundoNombre_usuario(rs.getString("segundoNombre_usuario"));
                stakeholder.setPrimerApellido_usuario(rs.getString("primerApellido_usuario"));
                stakeholder.setSegundoApellido_usuario(rs.getString("segundoApellido_usuario"));
                stakeholder.setEmail_usuario(rs.getString("email_usuario"));
                stakeholder.getRol().setId_rol(rs.getInt("id_rol_usuario"));
                stakeholder.getRol().setDescripcion_rol(rs.getString("descripcion_rol"));
                Date fechaCreacion_u = rs.getDate("fechaCreacion");
                LocalDate gechaCreacion = (fechaCreacion_u != null) ? fechaCreacion_u.toLocalDate() : null;
                stakeholder.setFechaCreacion(gechaCreacion);
                Date fechaActualizacion_u = rs.getDate("fechaActualizacion");
                LocalDate fechaActualizacion = (fechaActualizacion_u != null) ? fechaActualizacion_u.toLocalDate() : null;
                stakeholder.setFechaActualizacion(fechaActualizacion);
                Date fechaEliminado_u = rs.getDate("fechaEliminado");
                LocalDate fechaEliminado = (fechaEliminado_u != null) ? fechaEliminado_u.toLocalDate() : null;
                stakeholder.setFechaEliminado(fechaEliminado);
                stakeholder.setActivation_token(rs.getString("activation_token"));
                stakeholder.setReset_token(rs.getString("reset_token"));
                Date reset_token_expires_at_u = rs.getDate("reset_token_expires_at");
                LocalDate reset_token_expires_at = (reset_token_expires_at_u != null) ? reset_token_expires_at_u.toLocalDate() : null;
                stakeholder.setReset_token_expires_at(reset_token_expires_at);
                stakeholder.setActive(rs.getBoolean("active"));
                stakeholder.setAvatar_usuario(rs.getString("avatar_usuario"));
                Date fechaRegistro = rs.getDate("fecha_registroUsuario");
                LocalDate fecha_registroUsuario = (fechaRegistro != null) ? fechaRegistro.toLocalDate() : null;
                stakeholder.setFecha_registroUsuario(fecha_registroUsuario);
                stakeholder.getTipoUsuario().setId_tipoUsuario(rs.getInt("id_tipoUsuario_usuario"));
                stakeholder.getTipoUsuario().setTipoUsuario(rs.getString("tipoUsuario"));
                stakeholder.setDeleted(rs.getBoolean("deleted"));
            } else {
                System.err.println("No se pudo encontrar al Stakeholder");
            }
        } catch (Exception e) {
        }
        return stakeholder;
    }

    /**
     * public Stakeholder findStakeholder(int idStakeholder) throws SQLException
     * { var stakeholder = new Stakeholder(); String sql = "select * from
     * Stakeholder where id_stakeholder=?"; PreparedStatement ps; try { ps =
     * Conexion.prepararConsulta(sql); ps.setInt(1, idStakeholder); ResultSet
     * rs; rs = ps.executeQuery();
     *
     * if (rs.next()) {
     * stakeholder.setId_stakeholder(rs.getInt("id_stakeholder"));
     * stakeholder.setDocumento_stakeholder(rs.getInt("documento_stakeholder"));
     * stakeholder.setId_cargo_stakeholder(rs.getInt("id_cargo_stakeholder"));
     * stakeholder.setId_tipoDocumento_stakeholder(rs.getInt("id_tipodocumento_stakeholder"));
     * stakeholder.setId_usuario_stakeholder(rs.getInt("id_usuario_stakeholder"));
     * Date fechaCreacion_s = rs.getDate("fechaCreacion"); LocalDate
     * fechaCreacion = (fechaCreacion_s != null) ? fechaCreacion_s.toLocalDate()
     * : null; stakeholder.setFechaCreacion(fechaCreacion); Date
     * fechaActualizacion_s = rs.getDate("fechaActualizacion"); LocalDate
     * fechaActualizacion = (fechaActualizacion_s != null) ?
     * fechaActualizacion_s.toLocalDate() : null;
     * stakeholder.setFechaActualizacion(fechaActualizacion); Date
     * fechaEliminado_s = rs.getDate("fechaEliminado"); LocalDate fechaEliminado
     * = (fechaEliminado_s != null) ? fechaEliminado_s.toLocalDate() : null;
     * stakeholder.setFechaEliminado(fechaEliminado);
     *
     * } else { System.err.println("No se pudo encontrar el Stakeholder"); } }
     * catch (SQLException e) { System.err.println("Error: " + e); } finally {
     * Conexion.close(); }
     *
     * return stakeholder; }
     *
     *
     */
    /**
     * *
     * Método para listar los colaboradores o Stakeholders
     *
     * @return List - Lista
     * @throws SQLException
     */
    public List<Stakeholder> listarStakeholder() throws SQLException {
        List<Stakeholder> stakeholders = new ArrayList();
        String slq = "SELECT * "
                + "FROM stakeholder "
                + "JOIN usuarios ON id_usuario_stakeholder=id_usuario "
                + "WHERE deleted=0";
        PreparedStatement ps;

        try {
            ps = Conexion.prepararConsulta(slq);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Stakeholder stakeholder = new Stakeholder();
                stakeholder.setId_stakeholder(rs.getInt("id_stakeholder"));
                stakeholder.setPrimerNombre_usuario(rs.getString("primerNombre_usuario"));
                stakeholder.setPrimerApellido_usuario(rs.getString("primerApellido_usuario"));
                stakeholder.setEmail_usuario(rs.getString("email_usuario"));
                stakeholder.setDocumento_stakeholder(rs.getInt("documento_stakeholder"));
                stakeholder.setId_cargo_stakeholder(rs.getInt("id_cargo_stakeholder"));
                stakeholder.setId_cargo_stakeholder(rs.getInt("id_cargo_stakeholder"));
                stakeholder.setId_tipoDocumento_stakeholder(rs.getInt("id_tipoDocumento_stakeholder"));
                stakeholder.setId_usuario_stakeholder(rs.getInt("id_usuario_stakeholder"));
                Date fechaCreacion_s = rs.getDate("fechaCreacion");
                LocalDate fechaCreacion = (fechaCreacion_s != null) ? fechaCreacion_s.toLocalDate() : null;
                stakeholder.setFechaCreacion(fechaCreacion);
                Date fechaActualizacion_s = rs.getDate("fechaActualizacion");
                LocalDate fechaActualizacion = (fechaActualizacion_s != null) ? fechaActualizacion_s.toLocalDate() : null;
                Date fechaEliminado_s = rs.getDate("fechaEliminado");
                LocalDate fechaEliminado = (fechaEliminado_s != null) ? fechaEliminado_s.toLocalDate() : null;
                stakeholders.add(stakeholder);

            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        } finally {
            Conexion.close();
        }

        return stakeholders;
    }

    public int inputStakeholder(Stakeholder stakeholder, Usuario usuario) throws SQLException {
        var idStakeholder = 0;
        var idUsuario = 0;

        String sql = "INSERT INTO stakeholder ( documento_stakeholder, id_cargo_stakeholder,  id_tipoDocumento_stakeholder, id_usuario_stakeholder, fechaCreacion, fechaActualizacion, fechaEliminado)"
                + "VALUES(?,?,?,?,?,?,?)";
        PreparedStatement ps;

        try {
            //Conexion.conexionSetAutoCommit(false);
            idUsuario = usuario.inputUsuario(usuario);
            if (idUsuario != 0) {
                System.out.println("Usuario insertado desde Stakeholder");
                try {
                    ps = Conexion.prepararConsulta(sql, Statement.RETURN_GENERATED_KEYS);
                    ps.setInt(1, stakeholder.getDocumento_stakeholder());
                    ps.setInt(2, stakeholder.getId_cargo_stakeholder());
                    ps.setInt(3, stakeholder.getId_tipoDocumento_stakeholder());
                    ps.setInt(4, idUsuario);
                    ps.setDate(5, (stakeholder.getFechaCreacion() != null) ? Date.valueOf(stakeholder.getFechaCreacion()) : null);
                    //ps.setDate(5, (Date) stakeholder.getFechaCreacion());
                    ps.setDate(6, (stakeholder.getFechaActualizacion() != null) ? Date.valueOf(stakeholder.getFechaActualizacion()) : null);
                    //ps.setDate(6, (Date) stakeholder.getFechaActualizacion());
                    ps.setDate(7, (stakeholder.getFechaEliminado() != null) ? Date.valueOf(stakeholder.getFechaEliminado()) : null);
                    //ps.setDate(7, (Date) stakeholder.getFechaEliminado());

                    if (ps.executeUpdate() != 0) {
                        System.out.println("Stakeholder ingresado");
                        ResultSet rs;
                        rs = ps.getGeneratedKeys();
                        if (rs.next()) {
                            idStakeholder = rs.getInt(1);
                            System.out.println("El id del Stakeholder es:" + idStakeholder);

                        }
                        rs.close();
                    } else {
                        System.err.println("El stakeholder no ha podido ser ingresado");
                    }
                    Conexion.commit();
                } catch (SQLException e) {
                    System.err.println("Error: " + e);
                    Conexion.rollBack();
                }
            } else {
                Conexion.rollBack();
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e);
            Conexion.rollBack();
        } finally {
            Conexion.close();
        }
        return idStakeholder;
    }

    public int delete(int id_usuario_stakeholder) throws SQLException {
        int deleted = 0;
        String sql = "UPDATE usuarios "
                + "SET deleted=1, active=0 "
                + "WHERE=id_usuario=?";
        try {
            ps = Conexion.prepararConsulta(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id_usuario_stakeholder);

            if (ps.executeUpdate() != 0) {
                rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    deleted = rs.getInt(1);
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

    public boolean updateStakeholder(Stakeholder stakeholder, Usuario usuario) throws SQLException {
        var idStakeholder = stakeholder.getId_stakeholder();
        var update = false;

        String sql = "update stakeholder set documento_stakeholder=?, id_cargo_stakeholder=?,  id_tipoDocumento_stakeholder=?"
                + " where id_stakeholder=?";
        PreparedStatement ps;

        try {
            //Conexion.conexionSetAutoCommit(false);
            update = usuario.updateUsuario(usuario);
            if (update != false) {
                System.out.println("Usuario Actualizado desde Stakeholder");
                try {
                    ps = Conexion.prepararConsulta(sql, Statement.RETURN_GENERATED_KEYS);
                    ps.setInt(1, stakeholder.getDocumento_stakeholder());
                    ps.setInt(2, stakeholder.getId_cargo_stakeholder());
                    ps.setInt(3, stakeholder.getId_tipoDocumento_stakeholder());
                    ps.setInt(4, idStakeholder);
                    //ps.setDate(5, (stakeholder.getFechaCreacion() != null) ? Date.valueOf(stakeholder.getFechaCreacion()) : null);
                    //ps.setDate(5, (Date) stakeholder.getFechaCreacion());
                    //ps.setDate(6, (stakeholder.getFechaActualizacion() != null) ? Date.valueOf(stakeholder.getFechaActualizacion()) : null);
                    //ps.setDate(6, (Date) stakeholder.getFechaActualizacion());
                    //ps.setDate(7, (stakeholder.getFechaEliminado() != null) ? Date.valueOf(stakeholder.getFechaEliminado()) : null);
                    //ps.setDate(7, (Date) stakeholder.getFechaEliminado());

                    if (ps.executeUpdate() != 0) {
                        System.out.println("Stakeholder Actualizado");
                        ResultSet rs;
                        rs = ps.getGeneratedKeys();
                        if (rs.next()) {
                            idStakeholder = rs.getInt(1);
                            System.out.println("El id del Stakeholder es:" + idStakeholder);

                        }
                        rs.close();
                    } else {
                        System.err.println("El stakeholder no ha podido ser ingresado");
                    }
                    Conexion.commit();
                } catch (SQLException e) {
                    System.err.println("Error: " + e.getMessage());
                    Conexion.rollBack();
                }
            } else {
                Conexion.rollBack();
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
            Conexion.rollBack();
        } finally {
            Conexion.close();
        }
        return update;
    }

}
