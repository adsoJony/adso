/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexion.Conexion;
import controller.Rol;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author jogof
 */
public class RolModel {

    ResultSet rs;
    PreparedStatement ps;

    public RolModel() {
    }

    public List<Rol> listarRol() throws SQLException {
        List<Rol> list = new ArrayList<>();
        String sql = "select id_rol, descripcion_rol from rol";

        try {
            ps = Conexion.prepararConsulta(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                list.add(new Rol(rs.getInt("id_rol"), rs.getString("descripcion_rol")));

            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return list;

    }

}
