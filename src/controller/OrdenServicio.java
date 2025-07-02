/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.time.LocalDate;

/**
 *
 * @author JOES
 */
public class OrdenServicio {
    
    protected int id_ordenServicio;
    protected LocalDate fecha_ordenServicio;
    protected int id_tipoServicio_ordenServicio;
    protected int id_Equipo_ordenServicio;
    protected String detalle_ordenServicio;
    protected int id_usuario_solicitanteOrden;
    protected int id_usuario_tecnicoOrden;
    protected int id_estado_ordenServicio;

    public OrdenServicio() {
    }

    public OrdenServicio(int id_ordenServicio, LocalDate fecha_ordenServicio, int id_tipoServicio_ordenServicio, int id_Equipo_ordenServicio, String detalle_ordenServicio, int id_usuario_solicitanteOrden, int id_usuario_tecnicoOrden, int id_estado_ordenServicio) {
        this.id_ordenServicio = id_ordenServicio;
        this.fecha_ordenServicio = fecha_ordenServicio;
        this.id_tipoServicio_ordenServicio = id_tipoServicio_ordenServicio;
        this.id_Equipo_ordenServicio = id_Equipo_ordenServicio;
        this.detalle_ordenServicio = detalle_ordenServicio;
        this.id_usuario_solicitanteOrden = id_usuario_solicitanteOrden;
        this.id_usuario_tecnicoOrden = id_usuario_tecnicoOrden;
        this.id_estado_ordenServicio = id_estado_ordenServicio;
    }

    public int getId_ordenServicio() {
        return id_ordenServicio;
    }

    public void setId_ordenServicio(int id_ordenServicio) {
        this.id_ordenServicio = id_ordenServicio;
    }

    public LocalDate getFecha_ordenServicio() {
        return fecha_ordenServicio;
    }

    public void setFecha_ordenServicio(LocalDate fecha_ordenServicio) {
        this.fecha_ordenServicio = fecha_ordenServicio;
    }

    public int getId_tipoServicio_ordenServicio() {
        return id_tipoServicio_ordenServicio;
    }

    public void setId_tipoServicio_ordenServicio(int id_tipoServicio_ordenServicio) {
        this.id_tipoServicio_ordenServicio = id_tipoServicio_ordenServicio;
    }

    public int getId_Equipo_ordenServicio() {
        return id_Equipo_ordenServicio;
    }

    public void setId_Equipo_ordenServicio(int id_Equipo_ordenServicio) {
        this.id_Equipo_ordenServicio = id_Equipo_ordenServicio;
    }

    public String getDetalle_ordenServicio() {
        return detalle_ordenServicio;
    }

    public void setDetalle_ordenServicio(String detalle_ordenServicio) {
        this.detalle_ordenServicio = detalle_ordenServicio;
    }

    public int getId_usuario_solicitanteOrden() {
        return id_usuario_solicitanteOrden;
    }

    public void setId_usuario_solicitanteOrden(int id_usuario_solicitanteOrden) {
        this.id_usuario_solicitanteOrden = id_usuario_solicitanteOrden;
    }

    public int getId_usuario_tecnicoOrden() {
        return id_usuario_tecnicoOrden;
    }

    public void setId_usuario_tecnicoOrden(int id_usuario_tecnicoOrden) {
        this.id_usuario_tecnicoOrden = id_usuario_tecnicoOrden;
    }

    public int getId_estado_ordenServicio() {
        return id_estado_ordenServicio;
    }

    public void setId_estado_ordenServicio(int id_estado_ordenServicio) {
        this.id_estado_ordenServicio = id_estado_ordenServicio;
    }
    
    
    
}
