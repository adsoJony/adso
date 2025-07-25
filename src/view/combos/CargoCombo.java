/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.combos;

import controller.Cargo;
import javax.swing.JComboBox;
import conexion.Conexion;
import model.CargoModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JOES
 */
public class CargoCombo extends Cargo {

    public Map<String, Integer> cargoMap = new HashMap<>();    // HashMap para cargar el combo cargo

    protected Conexion con;

    CargoModel cargoModel = new CargoModel();

    public CargoCombo() {
    }

    //JComboBox<ItemCombo> = new JComboBox<>();
    public CargoCombo(String cargo, int id_cargo) {
        super(cargo, id_cargo);

    }

    @Override
    public String getCargo() {
        return cargo;
    }

    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public int getId_cargo() {
        return id_cargo;
    }

    @Override
    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    @Override
    public String toString() {
        return "CargoCombo{" + "Cargo: " + this.getCargo() + " Id: " + this.getId_cargo() + '}';
    }

    /**
     *
     * @param combo
     * @return
     */
    public Cargo obtenerIdSeleccionado(JComboBox<ItemComboBox> combo) {
        Cargo seleccionado = (Cargo) combo.getSelectedItem();
        if (seleccionado != null) {
            return seleccionado;
        }
        return null; // o algún valor que indique que no hay selección
    }

    public List<Cargo> listarCargos() throws SQLException {

        return cargoModel.listarCargos();
    }

    public int idCargoComboBox(String cargo) throws SQLException {
        var idCargo = 0;
        try {
            cargoMap.clear();
            List<Cargo> listaCargo = new ArrayList();
            listaCargo = cargoModel.listarCargos();
            for (Cargo cargoList : listaCargo) {
                cargoMap.put(cargoList.getCargo(), cargoList.getId_cargo());
                if (cargoMap.containsKey(cargo));
                idCargo = cargoMap.get(cargo);
                System.out.print("Impresion de cargoMap: " + cargoMap);
            }
        } catch (SQLException e) {
            System.err.println("Error: en funcion hash " + e);
        }

        return idCargo;
    }

    public HashMap<String, Integer> hashCargo() throws SQLException {
        var list = cargoModel.listarCargos();
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (Cargo hash : list) {
            hashMap.put(hash.getCargo(), hash.getId_cargo());
        }
        return hashMap;
    }
    
    

}
