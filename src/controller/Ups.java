/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.time.LocalTime;
import java.util.List;
import java.sql.SQLException;
import java.time.LocalDate;
import model.UpsModel;

/**
 *
 * @author jogof
 */
public class Ups extends Equipo {

    protected int id_ups;
    protected int id_equipo_ups;
    protected int potencia_va;
    protected int voltajebanco_ups;
    protected int transformadorAislamiento;
    protected LocalTime tiempoAutonomia;
    protected int id_topologia_ups;
    protected int cant_batNom;
    protected int cant_batTotal;
    protected int id_ultimoComprobanteServicio;
    protected int cant_bancoBat;

    private final UpsModel upsModel = new UpsModel();

    public Ups() {
    }

    public Ups(int id_ups, int id_equipo_ups, int potencia_va, int voltajebanco_ups, int transformadorAislamiento, LocalTime tiempoAutonomia, int id_topologia_ups, int cant_batNom, int cant_batTotal, int id_ultimoComprobanteServicio, int cant_bancoBat) {
        this.id_ups = id_ups;
        this.id_equipo_ups = id_equipo_ups;
        this.potencia_va = potencia_va;
        this.voltajebanco_ups = voltajebanco_ups;
        this.transformadorAislamiento = transformadorAislamiento;
        this.tiempoAutonomia = tiempoAutonomia;
        this.id_topologia_ups = id_topologia_ups;
        this.cant_batNom = cant_batNom;
        this.cant_batTotal = cant_batTotal;
        this.id_ultimoComprobanteServicio = id_ultimoComprobanteServicio;
        this.cant_bancoBat = cant_bancoBat;
    }

    public int getId_ups() {
        return id_ups;
    }

    public void setId_ups(int id_ups) {
        this.id_ups = id_ups;
    }

    public int getId_equipo_ups() {
        return id_equipo_ups;
    }

    public void setId_equipo_ups(int id_equipo_ups) {
        this.id_equipo_ups = id_equipo_ups;
    }

    public int getPotencia_va() {
        return potencia_va;
    }

    public void setPotencia_va(int potencia_va) {
        this.potencia_va = potencia_va;
    }

    public int getVoltajebanco_ups() {
        return voltajebanco_ups;
    }

    public void setVoltajebanco_ups(int voltajebanco_ups) {
        this.voltajebanco_ups = voltajebanco_ups;
    }

    public int getTransformadorAislamiento() {
        return transformadorAislamiento;
    }

    public void setTransformadorAislamiento(int transformadorAislamiento) {
        this.transformadorAislamiento = transformadorAislamiento;
    }

    public LocalTime getTiempoAutonomia() {
        return tiempoAutonomia;
    }

    public void setTiempoAutonomia(LocalTime tiempoAutonomia) {
        this.tiempoAutonomia = tiempoAutonomia;
    }

    public int getId_topologia_ups() {
        return id_topologia_ups;
    }

    public void setId_topologia_ups(int id_topologia_ups) {
        this.id_topologia_ups = id_topologia_ups;
    }

    public int getCant_batNom() {
        return cant_batNom;
    }

    public void setCant_batNom(int cant_batNom) {
        this.cant_batNom = cant_batNom;
    }

    public int getCant_batTotal() {
        return cant_batTotal;
    }

    public void setCant_batTotal(int cant_batTotal) {
        this.cant_batTotal = cant_batTotal;
    }

    public int getId_ultimoComprobanteServicio() {
        return id_ultimoComprobanteServicio;
    }

    public void setId_ultimoComprobanteServicio(int id_ultimoComprobanteServicio) {
        this.id_ultimoComprobanteServicio = id_ultimoComprobanteServicio;
    }

    public int getCant_bancoBat() {
        return cant_bancoBat;
    }

    public void setCant_bancoBat(int cant_bancoBat) {
        this.cant_bancoBat = cant_bancoBat;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public int getId_cliente_equipo() {
        return id_cliente_equipo;
    }

    public void setId_cliente_equipo(int id_cliente_equipo) {
        this.id_cliente_equipo = id_cliente_equipo;
    }

    public String getSerie_equipo() {
        return serie_equipo;
    }

    public void setSerie_equipo(String serie_equipo) {
        this.serie_equipo = serie_equipo;
    }

    public String getUbicacion_equipo() {
        return ubicacion_equipo;
    }

    public void setUbicacion_equipo(String ubicacion_equipo) {
        this.ubicacion_equipo = ubicacion_equipo;
    }

    public int getId_marca_equipo() {
        return id_marca_equipo;
    }

    public void setId_marca_equipo(int id_marca_equipo) {
        this.id_marca_equipo = id_marca_equipo;
    }

    public int getId_modelo_equipo() {
        return id_modelo_equipo;
    }

    public void setId_modelo_equipo(int id_modelo_equipo) {
        this.id_modelo_equipo = id_modelo_equipo;
    }

    public LocalDate getFechaInstalacion_equipo() {
        return fechaInstalacion_equipo;
    }

    public void setFechaInstalacion_equipo(LocalDate fechaInstalacion_equipo) {
        this.fechaInstalacion_equipo = fechaInstalacion_equipo;
    }

    public LocalDate getUltimoMantenimiento_equipo() {
        return ultimoMantenimiento_equipo;
    }

    public void setUltimoMantenimiento_equipo(LocalDate ultimoMantenimiento_equipo) {
        this.ultimoMantenimiento_equipo = ultimoMantenimiento_equipo;
    }

    public int getId_tipoEquipo_equipo() {
        return id_tipoEquipo_equipo;
    }

    public void setId_tipoEquipo_equipo(int id_tipoEquipo_equipo) {
        this.id_tipoEquipo_equipo = id_tipoEquipo_equipo;
    }

    @Override
    public String toString() {
        return "Ups{" + "id_ups=" + id_ups + ", id_equipo_ups=" + id_equipo_ups + ", potencia_va=" + potencia_va + ", voltajebanco_ups=" + voltajebanco_ups + ", transformadorAislamiento=" + transformadorAislamiento + ", tiempoAutonomia=" + tiempoAutonomia + ", id_topologia_ups=" + id_topologia_ups + ", cant_batNom=" + cant_batNom + ", cant_batTotal=" + cant_batTotal + ", id_ultimoComprobanteServicio=" + id_ultimoComprobanteServicio + ", cant_bancoBat=" + cant_bancoBat + '}';
    }
    
    

    public List<Ups> listarUpsCliente(int id_cliente) throws SQLException {

        return upsModel.listarUpsCliente(id_cliente);
    }

}
