/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

//import com.mysql.cj.xdevapi.Statement;    //Con este no funciona el RETURN_GENERATE_KEYS
import conexion.Conexion;
import controller.Usuario;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jogof
 */
public class UsuarioModel {

    private final Conexion con;

    public UsuarioModel(Conexion con) {
        this.con = con;
    }

    public List<Usuario> obtenerUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String query = "SELECT * FROM usuarios";
        try {
            PreparedStatement stmt = Conexion.prepararConsulta(query);
            //ResultSet rs = con.prepareStatement();
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                usuarios.add(new Usuario(rs.getInt("id_usuario"), rs.getString("primerNombre_usuario"), rs.getString("segundoNombre_usuario"), rs.getString("primerApellido_usuario")));
            }
            for (Usuario usr : usuarios) {
                System.out.println(usr.getId_rol_usuario());
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }

        return usuarios;
    }

    public int inputUsuario(Usuario usuario) throws SQLException {
        int id_usuario = 0;
        String query = "insert into usuarios(nickName_usuario, primerNombre_usuario, segundoNombre_usuario, primerApellido_usuario, segundoApellido_usuario,"
                + " email_usuario, psw_usuario,id_rol_usuario, fechaCreacion, fechaActualizacion, fechaEliminado, activation_token, reset_token,"
                + "reset_token_expires_at, active, avatar_usuario, fecha_registrousuario, id_tipoUsuario_usuario, deleted)"
                + " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = Conexion.prepararConsulta(query, Statement.RETURN_GENERATED_KEYS); //Solicitamos el id registrado por medio del flag Statement.RETURN_GENERATED_KEYS
            ps.setString(1, usuario.getNickName_usuario());
            ps.setString(2, usuario.getPrimerNombre_usuario());
            ps.setString(3, usuario.getSegundoNombre_usuario());
            ps.setString(4, usuario.getPrimerApellido_usuario());
            ps.setString(5, usuario.getSegundoApellido_usuario());
            ps.setString(6, usuario.getEmail_usuario());
            ps.setString(7, usuario.getPsw_usuario());
            ps.setInt(8, usuario.getId_rol_usuario());
            ps.setDate(9, (Date) usuario.getFechaCreacion());
            ps.setDate(10, (Date) usuario.getFechaActualizacion());
            ps.setDate(11, (Date) usuario.getFechaEliminado());
            ps.setString(12, usuario.getActivation_token());
            ps.setString(13, usuario.getReset_token());
            ps.setDate(14, (Date) usuario.getReset_token_expires_at());
            ps.setBoolean(15, usuario.isActive());
            ps.setString(16, usuario.getAvatar_usuario());
            ps.setDate(17, (Date) usuario.getFecha_registroUsuario());
            ps.setInt(18, usuario.getId_tipoUsuario_usuario());
            ps.setBoolean(19, usuario.isDeleted());

            if (ps.executeUpdate() != 0) {
                System.out.println("usuario ingresado");
                //ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();  //Se solicita el ultimo id que se insertó!
                if (rs.next()) {
                    //int idusuario;
                    id_usuario = rs.getInt(1);
                    System.out.print("id de usuario es: " + id_usuario);
                    return id_usuario;
                }
                rs.close();

            } else {
                System.err.println("No se pudo ingresar el usuario");
                Conexion.rollBack();
            }
            ps.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }
        Conexion.close();
        return id_usuario;
    }

    public boolean checkNickname(String nickName) {
        boolean check = true;
        String sql = "select nickName_usuario from usuarios where nickName_usuario =?";

        try {
            PreparedStatement ps;
            ps = Conexion.prepararConsulta(sql);
            ps.setString(1, nickName);
            ResultSet rs;
            rs = ps.executeQuery();

            if (rs.next() != true) {
                check = false;
            } else {
                check = true;
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }
        Conexion.close();
        return check;
    }
}
