/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.time.LocalTime;
/**
 *
 * @author jogof
 */
public class Ups {
    
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
    protected int cant_bancobat;

    public Ups() {
    }

    public Ups(int id_ups, int id_equipo_ups, int potencia_va, int voltajebanco_ups, int transformadorAislamiento, LocalTime tiempoAutonomia, int id_topologia_ups, int cant_batNom, int cant_batTotal, int id_ultimoComprobanteServicio, int cant_bancobat) {
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
        this.cant_bancobat = cant_bancobat;
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

    public int getCant_bancobat() {
        return cant_bancobat;
    }

    public void setCant_bancobat(int cant_bancobat) {
        this.cant_bancobat = cant_bancobat;
    }

    @Override
    public String toString() {
        return "Ups{" + "id_ups=" + id_ups + ", id_equipo_ups=" + id_equipo_ups + ", potencia_va=" + potencia_va + ", voltajebanco_ups=" + voltajebanco_ups + ", transformadorAislamiento=" + transformadorAislamiento + ", tiempoAutonomia=" + tiempoAutonomia + ", id_topologia_ups=" + id_topologia_ups + ", cant_batNom=" + cant_batNom + ", cant_batTotal=" + cant_batTotal + ", id_ultimoComprobanteServicio=" + id_ultimoComprobanteServicio + ", cant_bancobat=" + cant_bancobat + '}';
    }
    
    
    
}
