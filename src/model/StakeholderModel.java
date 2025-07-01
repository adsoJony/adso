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
            while(rs.next()){
                Stakeholder stakeholder = new Stakeholder();
                stakeholder.setId_stakeholder(rs.getInt("id_stakeholder"));
                stakeholder.setDocumento_stakeholder(rs.getInt("documento_stakeholder"));
                stakeholder.setId_cargo_stakeholder(rs.getInt("id_cargo_stakeholder"));
                stakeholders.add(stakeholder);
                
            }
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }

        return stakeholders;
    }

}
