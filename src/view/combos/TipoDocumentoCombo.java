/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.combos;

import controller.TipoDocumento;
import model.TipoDocumentoModel;
import java.util.List;

/**
 *
 * @author JOES
 */
public class TipoDocumentoCombo extends TipoDocumento {

    TipoDocumentoModel documentoModel = new TipoDocumentoModel();

    public TipoDocumentoCombo() {
    }

    public TipoDocumentoCombo(int id_tipoDocumento, String tipoDocumento) {
        super(id_tipoDocumento, tipoDocumento);
    }

    public TipoDocumentoCombo(String tipoDocumento, int id_tipoDocumento) {
        super(id_tipoDocumento, tipoDocumento);
    }

    @Override
    public int getId_tipoDocumento() {
        return id_tipoDocumento;
    }

    @Override
    public void setId_tipoDocumento(int id_tipoDocumento) {
        this.id_tipoDocumento = id_tipoDocumento;
    }

    @Override
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    @Override
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public List<TipoDocumento> listarTipoDocumento() {

        return documentoModel.listarTipoDocumento();
    }

}
