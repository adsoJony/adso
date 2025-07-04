/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Stakeholder;
import controller.Ups;
import controller.Usuario;
import java.util.Scanner;
import controller.Equipo;
import java.time.LocalDate;
import java.sql.SQLException;

/**
 *
 * @author jogof
 */
public class ConsoleView {

    public static void menu() throws SQLException {

        System.out.println("Menu desde la consola");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\r Menú Principal");
        System.out.print(" 1. Ejecutar funciones por defecto. \n"
                + " 2. Listar Usuarios. \n"
                + " 3. Listar Clientes.\n"
                + " 4. Listar Equipos. \n"
                + " 5. Insertar Equipo.\n"
                + " 6. Funcion Prueba. \n"
                + " 7. Listar Equipos."
                + " 9. Exit.\n");

        System.out.print("Ingrese la poción:");
        var input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("Imprimendo funciones por defecto");
                funciones();
                break;

            case 2:
                System.out.println("Imprimiendo Usuarios");
                break;
            case 3:
                System.out.println("opcion3");

            case 4:
                System.out.println("Opción 4");
                break;
            case 5:
                insertarEquipo();
                break;
            case 6:
                imprimirEquipo();
                menu();
            case 7:
                listarEquipos();
                break;
//break;
            case 9:
                break;
            default:
                System.out.println("Default");
                menu();
        }

    }

    public static void funciones() {
        try {
            var usuario = new Usuario();

            usuario.setPsw_usuario("PassworStakeholder");
            usuario.setEmail_usuario("email@mail.com");
            usuario.setPrimerNombre_usuario("StakeholderName");
            usuario.setPrimerApellido_usuario("stakeholderApellido");
            usuario.setNickName_usuario("nicknameStakeholder");
            usuario.setId_tipoUsuario_usuario(1);
            usuario.setId_rol_usuario(4);

            var stakeholder = new Stakeholder();

            stakeholder.setDocumento_stakeholder(1045666207);
            stakeholder.setId_cargo_stakeholder(1);
            stakeholder.setId_tipoDocumento_stakeholder(1);

            // stakeholder.inputStakeholder(stakeholder, usuario);
            System.out.println("Imprimiendo Stakehholder con función find.");
            System.out.println(stakeholder.findStakeholder(3));

            System.out.println("imprimiendo lista Stakeholder");
            var stakeholders = stakeholder.listarStakeholder();
            for (Stakeholder stk : stakeholders) {
                System.out.println(stk);
            }

            System.out.println("\r Listando Ups del cliente.");
            Ups ups = new Ups();
            var listadoUps = ups.listarUpsCliente(3);

            for (Ups equipoUps : listadoUps) {
                System.out.println(equipoUps);
            }
        } catch (Exception e) {
        }

    }

    public static void insertarEquipo() throws SQLException {
        Equipo equipo = new Equipo();
        int id_equipo;
        equipo.setId_cliente_equipo(2);
        equipo.setSerie_equipo("Serie 1234");
        equipo.setUbicacion_equipo("Ubicacion");
        equipo.setId_marca_equipo(1);
        equipo.setId_modelo_equipo(1);
        equipo.setFechaInstalacion_equipo(LocalDate.of(2025, 05, 01));
        equipo.setUltimoMantenimiento_equipo(LocalDate.of(2025, 06, 10));
        equipo.setId_tipoEquipo_equipo(1);
        try {
            id_equipo = equipo.inputEquipo(equipo);
            equipo.toString();
            System.out.println("El id del equipo ingresado es: " + id_equipo);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void imprimirEquipo() {
        Equipo equipo = new Equipo();
        int id_equipo;
        equipo.setId_cliente_equipo(2);
        equipo.setSerie_equipo("SerialEquipo");
        equipo.setUbicacion_equipo("Ubicación");
        equipo.setId_marca_equipo(1);
        equipo.setId_modelo_equipo(1);
        equipo.setFechaInstalacion_equipo(LocalDate.of(2025, 05, 01));
        equipo.setUltimoMantenimiento_equipo(LocalDate.of(2025, 06, 10));
        equipo.setId_tipoEquipo_equipo(1);

        System.out.println(equipo.toString());
    }
    
    public static void listarEquipos()  throws SQLException{
        System.out.println("\r Listando Ups del Equipos.");
            Equipo equipo = new Equipo();
            var listadoUps = equipo.listarEquipos();

            for (Equipo equipos : listadoUps) {
                System.out.println(equipos);
            }
    }

}
