/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexion.Conexion;
import controller.Equipo;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import controller.Equipo;

/**
 *
 * @author jogof
 */
public class EquipoModel {

    Conexion con;
    PreparedStatement ps;
    ResultSet rs;

    public void EquipoModel(Conexion con) {
        this.con = con;

    }

    public List<Equipo> listarEquipos() throws SQLException {
        List<Equipo> equipos = new ArrayList();
        String sql = "SELECT * FROM equipo";
        
        try {
           ps = Conexion.prepararConsulta(sql);
           rs = ps.executeQuery();
           while (rs.next()){
               Equipo equipo = new Equipo();
               equipo.setId_equipo(rs.getInt("id_equipo"));
               equipo.setId_cliente_equipo(rs.getInt("id_cliente_equipo"));
               equipos.add(equipo);
           }
           rs.close();
           rs.close();
        } catch (SQLException e) {
            System.err.println("Error: "+e.getMessage());
        }
        
        return equipos;
    }

    public int inputEquipo(Equipo equipo) throws SQLException {
        var id_equipo = 0;

        String sql = "INSERT INTO equipo (id_cliente_equipo, serie_equipo, ubicacion_equipo, id_marca_equipo, id_modelo_equipo, fechaInstalacion_equipo, ultimomantenimiento_equipo, id_tipoEquipo_equipo)"
                + "VALUES(?,?,?,?,?,?,?,?)";

        //PreparedStatement ps;
        //rs;
        try {
            ps = Conexion.prepararConsulta(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, equipo.getId_cliente_equipo());
            ps.setString(2, equipo.getSerie_equipo());
            ps.setString(3, equipo.getUbicacion_equipo());
            ps.setInt(4, equipo.getId_marca_equipo());
            ps.setInt(5, equipo.getId_modelo_equipo());
            ps.setDate(6, Date.valueOf(equipo.getFechaInstalacion_equipo()));
            ps.setDate(7, Date.valueOf(equipo.getUltimoMantenimiento_equipo()));
            ps.setInt(8, equipo.getId_tipoEquipo_equipo());

            if (ps.executeUpdate() != 0) {

                System.out.println("Equipo registrado.");
                rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    id_equipo = rs.getInt(1);
                    System.out.println("El Equipo resgitrado tiene Id: " + id_equipo);
                    return id_equipo;
                }
                rs.close();
            } else {
                System.err.println("El equipo no se pudo registrar.");
            }

            ps.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return id_equipo;
    }

}
