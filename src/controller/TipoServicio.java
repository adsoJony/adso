/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author jogof
 */
public class TipoServicio {
    
    protected int id_tipoServicio;
    protected String tipoServicio;

    public TipoServicio() {
    }

    public TipoServicio(int id_tipoServicio, String tipoServicio) {
        this.id_tipoServicio = id_tipoServicio;
        this.tipoServicio = tipoServicio;
    }

    public int getId_tipoServicio() {
        return id_tipoServicio;
    }

    public void setId_tipoServicio(int id_tipoServicio) {
        this.id_tipoServicio = id_tipoServicio;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    @Override
    public String toString() {
        return "TipoServicio{" + "id_tipoServicio=" + id_tipoServicio + ", tipoServicio=" + tipoServicio + '}';
    }
    
    
    
}
