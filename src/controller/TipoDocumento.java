/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author JOES
 */
public class TipoDocumento {
    
    protected int id_tipoDocumento;
    protected String tipoDocumento;

    public TipoDocumento() {
    }

    public TipoDocumento(int id_tipoDocumento, String tipoDocumento) {
        this.id_tipoDocumento = id_tipoDocumento;
        this.tipoDocumento = tipoDocumento;
    }

    public int getId_tipoDocumento() {
        return id_tipoDocumento;
    }

    public void setId_tipoDocumento(int id_tipoDocumento) {
        this.id_tipoDocumento = id_tipoDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
    
    
    
}
