/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

//import java.sql.Date;
import java.util.Date;
import model.StakeholderModel;
/**
 *
 * @author JOES
 */
public class Stakeholder extends Usuario{
    
    protected int id_stakeholder;
    protected int documento_stakeholder;
    protected int id_cargo_stakeholder;
    protected int id_tipoDocumento_stakeholder;
    protected int id_usuario_stakeholder;
    protected Date fechaCreacion;
    protected Date fechaActualizacion;
    protected Date fechaEliminado;
    
    private StakeholderModel stakeholderModel = new StakeholderModel();

    public Stakeholder() {
    }

    public Stakeholder(int id_stakeholder, int documento_stakeholder, int id_cargo_stakeholder, int id_tipoDocumento_stakeholder, int id_usuario_stakeholder, Date fechaCreacion, Date fechaActualizacion, Date fechaEliminado) {
        this.id_stakeholder = id_stakeholder;
        this.documento_stakeholder = documento_stakeholder;
        this.id_cargo_stakeholder = id_cargo_stakeholder;
        this.id_tipoDocumento_stakeholder = id_tipoDocumento_stakeholder;
        this.id_usuario_stakeholder = id_usuario_stakeholder;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaEliminado = fechaEliminado;
    }

    public int getId_stakeholder() {
        return id_stakeholder;
    }

    public void setId_stakeholder(int id_stakeholder) {
        this.id_stakeholder = id_stakeholder;
    }

    public int getDocumento_stakeholder() {
        return documento_stakeholder;
    }

    public void setDocumento_stakeholder(int documento_stakeholder) {
        this.documento_stakeholder = documento_stakeholder;
    }

    public int getId_cargo_stakeholder() {
        return id_cargo_stakeholder;
    }

    public void setId_cargo_stakeholder(int id_cargo_stakeholder) {
        this.id_cargo_stakeholder = id_cargo_stakeholder;
    }

    public int getId_tipoDocumento_stakeholder() {
        return id_tipoDocumento_stakeholder;
    }

    public void setId_tipoDocumento_stakeholder(int id_tipoDocumento_stakeholder) {
        this.id_tipoDocumento_stakeholder = id_tipoDocumento_stakeholder;
    }

    public int getId_usuario_stakeholder() {
        return id_usuario_stakeholder;
    }

    public void setId_usuario_stakeholder(int id_usuario_stakeholder) {
        this.id_usuario_stakeholder = id_usuario_stakeholder;
    }

    @Override
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    @Override
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    @Override
    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    @Override
    public Date getFechaEliminado() {
        return fechaEliminado;
    }

    @Override
    public void setFechaEliminado(Date fechaEliminado) {
        this.fechaEliminado = fechaEliminado;
    }

    @Override
    public int getId_usuario() {
        return id_usuario;
    }

    @Override
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String getNickName_usuario() {
        return nickName_usuario;
    }

    @Override
    public void setNickName_usuario(String nickName_usuario) {
        this.nickName_usuario = nickName_usuario;
    }

    @Override
    public String getPrimerNombre_usuario() {
        return primerNombre_usuario;
    }

    @Override
    public void setPrimerNombre_usuario(String primerNombre_usuario) {
        this.primerNombre_usuario = primerNombre_usuario;
    }

    @Override
    public String getSegundoNombre_usuario() {
        return segundoNombre_usuario;
    }

    @Override
    public void setSegundoNombre_usuario(String segundoNombre_usuario) {
        this.segundoNombre_usuario = segundoNombre_usuario;
    }

    @Override
    public String getPrimerApellido_usuario() {
        return primerApellido_usuario;
    }

    @Override
    public void setPrimerApellido_usuario(String primerApellido_usuario) {
        this.primerApellido_usuario = primerApellido_usuario;
    }

    @Override
    public String getSegundoApellido_usuario() {
        return segundoApellido_usuario;
    }

    @Override
    public void setSegundoApellido_usuario(String segundoApellido_usuario) {
        this.segundoApellido_usuario = segundoApellido_usuario;
    }

    @Override
    public String getEmail_usuario() {
        return email_usuario;
    }

    @Override
    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    @Override
    public String getPsw_usuario() {
        return psw_usuario;
    }

    @Override
    public void setPsw_usuario(String psw_usuario) {
        this.psw_usuario = psw_usuario;
    }

    @Override
    public int getId_rol_usuario() {
        return id_rol_usuario;
    }

    @Override
    public void setId_rol_usuario(int id_rol_usuario) {
        this.id_rol_usuario = id_rol_usuario;
    }

    @Override
    public String getActivation_token() {
        return activation_token;
    }

    @Override
    public void setActivation_token(String activation_token) {
        this.activation_token = activation_token;
    }

    @Override
    public String getReset_token() {
        return reset_token;
    }

    @Override
    public void setReset_token(String reset_token) {
        this.reset_token = reset_token;
    }

    @Override
    public Date getReset_token_expires_at() {
        return reset_token_expires_at;
    }

    @Override
    public void setReset_token_expires_at(Date reset_token_expires_at) {
        this.reset_token_expires_at = reset_token_expires_at;
    }

    @Override
    public boolean isActive() {
        return active;
    }

    @Override
    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String getAvatar_usuario() {
        return avatar_usuario;
    }

    @Override
    public void setAvatar_usuario(String avatar_usuario) {
        this.avatar_usuario = avatar_usuario;
    }

    @Override
    public Date getFecha_registroUsuario() {
        return fecha_registroUsuario;
    }

    @Override
    public void setFecha_registroUsuario(Date fecha_registroUsuario) {
        this.fecha_registroUsuario = fecha_registroUsuario;
    }

    @Override
    public int getId_tipoUsuario_usuario() {
        return id_tipoUsuario_usuario;
    }

    @Override
    public void setId_tipoUsuario_usuario(int id_tipoUsuario_usuario) {
        this.id_tipoUsuario_usuario = id_tipoUsuario_usuario;
    }

    @Override
    public boolean isDeleted() {
        return deleted;
    }

    @Override
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
    
    public Stakeholder findStakeholder(int idStakeholder){
        return stakeholderModel.findStakeholder(idStakeholder);
    }
    
    
    
    
    
    
    
}
