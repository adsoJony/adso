/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexion.Conexion;
import java.util.List;
import controller.TipoDocumento;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import view.combos.TipoDocumentoCombo;

/**
 *
 * @author JOES
 */
public class TipoDocumentoModel {

    PreparedStatement ps;
    ResultSet rs;
    public TipoDocumentoModel() {
    }
    
    
    public List<TipoDocumento> listarTipoDocumento(){
        List<TipoDocumento> lista = new ArrayList<>();
        
        String sql="select * from tipodocumento";
        try {
              ps = Conexion.prepararConsulta(sql);
              rs = ps.executeQuery();
              
              while(rs.next()){
            lista.add(new TipoDocumentoCombo(rs.getString("tipoDocumento"), rs.getInt("id_tipoDocumento")));
        }
        
        } catch (Exception e) {
        }
      
        
        return lista;
    }
    
    
    
}
