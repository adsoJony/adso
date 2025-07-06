/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import conexion.Conexion;
import java.time.LocalDate;
import model.EquipoModel;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author jogof
 */
public class Equipo {

    protected int id_equipo;
    protected int id_cliente_equipo;
    protected String serie_equipo;
    protected String ubicacion_equipo;
    protected int id_marca_equipo;                  //Tenemos esta información en el objeto modelo
    protected int id_modelo_equipo;
    protected LocalDate fechaInstalacion_equipo;
    protected LocalDate ultimoMantenimiento_equipo;
    protected int id_tipoEquipo_equipo;             //Tenemos esta información en el iobjeto modelo
    //Objetos para GUI
    protected Cliente cliente;
    protected Modelo modelo;

    EquipoModel equipoModel = new EquipoModel();

    public Equipo() {
    }

    public Equipo(int id_equipo, int id_cliente_equipo, String serie_equipo, String ubicacion_equipo, int id_marca_equipo, int id_modelo_equipo, LocalDate fechaInstalacion_equipo, LocalDate ultimoMantenimiento_equipo, int id_tipoEquipo_equipo) {
        this.id_equipo = id_equipo;
        this.id_cliente_equipo = id_cliente_equipo;
        this.serie_equipo = serie_equipo;
        this.ubicacion_equipo = ubicacion_equipo;
        this.id_marca_equipo = id_marca_equipo;
        this.id_modelo_equipo = id_modelo_equipo;
        this.fechaInstalacion_equipo = fechaInstalacion_equipo;
        this.ultimoMantenimiento_equipo = ultimoMantenimiento_equipo;
        this.id_tipoEquipo_equipo = id_tipoEquipo_equipo;
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
        return "Equipo{" + "id_equipo=" + id_equipo + ", id_cliente_equipo=" + id_cliente_equipo + ", serie_equipo=" + serie_equipo + ", ubicacion_equipo=" + ubicacion_equipo + ", id_marca_equipo=" + id_marca_equipo + ", id_modelo_equipo=" + id_modelo_equipo + ", fechaInstalacion_equipo=" + fechaInstalacion_equipo + ", ultimoMantenimiento_equipo=" + ultimoMantenimiento_equipo + ", id_tipoEquipo_equipo=" + id_tipoEquipo_equipo + '}';
    }

    public Equipo findEquipo(int id_equipo) {
        return equipoModel.findEquipo(id_equipo);
    }

    public int inputEquipo(Equipo equipo) throws SQLException {

        return equipoModel.inputEquipo(equipo);
    }

    public boolean updateEquipo(Equipo equipo) throws SQLException {
        return equipoModel.updateEquipo(equipo);
    }

    public List<Equipo> listarEquipos() throws SQLException {
        return equipoModel.listarEquipos();
    }

}
