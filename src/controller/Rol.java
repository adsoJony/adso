/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author JOES
 */
public class Rol {
    protected int id_rol;
    protected String descripcion_rol;

    public Rol() {
    }

    public Rol(int id_rol, String descripcion_rol) {
        this.id_rol = id_rol;
        this.descripcion_rol = descripcion_rol;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getDescripcion_rol() {
        return descripcion_rol;
    }

    public void setDescripcion_rol(String descripcion_rol) {
        this.descripcion_rol = descripcion_rol;
    }
    
    
    
}
