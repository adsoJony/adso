/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Date;
import model.ClienteModel;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jogof
 */
public class Cliente extends Usuario {

    protected int id_cliente;
    protected int id_usuario_cliente;
    protected int id_cargo_cliente;
    protected String direccion_cliente;
    protected int telefono_cliente;
    protected int id_tipoDocumento_cliente;
    protected int documento_cliente;
    protected String razonSocial_cliente;

    private static final ClienteModel clienteModel = new ClienteModel();

    public Cliente() {

    }

    public Cliente(int id_usuario_cliente, int id_cargo_cliente, String direccion_cliente, int telefono_cliente, int id_tipoDocumento_cliente, int documento_cliente, String razonSocial_cliente) {
        this.id_usuario_cliente = id_usuario_cliente;
        this.id_cargo_cliente = id_cargo_cliente;
        this.direccion_cliente = direccion_cliente;
        this.telefono_cliente = telefono_cliente;
        this.id_tipoDocumento_cliente = id_tipoDocumento_cliente;
        this.documento_cliente = documento_cliente;
        this.razonSocial_cliente = razonSocial_cliente;
    }

    public Cliente(int id_cliente, int id_usuario_cliente, int id_cargo_cliente, String direccion_cliente, int telefono_cliente, int id_tipoDocumento_cliente, int documento_cliente, String razonSocial_cliente) {
        this.id_cliente = id_cliente;
        this.id_usuario_cliente = id_usuario_cliente;
        this.id_cargo_cliente = id_cargo_cliente;
        this.direccion_cliente = direccion_cliente;
        this.telefono_cliente = telefono_cliente;
        this.id_tipoDocumento_cliente = id_tipoDocumento_cliente;
        this.documento_cliente = documento_cliente;
        this.razonSocial_cliente = razonSocial_cliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_usuario_cliente() {
        return id_usuario_cliente;
    }

    public void setId_usuario_cliente(int id_usuario_cliente) {
        this.id_usuario_cliente = id_usuario_cliente;
    }

    public int getId_cargo_cliente() {
        return id_cargo_cliente;
    }

    public void setId_cargo_cliente(int id_cargo_cliente) {
        this.id_cargo_cliente = id_cargo_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public int getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(int telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public int getId_tipoDocumento_cliente() {
        return id_tipoDocumento_cliente;
    }

    public void setId_tipoDocumento_cliente(int id_tipoDocumento_cliente) {
        this.id_tipoDocumento_cliente = id_tipoDocumento_cliente;
    }

    public int getDocumento_cliente() {
        return documento_cliente;
    }

    public void setDocumento_cliente(int documento_cliente) {
        this.documento_cliente = documento_cliente;
    }

    public String getRazonSocial_cliente() {
        return razonSocial_cliente;
    }

    public void setRazonSocial_cliente(String razonSocial_cliente) {
        this.razonSocial_cliente = razonSocial_cliente;
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

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDate fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public LocalDate getFechaEliminado() {
        return fechaEliminado;
    }

    public void setFechaEliminado(LocalDate fechaEliminado) {
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

    public LocalDate getReset_token_expires_at() {
        return reset_token_expires_at;
    }

    public void setReset_token_expires_at(LocalDate reset_token_expires_at) {
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

    public LocalDate getFecha_registroUsuario() {
        return fecha_registroUsuario;
    }

    public void setFecha_registroUsuario(LocalDate fecha_registroUsuario) {
        this.fecha_registroUsuario = fecha_registroUsuario;
    }

    public int getId_tipoUsuario_usuario() {
        return id_tipoUsuario_usuario;
    }

    public void setId_tipoUsuario_usuario(int id_tipoUsuario_usuario) {
        this.id_tipoUsuario_usuario = id_tipoUsuario_usuario;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    
    

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", id_usuario_cliente=" + id_usuario_cliente + ", id_cargo_cliente=" + id_cargo_cliente + ", direccion_cliente=" + direccion_cliente + ", telefono_cliente=" + telefono_cliente + ", id_tipoDocumento_cliente=" + id_tipoDocumento_cliente + ", documento_cliente=" + documento_cliente + ", razonSocial_cliente=" + razonSocial_cliente + '}';
    }

    public int inputCliente(Cliente cliente, Usuario usuario) throws SQLException {     //Manejar las excepciones desde un paquete de excepciones

        return clienteModel.InputCliente(cliente, usuario);

    }

    public boolean updateCliente(Cliente cliente, Usuario usuario) throws SQLException {

        return clienteModel.updateCliente(cliente, usuario);
    }

    public List<Cliente> listarClientes() throws SQLException {  

        return clienteModel.listarClientes();

    }

    public Cliente findCliente(int idCliente) throws SQLException {
        return clienteModel.findCliente(idCliente);
    }

}
