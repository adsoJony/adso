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
//import java.util.Date;
import java.sql.Date;

/**
 *
 * @author JOES
 */
public class StakeholderModel {
    
    public StakeholderModel() {
    }
    
    public Stakeholder findStakeholder(int idStakeholder) throws SQLException {
        var stakeholder = new Stakeholder();
        String sql = "select * from Stakeholder where id_stakeholder=?";
        PreparedStatement ps;
        try {
            ps = Conexion.prepararConsulta(sql);
            ps.setInt(1, idStakeholder);
            ResultSet rs;
            rs = ps.executeQuery();
            
            if (rs.next()) {
                stakeholder.setId_stakeholder(rs.getInt("id_stakeholder"));
                stakeholder.setDocumento_stakeholder(rs.getInt("documento_stakeholder"));
                stakeholder.setId_usuario_stakeholder(rs.getInt("id_usuario_stakeholder"));
                stakeholder.setId_cargo_stakeholder(rs.getInt("id_cargo_stakeholder"));
            } else {
                System.err.println("No se pudo encontrar el Stakeholder");
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        } finally {
            Conexion.close();
        }
        
        return stakeholder;
    }
    
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
                stakeholder.setDocumento_stakeholder(rs.getInt("documento_stakeholder"));
                stakeholder.setId_cargo_stakeholder(rs.getInt("id_cargo_stakeholder"));
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
                    ps.setDate(5, (Date) stakeholder.getFechaCreacion());
                    ps.setDate(6, (Date) stakeholder.getFechaActualizacion());
                    ps.setDate(7, (Date) stakeholder.getFechaEliminado());
                    
                    if (ps.executeUpdate() != 0) {
                        System.out.println("Stakeholder ingresado");
                        ResultSet rs;
                        rs = ps.getGeneratedKeys();
                        if (rs.next()) {
                            idStakeholder = rs.getInt(1);
                            System.out.println("El id del Stakeholder es:"+idStakeholder);
                        }
                        rs.close();
                    } else {
                        System.err.println("El stakeholder no ha podido ser ingresado");
                    }
                    Conexion.commit();
                } catch (SQLException e) {
                    System.err.println("Error: "+e);
                    Conexion.rollBack();
                }
            } else {
                Conexion.rollBack();
            }
        } catch (SQLException e) {
            System.err.println("Error: "+e);
            Conexion.rollBack();
        }
        return idStakeholder;
    }
    
}
