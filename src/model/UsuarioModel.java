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
import java.time.LocalDate;

/**
 *
 * @author jogof
 */
public class UsuarioModel {

    Conexion con;

    public void UsuarioModel(Conexion con) {
        this.con = con;
    }

    public Usuario findUsuario(int idUsuario) throws SQLException {
        var usuario = new Usuario();
        String sql = "select * from usuarios where id_usuario=?";
        PreparedStatement ps;

        try {
            ps = Conexion.prepararConsulta(sql);
            ps.setInt(1, idUsuario);

            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next()) {
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNickName_usuario(rs.getString("nickName_usuario"));
                usuario.setPrimerNombre_usuario(rs.getString("primerNombre_usuario"));
                usuario.setSegundoNombre_usuario(rs.getString("segundoNombre_usuario"));
                usuario.setPrimerApellido_usuario(rs.getString("primerApellido_usuario"));
                usuario.setSegundoApellido_usuario(rs.getString("segundoApellido_usuario"));
                usuario.setEmail_usuario(rs.getString("email_usuario"));
                usuario.setId_rol_usuario(rs.getInt("id_rol_usuario"));
                Date fechaCreacion_u = rs.getDate("fechaCreacion");                                             //Tomamos la fecha de tipo SqlDate
                LocalDate fechaCreacion = (fechaCreacion_u != null) ? fechaCreacion_u.toLocalDate() : null;    //Convertimos a LocalDate
                usuario.setFechaCreacion(fechaCreacion);                                                        //Instanciamos la propiedad con LocalDate
                Date fechaActualizacion_u = rs.getDate("fechaActualizacion");
                LocalDate fechaActualizacion = (fechaActualizacion_u != null) ? fechaActualizacion_u.toLocalDate() : null;
                usuario.setFechaActualizacion(fechaActualizacion);
                Date fechaEliminado_u = rs.getDate("fechaEliminado");
                LocalDate fechaEliminado = (fechaEliminado_u != null) ? fechaEliminado_u.toLocalDate() : null;
                usuario.setFechaEliminado(fechaEliminado);
                //usuario.setFechaEliminado(rs.getDate("fechaEliminado"));
                usuario.setActivation_token(rs.getString("activation_token"));
                usuario.setReset_token(rs.getString("reset_token"));
                Date reset_token_expires = rs.getDate("reset_token_expires_at");
                LocalDate reset_token_expires_at = (reset_token_expires != null) ? reset_token_expires.toLocalDate() : null;
                usuario.setReset_token_expires_at(reset_token_expires_at);
                //usuario.setReset_token_expires_at(rs.getDate("reset_token_expires_at"));
                usuario.setActive(rs.getBoolean("active"));
                usuario.setAvatar_usuario(rs.getString("avatar_usuario"));
                Date fechaRegistro = rs.getDate("fecha_registrousuario");
                LocalDate fecha_regsitroUsuario = (fechaRegistro != null) ? fechaRegistro.toLocalDate() : null;
                usuario.setFecha_registroUsuario(fecha_regsitroUsuario);
                //usuario.setFecha_registroUsuario(rs.getDate("fecha_registroUsuario"));
                usuario.setId_tipoUsuario_usuario(rs.getInt("id_tipoUsuario_usuario"));
                usuario.setDeleted(rs.getBoolean("deleted"));
                System.out.println("Se encontro la búsqueda de Usuario");
            } else {
                System.err.println("Error: No se pudo encontrar la Búsqueda de Usuario");
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }

        return usuario;
    }

    public List<Usuario> listar() {
        List<Usuario> usuarios = new ArrayList<>();
        String query = "SELECT * FROM usuarios where deleted=0";
        try {
            PreparedStatement stmt = Conexion.prepararConsulta(query);
            //ResultSet rs = con.prepareStatement();
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {         //Mejorar este algritmo para colocar todas las propiedades..
                usuarios.add(new Usuario(rs.getInt("id_usuario"), rs.getString("primerNombre_usuario"), rs.getString("segundoNombre_usuario"), rs.getString("primerApellido_usuario")));

            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        Conexion.close();
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
            ps.setDate(9, (usuario.getFechaCreacion() != null) ? Date.valueOf(usuario.getFechaCreacion()) : null);
            //ps.setDate(9, (Date) usuario.getFechaCreacion());
            ps.setDate(10, (usuario.getFechaActualizacion() != null) ? Date.valueOf(usuario.getFechaActualizacion()) : null);
            //ps.setDate(10, (Date) usuario.getFechaActualizacion());
            ps.setDate(11, (usuario.getFechaEliminado() != null) ? Date.valueOf(usuario.getFechaEliminado()) : null);
            //ps.setDate(11, (Date) usuario.getFechaEliminado());
            ps.setString(12, usuario.getActivation_token());
            ps.setString(13, usuario.getReset_token());
            ps.setDate(14, (usuario.getReset_token_expires_at() != null) ? Date.valueOf(usuario.getReset_token_expires_at()) : null);
            //ps.setDate(14, (Date) usuario.getReset_token_expires_at());
            ps.setBoolean(15, usuario.isActive());
            ps.setString(16, usuario.getAvatar_usuario());
            ps.setDate(17, (usuario.getFecha_registroUsuario() != null) ? Date.valueOf(usuario.getFecha_registroUsuario()) : null);
            //ps.setDate(17, (Date) usuario.getFecha_registroUsuario());
            ps.setInt(18, usuario.getId_tipoUsuario_usuario());           //Se escoje por defecto el número 2(dos)  que es el "id_TipoUsuario=2" como cliente
            ps.setBoolean(19, usuario.isDeleted());

            if (ps.executeUpdate() != 0) {
                System.out.println("usuario ingresado");
                //ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();  //Se solicita el ultimo id que se insertó!
                if (rs.next()) {
                    //int idusuario;
                    id_usuario = rs.getInt(1);
                    System.out.println("id de usuario es: " + id_usuario);
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

    public boolean updateUsuario(Usuario usuario) throws SQLException {
        var update = false;
        //var idUsuario = usuario.getId_usuario();
        String sql = "update usuarios set nickName_usuario=?, primerNombre_usuario=?, segundoNombre_usuario=?, primerApellido_usuario=?, segundoApellido_usuario=?,"
                + " email_usuario=?, psw_usuario=?, fechaCreacion=?, fechaActualizacion=?, fechaEliminado=?, activation_token=?, reset_token=?,"
                + "reset_token_expires_at=?, active=?, avatar_usuario=?, fecha_registrousuario=?, deleted=? where id_usuario=?";
        PreparedStatement ps;
        try {
            ps = Conexion.prepararConsulta(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, usuario.getNickName_usuario());
            ps.setString(2, usuario.getPrimerNombre_usuario());
            ps.setString(3, usuario.getSegundoNombre_usuario());
            ps.setString(4, usuario.getPrimerApellido_usuario());
            ps.setString(5, usuario.getSegundoApellido_usuario());
            ps.setString(6, usuario.getEmail_usuario());
            ps.setString(7, usuario.getPsw_usuario());
           // ps.setInt(8, usuario.getId_rol_usuario());
            ps.setDate(8, (usuario.getFechaCreacion() != null) ? Date.valueOf(usuario.getFechaCreacion()) : null);
            //ps.setDate(9, (Date) usuario.getFechaCreacion());
            ps.setDate(9, (usuario.getFechaActualizacion() != null) ? Date.valueOf(usuario.getFechaActualizacion()) : null);
            //ps.setDate(10, (Date) usuario.getFechaActualizacion());
            ps.setDate(10, (usuario.getFechaEliminado() != null) ? Date.valueOf(usuario.getFechaEliminado()) : null);
            //ps.setDate(11, (Date) usuario.getFechaEliminado());
            ps.setString(11, usuario.getActivation_token());
            ps.setString(12, usuario.getReset_token());
            ps.setDate(13, (usuario.getReset_token_expires_at() != null) ? Date.valueOf(usuario.getReset_token_expires_at()) : null);
            //ps.setDate(14, (Date) usuario.getReset_token_expires_at());
            ps.setBoolean(14, usuario.isActive());
            ps.setString(15, usuario.getAvatar_usuario());
            ps.setDate(16, (usuario.getFecha_registroUsuario() != null) ? Date.valueOf(usuario.getFecha_registroUsuario()) : null);
            //ps.setDate(17, (Date) usuario.getFecha_registroUsuario());
            
            ps.setBoolean(17, usuario.isDeleted());
            ps.setInt(18, usuario.getId_usuario());

            if (ps.executeUpdate() != 0) {
                System.out.println("El usuario ha sido Actualizado");
                update = true;
            } else {
                System.err.println("El Usuario no pudo ser Actualizado");
            }
            ps.close();

        } catch (SQLException e) {
            System.err.println("Error: " +e);
        }
        Conexion.close();
        return update;
    }

    public boolean deleteUsuario(int idUsuario) throws SQLException {
        var deleted = false;
        String sql = "update usuarios "
                + "set deleted=1 "
                + "where id_usuario =?";

        try {
            PreparedStatement ps;
            ps = Conexion.prepararConsulta(sql);
            ps.setInt(1, idUsuario);
            ResultSet rs;
            //rs = ps.executeQuery();

            if (ps.executeUpdate() != 0) {

                deleted = true;
                System.out.println("El usuario ha sido borrado exitosamente");

            } else {
                System.err.println("El usuario no se pudo borrar");
            }
            ps.close();

        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }
        Conexion.close();
        return deleted;
    }

    //Validación si el Usuario existe
    public boolean checkNickname(String nickName) throws SQLException {
        var check = true;
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

    //Validación si el Email existe
    public boolean checkEmail(String email) throws SQLException {
        var check = true;
        String sql = "select email_usuario from usuarios where email_usuario=?";

        try {
            PreparedStatement ps;
            ps = Conexion.prepararConsulta(sql);
            ps.setString(1, email);
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
        }
        Conexion.close();
        return check;
    }
}
