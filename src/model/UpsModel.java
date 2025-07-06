/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexion.Conexion;
import java.util.List;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;
import controller.Ups;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author jogof
 */
public class UpsModel {

    Conexion con;
    private PreparedStatement ps;

    public void UpsModel(Conexion con) {
        this.con = con;
    }

    public List<Ups> listarUpsCliente(int id_cliente) throws SQLException {
        List<Ups> upsClienteList = new ArrayList();

        String sql = "SELECT * from ups join equipo on id_equipo=id_equipo_ups join cliente on id_cliente_equipo=id_cliente where id_cliente=?";

        //PreparedStatement ps;
        ResultSet rs;

        try {
            ps = Conexion.prepararConsulta(sql);
            ps.setInt(1, id_cliente);
            rs = ps.executeQuery();

            while (rs.next()) {
                var ups = new Ups();
                ups.setId_ups(rs.getInt("id_ups"));
                ups.setId_equipo(rs.getInt("id_equipo_ups"));
                ups.setPotencia_va(rs.getInt("potencia_va"));
                ups.setSerie_equipo(rs.getString("serie_equipo"));
                ups.setTiempoAutonomia_ups(rs.getInt("tiempoAutonomia_ups"));

                upsClienteList.add(ups);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        } finally {
            Conexion.close();
        }

        return upsClienteList;
    }

}
