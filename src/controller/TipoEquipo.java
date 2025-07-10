/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author JOES
 */
public class TipoEquipo {
    
    protected int id_tipoEquipo;
    protected String tipo_equipo;

    public TipoEquipo() {
    }

    public TipoEquipo(int id_tipoEquipo, String tipo_equipo) {
        this.id_tipoEquipo = id_tipoEquipo;
        this.tipo_equipo = tipo_equipo;
    }

    public int getId_tipoEquipo() {
        return id_tipoEquipo;
    }

    public void setId_tipoEquipo(int id_tipoEquipo) {
        this.id_tipoEquipo = id_tipoEquipo;
    }

    public String getTipo_equipo() {
        return tipo_equipo;
    }

    public void setTipo_equipo(String tipo_equipo) {
        this.tipo_equipo = tipo_equipo;
    }
    
    
    
}
