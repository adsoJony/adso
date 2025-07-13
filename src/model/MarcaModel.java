/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexion.Conexion;
import controller.Marca;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jogof
 */
public class MarcaModel {
    
    PreparedStatement ps;
    ResultSet rs;
    Marca marca;
    Conexion con;

    public MarcaModel() {
        
        
    }
    
    
    public List<Marca> listarMarca() throws SQLException{
        List<Marca> list = new ArrayList<>();
        String sql="select * from marca";
        try {
            ps=Conexion.prepararConsulta(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Marca marca = new Marca();
                marca.setId_marca(rs.getInt("id_marca"));
                marca.setDetalle_marca(rs.getString("detalle_marca"));
                list.add(marca);
            }
        } catch (Exception e) {
            System.err.println("err: "+e);
        }
        return list;
    }
            
            
    
    
    
    
}
