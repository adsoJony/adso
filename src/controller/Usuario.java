
package controller;

import java.util.Date;

/**
 *
 * @author jogof
 */
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
    protected int activation_token;
    protected int reset_token;
    protected int reset_token_expires_at;
    protected boolean active;
    protected String avatar_usuario;
    protected Date fecha_registroUsuario;
    protected int id_tipousuario_usuario;
    protected boolean deleted;

    public Usuario() {
    }

    public int getId_usuario() {
        return id_usuario;
    }

    /*
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
     */
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

    public int getActivation_token() {
        return activation_token;
    }

    public void setActivation_token(int activation_token) {
        this.activation_token = activation_token;
    }

    public int getReset_token() {
        return reset_token;
    }

    public void setReset_token(int reset_token) {
        this.reset_token = reset_token;
    }

    public int getReset_token_expires_at() {
        return reset_token_expires_at;
    }

    public void setReset_token_expires_at(int reset_token_expires_at) {
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

    public int getId_tipousuario_usuario() {
        return id_tipousuario_usuario;
    }

    public void setId_tipousuario_usuario(int id_tipousuario_usuario) {
        this.id_tipousuario_usuario = id_tipousuario_usuario;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

}
