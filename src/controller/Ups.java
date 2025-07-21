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
    protected boolean transformadorAislamiento;
    protected int tiempoAutonomia_ups;
    protected int id_topologia_ups;
    protected int cant_batNom;
    protected int cant_batTotal;
    protected int id_ultimoComprobanteServicio;
    protected int cant_bancoBat;
    //Ojbjetos para GUI
    public Topologia topologia;
    public Equipo equipo;

    private final UpsModel upsModel = new UpsModel();

    public Ups() {
        this.topologia = new Topologia();
        this.equipo = new Equipo();
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

    public boolean getTransformadorAislamiento() {
        return transformadorAislamiento;
    }

    public void setTransformadorAislamiento(boolean transformadorAislamiento) {
        this.transformadorAislamiento = transformadorAislamiento;
    }

    public int getTiempoAutonomia_ups() {
        return tiempoAutonomia_ups;
    }

    public void setTiempoAutonomia_ups(int tiempoAutonomia_ups) {
        this.tiempoAutonomia_ups = tiempoAutonomia_ups;
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

    public Topologia getTopologia() {
        return topologia;
    }

    public void setTopologia(Topologia topologia) {
        this.topologia = topologia;
    }

    @Override
    public int getId_equipo() {
        return id_equipo;
    }

    @Override
    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    @Override
    public int getId_cliente_equipo() {
        return id_cliente_equipo;
    }

    @Override
    public void setId_cliente_equipo(int id_cliente_equipo) {
        this.id_cliente_equipo = id_cliente_equipo;
    }

    @Override
    public String getSerie_equipo() {
        return serie_equipo;
    }

    @Override
    public void setSerie_equipo(String serie_equipo) {
        this.serie_equipo = serie_equipo;
    }

    @Override
    public String getUbicacion_equipo() {
        return ubicacion_equipo;
    }

    @Override
    public void setUbicacion_equipo(String ubicacion_equipo) {
        this.ubicacion_equipo = ubicacion_equipo;
    }

    @Override
    public int getId_marca_equipo() {
        return id_marca_equipo;
    }

    @Override
    public void setId_marca_equipo(int id_marca_equipo) {
        this.id_marca_equipo = id_marca_equipo;
    }

    @Override
    public int getId_modelo_equipo() {
        return id_modelo_equipo;
    }

    @Override
    public void setId_modelo_equipo(int id_modelo_equipo) {
        this.id_modelo_equipo = id_modelo_equipo;
    }

    @Override
    public LocalDate getFechaInstalacion_equipo() {
        return fechaInstalacion_equipo;
    }

    @Override
    public void setFechaInstalacion_equipo(LocalDate fechaInstalacion_equipo) {
        this.fechaInstalacion_equipo = fechaInstalacion_equipo;
    }

    @Override
    public LocalDate getUltimoMantenimiento_equipo() {
        return ultimoMantenimiento_equipo;
    }

    @Override
    public void setUltimoMantenimiento_equipo(LocalDate ultimoMantenimiento_equipo) {
        this.ultimoMantenimiento_equipo = ultimoMantenimiento_equipo;
    }

    @Override
    public int getId_tipoEquipo_equipo() {
        return id_tipoEquipo_equipo;
    }

    @Override
    public void setId_tipoEquipo_equipo(int id_tipoEquipo_equipo) {
        this.id_tipoEquipo_equipo = id_tipoEquipo_equipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Ups{" + "id_ups=" + id_ups + ", id_equipo_ups=" + id_equipo_ups + ", potencia_va=" + potencia_va + ", voltajebanco_ups=" + voltajebanco_ups + ", transformadorAislamiento=" + transformadorAislamiento + ", tiempoAutonomia=" + tiempoAutonomia_ups + ", id_topologia_ups=" + id_topologia_ups + ", cant_batNom=" + cant_batNom + ", cant_batTotal=" + cant_batTotal + ", id_ultimoComprobanteServicio=" + id_ultimoComprobanteServicio + ", cant_bancoBat=" + cant_bancoBat + '}';
    }

    public String toString(Ups ups) {
        return "Ups";
    }
    
    

    public List<Ups> listarUpsByCliente(int id_cliente) throws SQLException {

        return upsModel.listarUpsByCliente(id_cliente);
    }

    public boolean inputUps(Ups ups, Equipo equipo) throws SQLException {
        return upsModel.inputUps(ups, equipo);
    }
    
    public boolean update(Ups ups) throws SQLException{
        return upsModel.update(ups);
           
    }
    
}
