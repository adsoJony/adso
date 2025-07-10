/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

//import model.ModeloModel;
/**
 *
 * @author JOES
 */
public class Modelo {

    protected int id_modelo;
    protected int id_marca_modelo;
    protected String detalle_modelo;
    protected String detalleEquipo_modelo;
    protected int id_voltajeOperacion_modelo;
    protected int alto;
    protected int ancho;
    protected int profundidad;
    protected int peso;
    protected int id_tipoEquipo_modelo;

    //Objetos para GUI
    public Marca marca;
    public VoltajeOperacion voltajeOperacion;
    public TipoEquipo tipoEquipo;

    //ModeloModel modeloModel = new ModeloModel();
    public Modelo() {
        this.marca = new Marca();
        this.voltajeOperacion = new VoltajeOperacion();
        this.tipoEquipo = new TipoEquipo();

    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public int getId_marca_modelo() {
        return id_marca_modelo;
    }

    public void setId_marca_modelo(int id_marca_modelo) {
        this.id_marca_modelo = id_marca_modelo;
    }

    public String getDetalle_modelo() {
        return detalle_modelo;
    }

    public void setDetalle_modelo(String detalle_modelo) {
        this.detalle_modelo = detalle_modelo;
    }

    public int getId_voltajeOperacion_modelo() {
        return id_voltajeOperacion_modelo;
    }

    public void setId_voltajeOperacion_modelo(int id_voltajeOperacion_modelo) {
        this.id_voltajeOperacion_modelo = id_voltajeOperacion_modelo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getId_tipoEquipo_modelo() {
        return id_tipoEquipo_modelo;
    }

    public void setId_tipoEquipo_modelo(int id_tipoEquipo_modelo) {
        this.id_tipoEquipo_modelo = id_tipoEquipo_modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public VoltajeOperacion getVoltajeOperacion() {
        return voltajeOperacion;
    }

    public void setVoltajeOperacion(VoltajeOperacion voltajeOperacion) {
        this.voltajeOperacion = voltajeOperacion;
    }

    public TipoEquipo getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(TipoEquipo tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public String getDetalleEquipo_modelo() {
        return detalleEquipo_modelo;
    }

    public void setDetalleEquipo_modelo(String detalleEquipo_modelo) {
        this.detalleEquipo_modelo = detalleEquipo_modelo;
    }
    
    

}
