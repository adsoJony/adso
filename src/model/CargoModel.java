/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexion.Conexion;
import controller.Cargo;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author JOES
 */
public class CargoModel {
    
    PreparedStatement ps;
    ResultSet rs;
    
   public CargoModel(){
        
    }
    

    public List<Cargo> listarCargos() throws SQLException{
    List<Cargo> lista = new ArrayList<>();
    String sql = "SELECT id_cargo, cargo From cargo";
        try {
            ps = Conexion.prepararConsulta(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                lista.add(new Cargo(rs.getString("cargo"), rs.getInt("id_cargo")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    return lista;

}

}
