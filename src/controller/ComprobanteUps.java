/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Date;

/**
 *
 * @author jogof
 */
public class ComprobanteUps extends ComprobanteServicio {

    protected int id_comprobanteUps;
    protected String observaciones_comprobanteServicio;
    protected int v_in;
    protected int v_out;
    protected int i_in;
    protected int i_out;
    protected int v_batNom;
    protected int b_batFlot;
    protected int cant_batNom;
    protected int cant_bancoBat;
    protected int temp_sitio;
    protected int temp_equipo;
    protected int id_ups_comprobanteServicioUPS;
    protected int id_comprobanteServicioUps;

    public ComprobanteUps() {
    }

    public ComprobanteUps(int id_comprobanteUps, String observaciones_comprobanteServicio, int v_in, int v_out, int i_in, int i_out, int v_batNom, int b_batFlot, int cant_batNom, int cant_bancoBat, int temp_sitio, int temp_equipo, int id_ups_comprobanteServicioUPS, int id_comprobanteServicioUps) {
        this.id_comprobanteUps = id_comprobanteUps;
        this.observaciones_comprobanteServicio = observaciones_comprobanteServicio;
        this.v_in = v_in;
        this.v_out = v_out;
        this.i_in = i_in;
        this.i_out = i_out;
        this.v_batNom = v_batNom;
        this.b_batFlot = b_batFlot;
        this.cant_batNom = cant_batNom;
        this.cant_bancoBat = cant_bancoBat;
        this.temp_sitio = temp_sitio;
        this.temp_equipo = temp_equipo;
        this.id_ups_comprobanteServicioUPS = id_ups_comprobanteServicioUPS;
        this.id_comprobanteServicioUps = id_comprobanteServicioUps;
    }

    public int getId_comprobanteUps() {
        return id_comprobanteUps;
    }

    public void setId_comprobanteUps(int id_comprobanteUps) {
        this.id_comprobanteUps = id_comprobanteUps;
    }

    public String getObservaciones_comprobanteServicio() {
        return observaciones_comprobanteServicio;
    }

    public void setObservaciones_comprobanteServicio(String observaciones_comprobanteServicio) {
        this.observaciones_comprobanteServicio = observaciones_comprobanteServicio;
    }

    public int getV_in() {
        return v_in;
    }

    public void setV_in(int v_in) {
        this.v_in = v_in;
    }

    public int getV_out() {
        return v_out;
    }

    public void setV_out(int v_out) {
        this.v_out = v_out;
    }

    public int getI_in() {
        return i_in;
    }

    public void setI_in(int i_in) {
        this.i_in = i_in;
    }

    public int getI_out() {
        return i_out;
    }

    public void setI_out(int i_out) {
        this.i_out = i_out;
    }

    public int getV_batNom() {
        return v_batNom;
    }

    public void setV_batNom(int v_batNom) {
        this.v_batNom = v_batNom;
    }

    public int getB_batFlot() {
        return b_batFlot;
    }

    public void setB_batFlot(int b_batFlot) {
        this.b_batFlot = b_batFlot;
    }

    public int getCant_batNom() {
        return cant_batNom;
    }

    public void setCant_batNom(int cant_batNom) {
        this.cant_batNom = cant_batNom;
    }

    public int getCant_bancoBat() {
        return cant_bancoBat;
    }

    public void setCant_bancoBat(int cant_bancoBat) {
        this.cant_bancoBat = cant_bancoBat;
    }

    public int getTemp_sitio() {
        return temp_sitio;
    }

    public void setTemp_sitio(int temp_sitio) {
        this.temp_sitio = temp_sitio;
    }

    public int getTemp_equipo() {
        return temp_equipo;
    }

    public void setTemp_equipo(int temp_equipo) {
        this.temp_equipo = temp_equipo;
    }

    public int getId_ups_comprobanteServicioUPS() {
        return id_ups_comprobanteServicioUPS;
    }

    public void setId_ups_comprobanteServicioUPS(int id_ups_comprobanteServicioUPS) {
        this.id_ups_comprobanteServicioUPS = id_ups_comprobanteServicioUPS;
    }

    public int getId_comprobanteServicioUps() {
        return id_comprobanteServicioUps;
    }

    public void setId_comprobanteServicioUps(int id_comprobanteServicioUps) {
        this.id_comprobanteServicioUps = id_comprobanteServicioUps;
    }

    public int getId_comprobanteServicio() {
        return id_comprobanteServicio;
    }

    public void setId_comprobanteServicio(int id_comprobanteServicio) {
        this.id_comprobanteServicio = id_comprobanteServicio;
    }

    public Date getFecha_comprobanteServicio() {
        return fecha_comprobanteServicio;
    }

    public void setFecha_comprobanteServicio(Date fecha_comprobanteServicio) {
        this.fecha_comprobanteServicio = fecha_comprobanteServicio;
    }

    public int getId_ordenServicio_comprobanteServicio() {
        return id_ordenServicio_comprobanteServicio;
    }

    public void setId_ordenServicio_comprobanteServicio(int id_ordenServicio_comprobanteServicio) {
        this.id_ordenServicio_comprobanteServicio = id_ordenServicio_comprobanteServicio;
    }

    public int getId_tipoServicio_comprobanteServicio() {
        return id_tipoServicio_comprobanteServicio;
    }

    public void setId_tipoServicio_comprobanteServicio(int id_tipoServicio_comprobanteServicio) {
        this.id_tipoServicio_comprobanteServicio = id_tipoServicio_comprobanteServicio;
    }

    public int getId_usuarioSolicitante() {
        return id_usuarioSolicitante;
    }

    public void setId_usuarioSolicitante(int id_usuarioSolicitante) {
        this.id_usuarioSolicitante = id_usuarioSolicitante;
    }

    public int getId_usuario_tecnico() {
        return id_usuario_tecnico;
    }

    public void setId_usuario_tecnico(int id_usuario_tecnico) {
        this.id_usuario_tecnico = id_usuario_tecnico;
    }

    public String getDetalle_comprobanteServicio() {
        return detalle_comprobanteServicio;
    }

    public void setDetalle_comprobanteServicio(String detalle_comprobanteServicio) {
        this.detalle_comprobanteServicio = detalle_comprobanteServicio;
    }

    public int getId_equipo_comprobanteServicio() {
        return id_equipo_comprobanteServicio;
    }

    public void setId_equipo_comprobanteServicio(int id_equipo_comprobanteServicio) {
        this.id_equipo_comprobanteServicio = id_equipo_comprobanteServicio;
    }
    
    
    

    
}
