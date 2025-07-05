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
import java.time.LocalDate;

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

    public Equipo findEquipo(int id_Equipo) {
        var equipo = new Equipo();

        String sql = "SELECT * FROM equipo "
                + "WHERE id_equipo=?";
        try {
            ps = Conexion.prepararConsulta(sql);
            ps.setInt(1, id_Equipo);
            rs = ps.executeQuery();
            
            if (rs.next()){
                equipo.setId_equipo(rs.getInt("id_equipo"));
                equipo.setId_cliente_equipo(rs.getInt("id_cliente_equipo"));
                equipo.setSerie_equipo(rs.getString("serie_equipo"));
                equipo.setUbicacion_equipo(rs.getString("ubicacion_equipo"));
                equipo.setId_marca_equipo(rs.getInt("id_marca_equipo"));
                equipo.setId_modelo_equipo(rs.getInt("id_modelo_equipo"));
                Date fechaInstalacion = rs.getDate("fechaInstalacion_equipo");                //Capturamos la fecha de tipo SQL en la variable
                LocalDate fechaInstalacion_equipo = (fechaInstalacion != null) ? fechaInstalacion.toLocalDate() :null;    //Convertimos la fecha tipo SQL a LocalDate
                equipo.setFechaInstalacion_equipo(fechaInstalacion_equipo);                               //Instanciamos el valor de la fecha en objeto "equipo"
                Date ultimoMantenimiento = rs.getDate("ultimoMantenimiento_equipo");
                LocalDate ultimoMantenimiento_equipo = (ultimoMantenimiento != null) ? ultimoMantenimiento.toLocalDate() : null;
                equipo.setUltimoMantenimiento_equipo(ultimoMantenimiento_equipo);
                equipo.setId_tipoEquipo_equipo(rs.getInt("id_tipoEquipo_equipo"));
                
                return equipo;
            }else{
                System.err.println("No se pudo encontrar el Equipo con ID: "+id_Equipo);
            }

        } catch (Exception e) {
            System.err.println("error :"+e.getMessage());
        }

        return equipo;
    }

    public List<Equipo> listarEquipos() throws SQLException {
        List<Equipo> equipos = new ArrayList();
        String sql = "SELECT * FROM equipo";

        try {
            ps = Conexion.prepararConsulta(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Equipo equipo = new Equipo();
                equipo.setId_equipo(rs.getInt("id_equipo"));
                equipo.setId_cliente_equipo(rs.getInt("id_cliente_equipo"));
                equipo.setSerie_equipo(rs.getString("serie_equipo"));
                equipo.setUbicacion_equipo(rs.getString("ubicacion_equipo"));
                equipo.setId_marca_equipo(rs.getInt("id_marca_equipo"));
                equipo.setId_modelo_equipo(rs.getInt("id_modelo_equipo"));
                Date fechaInstalacion = rs.getDate("fechaInstalacion_equipo");
                LocalDate fechaInstalacion_equipo = (fechaInstalacion != null) ? fechaInstalacion.toLocalDate() : null;
                equipo.setFechaInstalacion_equipo(fechaInstalacion_equipo);
                Date ultimoMantenimiento = rs.getDate("ultimoMantenimiento_equipo");
                LocalDate ultimoMantenimiento_equipo = (ultimoMantenimiento != null) ? ultimoMantenimiento.toLocalDate() : null;
                equipo.setUltimoMantenimiento_equipo(ultimoMantenimiento_equipo);
                equipo.setId_tipoEquipo_equipo(rs.getInt("id_tipoEquipo_equipo"));
                equipos.add(equipo);
            }
            rs.close();
            rs.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e);
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
            ps.setDate(6, (equipo.getFechaInstalacion_equipo() != null) ? Date.valueOf(equipo.getFechaInstalacion_equipo()) : null);
            ps.setDate(7, (equipo.getUltimoMantenimiento_equipo() != null) ? Date.valueOf(equipo.getUltimoMantenimiento_equipo()) : null);
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

    public boolean updateEquipo(Equipo equipo) throws SQLException {
        boolean update = false;
        String sql = "UPDATE equipo "
                + "SET serie_equipo=?, ubicacion_equipo=?, id_marca_equipo=?, id_modelo_equipo=?, fechaInstalacion_equipo=?, ultimoMantenimiento_equipo=?, id_tipoEquipo_equipo=? "
                + "WHERE id_equipo=?";
        ps = Conexion.prepararConsulta(sql);
        try {
            ps.setString(1, equipo.getSerie_equipo());
            ps.setString(2, equipo.getUbicacion_equipo());
            ps.setInt(3, equipo.getId_marca_equipo());
            ps.setInt(4, equipo.getId_modelo_equipo());
            ps.setDate(5, (equipo.getFechaInstalacion_equipo() != null) ? Date.valueOf(equipo.getFechaInstalacion_equipo()) : null);
            ps.setDate(6, (equipo.getUltimoMantenimiento_equipo() != null) ? Date.valueOf(equipo.getUltimoMantenimiento_equipo()) : null);
            ps.setInt(7, equipo.getId_tipoEquipo_equipo());
            ps.setInt(8, equipo.getId_equipo());

            if (ps.executeUpdate() != 0) {
                update = true;
                System.out.println("Equipo actualizado correctamente.");
            } else {
                System.err.println("El Equipo no se pudo actualizar");
            }
            ps.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            Conexion.close();
        }

        return update;
    }

}
