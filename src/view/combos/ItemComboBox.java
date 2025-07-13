/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.combos;

import conexion.Conexion;
import javax.swing.JComboBox;
import javax.swing.plaf.ComboBoxUI;
import model.CargoModel;

/**
 *
 * @author JOES
 */
class ItemComboBox extends ComboBoxUI {

    int id_cargo;
    String cargo;
    
    public ItemComboBox() {
    }
    
    

    

    @Override
    public void setPopupVisible(JComboBox<?> c, boolean v) {
        setPopupVisible(c, v);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isPopupVisible(JComboBox<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isFocusTraversable(JComboBox<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
        
    
}
