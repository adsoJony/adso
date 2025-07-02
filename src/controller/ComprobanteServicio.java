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
public class ComprobanteServicio {
    
    protected int id_comprobanteServicio;
    protected Date fecha_comprobanteServicio;
    protected int id_ordenServicio_comprobanteServicio;
    protected int id_tipoServicio_comprobanteServicio;
    protected int id_usuarioSolicitante;
    protected int id_usuario_tecnico;
    protected String detalle_comprobanteServicio;
    protected int id_equipo_comprobanteServicio;

    public ComprobanteServicio() {
    }

    public ComprobanteServicio(int id_comprobanteServicio, Date fecha_comprobanteServicio, int id_ordenServicio_comprobanteServicio, int id_tipoServicio_comprobanteServicio, int id_usuarioSolicitante, int id_usuario_tecnico, String detalle_comprobanteServicio, int id_equipo_comprobanteServicio) {
        this.id_comprobanteServicio = id_comprobanteServicio;
        this.fecha_comprobanteServicio = fecha_comprobanteServicio;
        this.id_ordenServicio_comprobanteServicio = id_ordenServicio_comprobanteServicio;
        this.id_tipoServicio_comprobanteServicio = id_tipoServicio_comprobanteServicio;
        this.id_usuarioSolicitante = id_usuarioSolicitante;
        this.id_usuario_tecnico = id_usuario_tecnico;
        this.detalle_comprobanteServicio = detalle_comprobanteServicio;
        this.id_equipo_comprobanteServicio = id_equipo_comprobanteServicio;
    }
    
    
    
    
}
