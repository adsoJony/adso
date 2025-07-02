/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author JOES
 */
public class Marca {
    
    protected int id_marca;
    protected String detalle_marca;

    public Marca() {
    }

    public Marca(int id_marca, String detalle_marca) {
        this.id_marca = id_marca;
        this.detalle_marca = detalle_marca;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public String getDetalle_marca() {
        return detalle_marca;
    }

    public void setDetalle_marca(String detalle_marca) {
        this.detalle_marca = detalle_marca;
    }
    
    

}
