/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import conexion.Conexion;
import java.util.HashMap;
import java.util.List;
import model.TopologiaModel;
import java.sql.SQLException;

/**
 *
 * @author jogof
 */
public class Topologia {

    Conexion con;
    protected int id_topologia;
    protected String detalle_topologia;

    final TopologiaModel topologiaModel = new TopologiaModel();
    //TopologiaModel topologiaModel = new TopologiaModel(con);

    public Topologia() {
        //this.topologiaModel = new TopologiaModel(con);
    }
    
    
    

    public Topologia(int id_topologia, String detalle_topologia) {
        this.id_topologia = id_topologia;
        this.detalle_topologia = detalle_topologia;
    }

    public int getId_topologia() {
        return id_topologia;
    }

    public void setId_topologia(int id_topologia) {
        this.id_topologia = id_topologia;
    }

    public String getDetalle_topologia() {
        return detalle_topologia;
    }

    public void setDetalle_topologia(String detalle_topologia) {
        this.detalle_topologia = detalle_topologia;
    }

    @Override
    public String toString() {
        return "Topologia{" + "id_topologia=" + id_topologia + ", detalle_topologia=" + detalle_topologia + '}';
    }

    public List<Topologia> listar() throws SQLException {
        return topologiaModel.listar();
    }

    public HashMap<String, Integer> hashMap() throws SQLException {
        HashMap<String, Integer> has = new HashMap<>();
        var list = this.listar();
        for (Topologia t : list) {
            has.put(t.getDetalle_topologia(), t.getId_topologia());
        }

        return has;
    }

}
