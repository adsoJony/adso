/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexion.Conexion;
import controller.Topologia;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jogof
 */
public class TopologiaModel {

    //Topologia topologia = new Topologia();
    PreparedStatement ps;
    ResultSet rs;
    Conexion con;

    public TopologiaModel() {
        //this.con = con;
    }

    public List<Topologia> listar() throws SQLException {
        List<Topologia> list = new ArrayList();

        String sql = "select * from topologia";

        try {
            ps = Conexion.prepararConsulta(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Topologia topologia = new Topologia();
                topologia.setId_topologia(rs.getInt("id_topologia"));
                topologia.setDetalle_topologia(rs.getString("detalle_topologia"));
                list.add(topologia);

            }

        } catch (SQLException e) {
            System.err.print("Error: " + e);
        }

        return list;
    }

}
