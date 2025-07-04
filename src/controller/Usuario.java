package controller;

import conexion.Conexion;
import java.util.Date;
import java.sql.*;
import java.util.List;
import model.UsuarioModel;

/**
 *
 * @author jogof
 */

//Se debe investigar el método corecto para poder actualizar de manera correcta las entidades, debido a que si solo queremos actualizar una sola variable, Como hacemos con las demás?
public class Usuario {

    protected int id_usuario;
    protected String nickName_usuario;
    protected String primerNombre_usuario;
    protected String segundoNombre_usuario;
    protected String primerApellido_usuario;
    protected String segundoApellido_usuario;
    protected String email_usuario;
    protected String psw_usuario;
    protected int id_rol_usuario;
    protected Date fechaCreacion;
    protected Date fechaActualizacion;
    protected Date fechaEliminado;
    protected String activation_token;
    protected String reset_token;
    protected Date reset_token_expires_at;
    protected boolean active;
    protected String avatar_usuario;
    protected Date fecha_registroUsuario;
    protected int id_tipoUsuario_usuario;
    protected boolean deleted;

    private Conexion con;
    private UsuarioModel usuarioModel = new UsuarioModel();

    public Usuario() {
    }

    public Usuario(String nickName_usuario, String primerNombre_usuario, String segundoNombre_usuario, String primerApellido_usuario, String segundoApellido_usuario, String email_usuario, String psw_usuario, int id_rol_usuario, Date fechaCreacion, Date fechaActualizacion, Date fechaEliminado, String activation_token, String reset_token, Date reset_token_expires_at, boolean active, String avatar_usuario, Date fecha_registroUsuario, int id_tipoUsuario_usuario, boolean deleted) {
        this.nickName_usuario = nickName_usuario;
        this.primerNombre_usuario = primerNombre_usuario;
        this.segundoNombre_usuario = segundoNombre_usuario;
        this.primerApellido_usuario = primerApellido_usuario;
        this.segundoApellido_usuario = segundoApellido_usuario;
        this.email_usuario = email_usuario;
        this.psw_usuario = psw_usuario;
        this.id_rol_usuario = id_rol_usuario;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaEliminado = fechaEliminado;
        this.activation_token = activation_token;
        this.reset_token = reset_token;
        this.reset_token_expires_at = reset_token_expires_at;
        this.active = active;
        this.avatar_usuario = avatar_usuario;
        this.fecha_registroUsuario = fecha_registroUsuario;
        this.id_tipoUsuario_usuario = id_tipoUsuario_usuario;
        this.deleted = deleted;
    }

    public Usuario(int id_usuario, String nickName_usuario, String primerNombre_usuario, String segundoNombre_usuario, String primerApellido_usuario, String segundoApellido_usuario, String email_usuario, String psw_usuario, int id_rol_usuario, Date fechaCreacion, Date fechaActualizacion, Date fechaEliminado, String activation_token, String reset_token, Date reset_token_expires_at, boolean active, String avatar_usuario, Date fecha_registroUsuario, int id_tipoUsuario_usuario, boolean deleted) {
        this.id_usuario = id_usuario;
        this.nickName_usuario = nickName_usuario;
        this.primerNombre_usuario = primerNombre_usuario;
        this.segundoNombre_usuario = segundoNombre_usuario;
        this.primerApellido_usuario = primerApellido_usuario;
        this.segundoApellido_usuario = segundoApellido_usuario;
        this.email_usuario = email_usuario;
        this.psw_usuario = psw_usuario;
        this.id_rol_usuario = id_rol_usuario;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaEliminado = fechaEliminado;
        this.activation_token = activation_token;
        this.reset_token = reset_token;
        this.reset_token_expires_at = reset_token_expires_at;
        this.active = active;
        this.avatar_usuario = avatar_usuario;
        this.fecha_registroUsuario = fecha_registroUsuario;
        this.id_tipoUsuario_usuario = id_tipoUsuario_usuario;
        this.deleted = deleted;
    }

    public Usuario(int id_usuario, String primerNombre_usuario, String segundoNombre_usuario, String primerApellido_usuario) {
        this.id_usuario = id_usuario;
        this.primerNombre_usuario = primerNombre_usuario;
        this.segundoNombre_usuario = segundoNombre_usuario;
        this.primerApellido_usuario = primerApellido_usuario;

    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNickName_usuario() {
        return nickName_usuario;
    }

    public void setNickName_usuario(String nickName_usuario) {
        this.nickName_usuario = nickName_usuario;
    }

    public String getPrimerNombre_usuario() {
        return primerNombre_usuario;
    }

    public void setPrimerNombre_usuario(String primerNombre_usuario) {
        this.primerNombre_usuario = primerNombre_usuario;
    }

    public String getSegundoNombre_usuario() {
        return segundoNombre_usuario;
    }

    public void setSegundoNombre_usuario(String segundoNombre_usuario) {
        this.segundoNombre_usuario = segundoNombre_usuario;
    }

    public String getPrimerApellido_usuario() {
        return primerApellido_usuario;
    }

    public void setPrimerApellido_usuario(String primerApellido_usuario) {
        this.primerApellido_usuario = primerApellido_usuario;
    }

    public String getSegundoApellido_usuario() {
        return segundoApellido_usuario;
    }

    public void setSegundoApellido_usuario(String segundoApellido_usuario) {
        this.segundoApellido_usuario = segundoApellido_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getPsw_usuario() {
        return psw_usuario;
    }

    public void setPsw_usuario(String psw_usuario) {
        this.psw_usuario = psw_usuario;
    }

    public int getId_rol_usuario() {
        return id_rol_usuario;
    }

    public void setId_rol_usuario(int id_rol_usuario) {
        this.id_rol_usuario = id_rol_usuario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Date getFechaEliminado() {
        return fechaEliminado;
    }

    public void setFechaEliminado(Date fechaEliminado) {
        this.fechaEliminado = fechaEliminado;
    }

    public String getActivation_token() {
        return activation_token;
    }

    public void setActivation_token(String activation_token) {
        this.activation_token = activation_token;
    }

    public String getReset_token() {
        return reset_token;
    }

    public void setReset_token(String reset_token) {
        this.reset_token = reset_token;
    }

    public Date getReset_token_expires_at() {
        return reset_token_expires_at;
    }

    public void setReset_token_expires_at(Date reset_token_expires_at) {
        this.reset_token_expires_at = reset_token_expires_at;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getAvatar_usuario() {
        return avatar_usuario;
    }

    public void setAvatar_usuario(String avatar_usuario) {
        this.avatar_usuario = avatar_usuario;
    }

    public Date getFecha_registroUsuario() {
        return fecha_registroUsuario;
    }

    public void setFecha_registroUsuario(Date fecha_registroUsuario) {
        this.fecha_registroUsuario = fecha_registroUsuario;
    }

    public int getId_tipoUsuario_usuario() {
        return id_tipoUsuario_usuario;
    }

    public void setId_tipoUsuario_usuario(int id_tipousuario_usuario) {
        this.id_tipoUsuario_usuario = id_tipousuario_usuario;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", nickName_usuario=" + nickName_usuario + ", primerNombre_usuario=" + primerNombre_usuario + ", segundoNombre_usuario=" + segundoNombre_usuario + ", primerApellido_usuario=" + primerApellido_usuario + ", segundoApellido_usuario=" + segundoApellido_usuario + ", email_usuario=" + email_usuario + ", id_rol_usuario=" + id_rol_usuario + ", fechaCreacion=" + fechaCreacion + ", fechaActualizacion=" + fechaActualizacion + ", fechaEliminado=" + fechaEliminado + ", activation_token=" + activation_token + ", reset_token=" + reset_token + ", reset_token_expires_at=" + reset_token_expires_at + ", active=" + active + ", avatar_usuario=" + avatar_usuario + ", fecha_registroUsuario=" + fecha_registroUsuario + ", id_tipoUsuario_usuario=" + id_tipoUsuario_usuario + ", deleted=" + deleted + '}';
    }

    public Usuario findUsuario(int idUsuario) throws SQLException {
        return usuarioModel.findUsuario(idUsuario);
    }

    public List<Usuario> listarUsuarios() throws SQLException {

        return usuarioModel.obtenerUsuarios();
    }

    public int inputUsuario(Usuario usuario) throws SQLException {
        //UsuarioModel usuarioModel = new UsuarioModel();
        return usuarioModel.inputUsuario(usuario);

        //return id_usuario;
    }

    public boolean updateUsuario(Usuario usuario, int idUsuario) throws SQLException {

        return usuarioModel.updateUsuario(usuario, idUsuario);
    }

    public boolean deleteUsuario(int idUsuario) throws SQLException {

        return usuarioModel.deleteUsuario(idUsuario);
    }

    public boolean checkEmail(Usuario usuario) throws SQLException {
        // UsuarioModel usuarioModel = new UsuarioModel();
        return usuarioModel.checkEmail(usuario.getEmail_usuario());
    }

    public boolean checkNickname(Usuario usuario) throws SQLException {
        // UsuarioModel usuarioModel = new UsuarioModel();
        return usuarioModel.checkNickname(usuario.getNickName_usuario());
    }

}
