/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexion.Conexion;
import controller.Modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jogof
 */
public class ModeloModel {

    Conexion con;
    PreparedStatement ps;
    ResultSet rs;

    public ModeloModel(Conexion con) {
        this.con = con;
    }

    public List<Modelo> listarModelo() throws SQLException {
        List<Modelo> list = new ArrayList<>();
        String sql = "select * from modelo";

        try {
            ps = Conexion.prepararConsulta(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Modelo model = new Modelo();
                model.setId_modelo(rs.getInt("id_modelo"));
                model.setId_marca_modelo(rs.getInt("id_marca_modelo"));
                model.setId_voltajeOperacion_modelo(rs.getInt("id_voltajeOperacion_modelo"));
                model.setId_tipoEquipo_modelo(rs.getInt("id_tipoEquipo_modelo"));
                model.setDetalle_modelo(rs.getString("detalle_modelo"));
                model.setAlto(rs.getInt("alto"));
                model.setAncho(rs.getInt("ancho"));
                model.setProfundidad(rs.getInt("profundidad"));
                //model.setDetalleEquipo_modelo(rs.getString("detalleEquipo_modelo"));
                list.add(model);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.err.println("Err: " + e);
        } finally {
            Conexion.close();
        }

        return list;
    }

}
