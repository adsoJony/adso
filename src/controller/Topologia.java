/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author jogof
 */
public class Topologia {
    
    protected int id_topologia;
    protected String detalle_topologia;

    public Topologia() {
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
    
    
}
