/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import conexion.Conexion;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import model.MarcaModel;

/**
 *
 * @author JOES
 */
public class Marca {
    
    protected int id_marca;
    protected String detalle_marca;
    
    MarcaModel marcaModel;

    public Marca() {
        this.marcaModel = new MarcaModel();
    }

    public Marca(int id_marca, String detalle_marca) {
        this.marcaModel = new MarcaModel();
        this.id_marca = id_marca;
        this.detalle_marca = detalle_marca;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public String getDetalle_marca() {
        return detalle_marca;
    }

    public void setDetalle_marca(String detalle_marca) {
        this.detalle_marca = detalle_marca;
    }
    
    public List<Marca> listarMarca() throws SQLException{
        return marcaModel.listarMarca();
    }
    
    
    public HashMap<String, Integer> hashMap() throws SQLException {
        var list = marcaModel.listarMarca();
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (Marca hash : list) {
            hashMap.put(hash.getDetalle_marca(), hash.getId_marca());
        }
        return hashMap;
    }
    
    
    

}
