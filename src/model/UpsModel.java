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

    Equipo equipo = new Equipo();
    Conexion con;
    private PreparedStatement ps;
    //private Ups ups;
    ResultSet rs;

    public void UpsModel(Conexion con) {
        this.con = con;
        // this.ups = new Ups();
    }

    public List<Ups> listarUpsByCliente(int id_cliente) throws SQLException {
        List<Ups> upsClienteList = new ArrayList();

        String sql = "SELECT * from ups "
                + "join equipo on id_equipo=id_equipo_ups "
                + "join topologia on id_topologia=id_topologia_ups "
                + "join cliente on id_cliente=id_cliente_equipo "
                + "join marca on id_marca=id_marca_equipo "
                + "join modelo on id_modelo=id_modelo_equipo "
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
                ups.marca.setDetalle_marca(rs.getString("detalle_marca"));
                ups.modelo.setDetalle_modelo(rs.getString("detalle_modelo"));
                ups.topologia.setDetalle_topologia(rs.getString("detalle_topologia"));
                ups.modelo.setDetalleEquipo_modelo(rs.getString("detalleEquipo_modelo"));
                

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
                if (ps.executeUpdate() != 0) {
                    System.out.println("Ups ingresada correctamente");
                }
            } else {
                System.out.println("No se pudo ingresar la Ups. por favor tcontactese con su administrador de sistemas");
                input = true;
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e);
        } finally {
            Conexion.close();
        }
        return input;
    }

    public Ups findUpsById(int id_ups) {
        Ups ups = new Ups();
        String sql = "select * from ups "
                + "join equipo on id_equipo=id_equipo_ups "
                + "join topologia on id_topologia=id_topologia_ups "
                + "join marca on id_marca=id_marca_equipo "
                + "join modelo on id_modelo=id_modelo_equipo "
                + "where id_ups=?";
        try {
            ps = con.prepararConsulta(sql);
            ps.setInt(1, id_ups);
            rs = ps.executeQuery();
            if (rs.next()) {
                //  Ups
                ups.setId_ups(rs.getInt("id_ups"));
                ups.setId_equipo_ups(rs.getInt("id_equipo_ups"));
                ups.setId_equipo(rs.getInt("id_equipo"));
                ups.equipo.setId_equipo(rs.getInt("id_equipo"));
                ups.setPotencia_va(rs.getInt("potencia_va"));
                ups.setVoltajebanco_ups(rs.getInt("voltajeBanco_ups"));
                ups.setTransformadorAislamiento(rs.getBoolean("transformadorAislamiento"));
                ups.setId_topologia_ups(rs.getInt("id_topologia_ups"));
                ups.topologia.setDetalle_topologia("detalle_topologia");
                ups.setCant_batNom(rs.getInt("cant_batNom"));
                ups.setCant_batTotal(rs.getInt("cant_batTotal"));
                ups.setCant_bancoBat(rs.getInt("cant_bancoBat"));
                ups.setTiempoAutonomia_ups(rs.getInt("tiempoAutonomia_ups"));

                //  Equipo
                ups.setId_tipoEquipo_equipo(rs.getInt("id_equipo"));
                ups.setId_cliente_equipo(rs.getInt("id_cliente_equipo"));
                ups.setSerie_equipo(rs.getString("serie_equipo"));
                ups.setUbicacion_equipo(rs.getString("ubicacion_equipo"));
                ups.setId_marca_equipo(rs.getInt("id_marca_equipo"));
                ups.marca.setId_marca(rs.getInt("id_marca"));
                ups.marca.setDetalle_marca(rs.getString("detalle_marca"));
                ups.setId_modelo_equipo(rs.getInt("id_modelo_equipo"));
                ups.modelo.setId_modelo(rs.getInt("id_modelo_equipo"));
                ups.modelo.setDetalle_modelo(rs.getString("detalle_modelo"));

            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        return ups;

    }

    public boolean update(Ups ups) throws SQLException {
        boolean update = false;
        PreparedStatement ps;

        //String sqlE = "";

        String sqlU = "update ups set potencia_va=?, voltajeBanco_ups=?, id_topologia_ups=?, cant_batNom=?, cant_batTotal=?, cant_bancoBat=?, tiempoAutonomia_ups=? "
                + "where id_ups=?";

        try {
            //  Ingresar Equipo
            //ps = con.prepararConsulta(sqlE);
            var updateE = equipo.updateEquipo(ups);

            //int equipo = ;
            //  Ingresar Ups
            if (updateE) {
                System.out.println("Equipo Actualizado desde UpsModel con éxito.");
                ps = con.prepararConsulta(sqlU);
                ps.setInt(1, ups.getPotencia_va());

                ps.setInt(2, ups.getVoltajebanco_ups());
                ps.setInt(3, ups.getId_topologia_ups());

                ps.setInt(4, ups.getCant_batNom());
                ps.setInt(5, ups.getCant_batTotal());
                
                ps.setInt(6, ups.getCant_bancoBat());
                ps.setInt(7, ups.getTiempoAutonomia_ups());
                ps.setInt(8, ups.getId_ups());
                
                if (ps.executeUpdate() != 0) {
                    System.out.println("Ups Actualizada exitosamente desde UpsModel");
                    update = true;
                }

            }else{
                System.err.println("No se pudo Actualizar la up...");
            }

        } catch (Exception e) {
            System.out.println("Error UpsUpdate: "+e);
        }
        con.close();
        return update;

    }

}
