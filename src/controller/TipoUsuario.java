/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author jogof
 */
public class TipoUsuario {
    
    protected int id_tipoUsuario;
    protected String tipoUsuario;

    public TipoUsuario() {
    }

    public TipoUsuario(int id_tipoUsuario, String tipoUsuario) {
        this.id_tipoUsuario = id_tipoUsuario;
        this.tipoUsuario = tipoUsuario;
    }

    public int getId_tipoUsuario() {
        return id_tipoUsuario;
    }

    public void setId_tipoUsuario(int id_tipoUsuario) {
        this.id_tipoUsuario = id_tipoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "TipoUsuario{" + "id_tipoUsuario=" + id_tipoUsuario + ", tipoUsuario=" + tipoUsuario + '}';
    }
    
    
    
}
