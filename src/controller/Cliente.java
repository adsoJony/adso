/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.Cargo;
import model.ClienteModel;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author jogof
 */
public class Cliente extends Usuario {

    protected int id_cliente;
    protected int id_usuario_cliente;
    protected int id_cargo_cliente;             //Obtenemos esta información en el objeto cargo
    protected String direccion_cliente;
    protected int telefono_cliente;
    protected int id_tipoDocumento_cliente;     //Obtenemos esta información en el objeto tipoDocumento
    protected int documento_cliente;
    protected String razonSocial_cliente;
    //Objetos para GUI
    public Cargo cargo;
    public TipoDocumento tipoDocumento;

    private static final ClienteModel clienteModel = new ClienteModel();
    
    public Cliente() {
        this.cargo = new Cargo();
        this.tipoDocumento = new TipoDocumento();
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

    public Cliente(int id_cliente, int id_usuario_cliente, int id_cargo_cliente, String direccion_cliente, int telefono_cliente, int id_tipoDocumento_cliente, int documento_cliente, String razonSocial_cliente, Cargo cargo, TipoDocumento tipoDocumento, int id_usuario, String nickName_usuario, String primerNombre_usuario, String segundoNombre_usuario, String primerApellido_usuario, String segundoApellido_usuario, String email_usuario, String psw_usuario, int id_rol_usuario, LocalDate fechaCreacion, LocalDate fechaActualizacion, LocalDate fechaEliminado, String activation_token, String reset_token, LocalDate reset_token_expires_at, boolean active, String avatar_usuario, LocalDate fecha_registroUsuario, int id_tipoUsuario_usuario, boolean deleted) {
        super(id_usuario, nickName_usuario, primerNombre_usuario, segundoNombre_usuario, primerApellido_usuario, segundoApellido_usuario, email_usuario, psw_usuario, id_rol_usuario, fechaCreacion, fechaActualizacion, fechaEliminado, activation_token, reset_token, reset_token_expires_at, active, avatar_usuario, fecha_registroUsuario, id_tipoUsuario_usuario, deleted);
        this.id_cliente = id_cliente;
        this.id_usuario_cliente = id_usuario_cliente;
        this.id_cargo_cliente = id_cargo_cliente;
        this.direccion_cliente = direccion_cliente;
        this.telefono_cliente = telefono_cliente;
        this.id_tipoDocumento_cliente = id_tipoDocumento_cliente;
        this.documento_cliente = documento_cliente;
        this.razonSocial_cliente = razonSocial_cliente;
        this.cargo = cargo;
        this.tipoDocumento = tipoDocumento;
    }

    public Cliente(int id_usuario, String nickName_usuario, String primerNombre_usuario, String segundoNombre_usuario, String primerApellido_usuario, String segundoApellido_usuario, String email_usuario, String psw_usuario, int id_rol_usuario, LocalDate fechaCreacion, LocalDate fechaActualizacion, LocalDate fechaEliminado, String activation_token, String reset_token, LocalDate reset_token_expires_at, boolean active, String avatar_usuario, LocalDate fecha_registroUsuario, int id_tipoUsuario_usuario, boolean deleted) {
        super(id_usuario, nickName_usuario, primerNombre_usuario, segundoNombre_usuario, primerApellido_usuario, segundoApellido_usuario, email_usuario, psw_usuario, id_rol_usuario, fechaCreacion, fechaActualizacion, fechaEliminado, activation_token, reset_token, reset_token_expires_at, active, avatar_usuario, fecha_registroUsuario, id_tipoUsuario_usuario, deleted);
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
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    @Override
    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public LocalDate getFechaActualizacion() {
        return fechaActualizacion;
    }

    @Override
    public void setFechaActualizacion(LocalDate fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    @Override
    public LocalDate getFechaEliminado() {
        return fechaEliminado;
    }

    @Override
    public void setFechaEliminado(LocalDate fechaEliminado) {
        this.fechaEliminado = fechaEliminado;
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
    public LocalDate getReset_token_expires_at() {
        return reset_token_expires_at;
    }

    @Override
    public void setReset_token_expires_at(LocalDate reset_token_expires_at) {
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
    public LocalDate getFecha_registroUsuario() {
        return fecha_registroUsuario;
    }

    @Override
    public void setFecha_registroUsuario(LocalDate fecha_registroUsuario) {
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

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public Rol getRol() {
        return rol;
    }

    @Override
    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    @Override
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", id_usuario_cliente=" + id_usuario_cliente + ", id_cargo_cliente=" + id_cargo_cliente + ", direccion_cliente=" + direccion_cliente + ", telefono_cliente=" + telefono_cliente + ", id_tipoDocumento_cliente=" + id_tipoDocumento_cliente + ", documento_cliente=" + documento_cliente + ", razonSocial_cliente=" + razonSocial_cliente + ", cargo=" + cargo + ", tipoDocumento=" + tipoDocumento + '}';
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

    public Cliente findClienteById(int idCliente) throws SQLException {
        return clienteModel.findClienteById(idCliente);

    }

}
