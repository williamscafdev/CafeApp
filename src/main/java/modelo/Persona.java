/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author MustainE
 */
public class Persona {
    int idpersona;
    int idempresa;
    int idsucursal;
    String tipopersona;
    String idcp;
    String idorga;    
    String idcafepractice;
    String codagricultor;
    String razonsocial;
    String nombres;
    String apellidos;
    String dniruc;
    String email;
    String direccion;
    String distrito;
    String ciudad;
    String provincia;
    String pais;
    String celular;
    String nomfinca;
    String nomanexo;
    int ejercicio;
    String usuario;
    String password;
    String personatipo;
    String estado;

    public Persona() {
    }

    public Persona(int idpersona, int idempresa, int idsucursal, String idorga, String idcp, String idcafepractice, String codagricultor, String razonsocial, String nombres, String apellidos, String dniruc, String email, String direccion, String distrito, String ciudad, String provincia, String pais, String nomfinca, String nomanexo, String celular, String estado) {
        this.idpersona = idpersona;
        this.idempresa = idempresa;
        this.idsucursal = idsucursal;
        this.idorga = idorga;
        this.idcp = idcp;
        this.idcafepractice = idcafepractice;
        this.codagricultor = codagricultor;
        this.razonsocial = razonsocial;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dniruc = dniruc;
        this.email = email;
        this.direccion = direccion;
        this.distrito = distrito;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.nomfinca = nomfinca;
        this.nomanexo = nomanexo;
        this.celular = celular;
        this.estado = estado;
    }

    public Persona(int idpersona, int idempresa, String tipopersona, String idcp, String idorga, String idcafepractice, String codagricultor, String razonsocial, String nombres, String apellidos, String dniruc, String direccion, String distrito, String nomfinca, String nomanexo, String celular, String estado) {
        this.idpersona = idpersona;
        this.idempresa = idempresa;
        this.tipopersona = tipopersona;
        this.idcp = idcp;
        this.idorga = idorga;
        this.idcafepractice = idcafepractice;
        this.codagricultor = codagricultor;
        this.razonsocial = razonsocial;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dniruc = dniruc;
        this.direccion = direccion;
        this.distrito = distrito;
        this.nomfinca = nomfinca;
        this.nomanexo = nomanexo;
        this.celular = celular;
        this.estado = estado;
    }

    public Persona(int idpersona, String tipopersona, String idcp, String idorga, String idcafepractice, String codagricultor, String razonsocial, String nombres, String apellidos, String dniruc, String email, String direccion, String distrito, String ciudad, String provincia, String pais, String celular, String nomfinca, String nomanexo, String usuario, String password, String personatipo, String estado) {
        this.idpersona = idpersona;
        this.tipopersona = tipopersona;
        this.idcp = idcp;
        this.idorga = idorga;
        this.idcafepractice = idcafepractice;
        this.codagricultor = codagricultor;
        this.razonsocial = razonsocial;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dniruc = dniruc;
        this.email = email;
        this.direccion = direccion;
        this.distrito = distrito;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.celular = celular;
        this.nomfinca = nomfinca;
        this.nomanexo = nomanexo;
        this.usuario = usuario;
        this.password = password;
        this.personatipo = personatipo;
        this.estado = estado;
    }

    public int getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(int ejercicio) {
        this.ejercicio = ejercicio;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonatipo() {
        return personatipo;
    }

    public void setPersonatipo(String personatipo) {
        this.personatipo = personatipo;
    }
    

    public String getTipopersona() {
        return tipopersona;
    }

    public void setTipopersona(String tipopersona) {
        this.tipopersona = tipopersona;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public int getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(int idsucursal) {
        this.idsucursal = idsucursal;
    }

    public String getIdorga() {
        return idorga;
    }

    public void setIdorga(String idorga) {
        this.idorga = idorga;
    }

    public String getIdcp() {
        return idcp;
    }

    public void setIdcp(String idcp) {
        this.idcp = idcp;
    }

    public String getIdcafepractice() {
        return idcafepractice;
    }

    public void setIdcafepractice(String idcafepractice) {
        this.idcafepractice = idcafepractice;
    }

    public String getCodagricultor() {
        return codagricultor;
    }

    public void setCodagricultor(String codagricultor) {
        this.codagricultor = codagricultor;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDniruc() {
        return dniruc;
    }

    public void setDniruc(String dniruc) {
        this.dniruc = dniruc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNomfinca() {
        return nomfinca;
    }

    public void setNomfinca(String nomfinca) {
        this.nomfinca = nomfinca;
    }

    public String getNomanexo() {
        return nomanexo;
    }

    public void setNomanexo(String nomanexo) {
        this.nomanexo = nomanexo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
