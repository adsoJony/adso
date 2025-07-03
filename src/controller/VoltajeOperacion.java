/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author jogof
 */
public class VoltajeOperacion {
    
    protected int id_voltajeOperacion;
    protected int id_sistemaFases_voltajeOperacion;
    protected String detalle_voltajeOperacion;
    protected String voltaje_voltajeOperacion;

    public VoltajeOperacion() {
    }

    public VoltajeOperacion(int id_voltajeOperacion, int id_sistemaFases_voltajeOperacion, String detalle_voltajeOperacion, String voltaje_voltajeOperacion) {
        this.id_voltajeOperacion = id_voltajeOperacion;
        this.id_sistemaFases_voltajeOperacion = id_sistemaFases_voltajeOperacion;
        this.detalle_voltajeOperacion = detalle_voltajeOperacion;
        this.voltaje_voltajeOperacion = voltaje_voltajeOperacion;
    }

    public int getId_voltajeOperacion() {
        return id_voltajeOperacion;
    }

    public void setId_voltajeOperacion(int id_voltajeOperacion) {
        this.id_voltajeOperacion = id_voltajeOperacion;
    }

    public int getId_sistemaFases_voltajeOperacion() {
        return id_sistemaFases_voltajeOperacion;
    }

    public void setId_sistemaFases_voltajeOperacion(int id_sistemaFases_voltajeOperacion) {
        this.id_sistemaFases_voltajeOperacion = id_sistemaFases_voltajeOperacion;
    }

    public String getDetalle_voltajeOperacion() {
        return detalle_voltajeOperacion;
    }

    public void setDetalle_voltajeOperacion(String detalle_voltajeOperacion) {
        this.detalle_voltajeOperacion = detalle_voltajeOperacion;
    }

    public String getVoltaje_voltajeOperacion() {
        return voltaje_voltajeOperacion;
    }

    public void setVoltaje_voltajeOperacion(String voltaje_voltajeOperacion) {
        this.voltaje_voltajeOperacion = voltaje_voltajeOperacion;
    }

    @Override
    public String toString() {
        return "VoltajeOperacion{" + "id_voltajeOperacion=" + id_voltajeOperacion + ", id_sistemaFases_voltajeOperacion=" + id_sistemaFases_voltajeOperacion + ", detalle_voltajeOperacion=" + detalle_voltajeOperacion + ", voltaje_voltajeOperacion=" + voltaje_voltajeOperacion + '}';
    }
    
    
    
}
