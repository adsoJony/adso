/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexion.Conexion;
import controller.Equipo;
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
    private Ups ups;
    ResultSet rs;

    public void UpsModel(Conexion con) {
        this.con = con;
        this.ups = new Ups();
    }

    public List<Ups> listarUpsByCliente(int id_cliente) throws SQLException {
        List<Ups> upsClienteList = new ArrayList();

        String sql = "SELECT * from ups "
                + "join equipo on id_equipo=id_equipo_ups "
                + "join cliente on id_cliente=id_cliente_equipo "
                + "where id_cliente=?";

        //PreparedStatement ps;
        //ResultSet rs;
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
                ups.setSerie_equipo(rs.getString("serie_equipo"));
                ups.setUbicacion_equipo(rs.getString("ubicacion_equipo"));

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

    public boolean inputUps(Ups ups, Equipo equipo) throws SQLException {
        var input = false;

        String sql = "insert into ups (id_equipo_ups, potencia_va, voltajeBanco_ups, transformadorAislamiento, id_topologia_ups, cant_batNom, cant_batTotal, id_ultimoComprobanteServicio, cant_bancoBat, tiempoAutonomia_ups) "
                + "values(?,?,?,?,?,?,?,?,?,?)";

        try {
            var id_equipo = equipo.inputEquipo(equipo);
            if (id_equipo != 0) {
                ps = Conexion.prepararConsulta(sql);
                ps.setInt(1, id_equipo);
                ps.setInt(2, ups.getPotencia_va());
                ps.setInt(3, ups.getVoltajebanco_ups());
                ps.setBoolean(4, ups.getTransformadorAislamiento());
                ps.setInt(5, ups.getId_topologia_ups());
                ps.setInt(6, ups.getCant_batNom());
                ps.setInt(7, ups.getCant_batTotal());
                ps.setInt(8, ups.getId_ultimoComprobanteServicio());
                ps.setInt(9, ups.getCant_bancoBat());
                ps.setInt(10, ups.getTiempoAutonomia_ups());
                if (ps.executeUpdate() != 0){
                    System.out.println("Ups ingresada correctamente");
                }else{
                    System.out.println("No se pudo ingresar la Ups. por favor tcontactese con su administrador de sistemas");
                   input = true;
                }
            }
           

        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }finally{
            Conexion.close();
        }
        return input;
    }

}
