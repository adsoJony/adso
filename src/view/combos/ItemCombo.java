/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.combos;

import conexion.Conexion;
import model.CargoModel;

/**
 *
 * @author JOES
 */
class ItemCombo extends CargoCombo {

    public ItemCombo() {
    }

    public ItemCombo(String cargo, int id_cargo) {
        super(cargo, id_cargo);
    }

    public Conexion getCon() {
        return con;
    }

    public void setCon(Conexion con) {
        this.con = con;
    }

    public CargoModel getCargoModel() {
        return cargoModel;
    }

    public void setCargoModel(CargoModel cargoModel) {
        this.cargoModel = cargoModel;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getId_cargo() {
        return id_cargo;
    }

    @Override
    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }
    
    
        
    
}
