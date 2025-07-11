/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import model.CargoModel;

/**
 *
 * @author jogof
 */
public class Cargo {

    protected String cargo;
    protected int id_cargo;
    
    CargoModel cargoModel;

    public Cargo() {
        this.cargoModel=new CargoModel();
    }

    public Cargo(String cargo, int id_cargo) {
        this.cargo = cargo;
        this.id_cargo = id_cargo;
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

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }
    
    public List<Cargo> listarCargos() throws SQLException {

        return cargoModel.listarCargos();
    }

    
     public HashMap<String, Integer> hashMapCargo() throws SQLException {
        var list = cargoModel.listarCargos();
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (Cargo hash : list) {
            hashMap.put(hash.getCargo(), hash.getId_cargo());
        }
        return hashMap;
    }
    
}
