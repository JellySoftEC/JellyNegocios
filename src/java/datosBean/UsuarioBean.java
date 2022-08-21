/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosBean;

import datos.SgjnPersona;
import datosDAO.UsuarioDAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author oscar
 */
@ManagedBean(name = "usuariosBean")
@SessionScoped
public class UsuarioBean implements Serializable {
    private List<SgjnPersona> listpersona;
    private SgjnPersona usuario;
    private String ruc;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String email;
    private String sexo;
    private String estado;
    
    private int indice;
    private int maxcodigo;
    
    
    //Metodo construnctor nicializa las variables
    public UsuarioBean() {
        initDatos();
    }
    
    
    //Inicializar Datos
    public  void initDatos(){
        listpersona =  new ArrayList<>();
        usuario =  new SgjnPersona();
        
        
        indice = 0;
        ruc = "";
        nombres = "";
        apellidos = "";
        direccion= "";
        telefono = "";
        email = "";
        sexo = "";
        estado = "";
    }
    
    //Matodo ingresa un nuevo usuario
    public void nuevoUsuario(){
        String[] ape= apellidos.split(" ");
        String usu = nombres.charAt(0)+  ape[0].toLowerCase();
        maxcodigo = UsuarioDAO.maxcodigoUsuario().getJnperCodigo()+1;

        //System.out.println("Codigo Actual es++++++++++++++ : " + maxcodigo);
        
        usuario.setJnperCodigo(maxcodigo);
        usuario.setJnrolCodigo(1);
        usuario.setJnpaisCodigo(1);
        usuario.setJnprovCodigo(1);
        usuario.setJnciuCodigo(1);
        usuario.setJnperRuc(ruc);
        usuario.setJnperNombres(nombres);
        usuario.setJnperApellidos(apellidos);
        usuario.setJnperDireccion(direccion);
        usuario.setJnperTelefono(telefono);
        usuario.setJnperEmail(email);
        usuario.setJnperSexo(sexo);
        usuario.setJnperNombreUsuario(usu.toLowerCase());
        usuario.setJnperPassword("123");
        usuario.setJnperEstado(estado);
        usuario.setJnperFechaInsert(new Date());
        usuario.setJnperUsuarioInsert(usu.toLowerCase());
        usuario.setJnperFechaUpdate(new Date());
        usuario.setJnperUsuarioUpdate(usu.toLowerCase());
        UsuarioDAO.NuevoUsuario(usuario);
        
    }
    
    //Metodo cargar datos para editar
       public void cargarPersona(SgjnPersona p) {
        indice = listpersona.indexOf(p);
        usuario = listpersona.get(indice);

    }
    
    //Listar datos de la persona
    public void obtenerpersona(int codigoper){
        usuario =  UsuarioDAO.personasCodigo(codigoper);
    }
    
    //Metodo actualiza un usuario
    public void actulziarUsuario(){
        UsuarioDAO.updateUsuario(usuario);
    }
    
    //Metodo para eliminar una persona
    public void eliminarUusuario(SgjnPersona persona){
        UsuarioDAO.eliminarUsuario(persona);
    }
    
    
    //Metodo lista a los usuarios
    public List<SgjnPersona> listarusuario(){
        return listpersona = UsuarioDAO.ListarUsuario();
    }
    
    
    
    //Metodos Get Y Set

    public List<SgjnPersona> getListpersona() {
        return listpersona;
    }

    public void setListpersona(List<SgjnPersona> listpersona) {
        this.listpersona = listpersona;
    }

    public SgjnPersona getUsuario() {
        return usuario;
    }

    public void setUsuario(SgjnPersona usuario) {
        this.usuario = usuario;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getMaxcodigo() {
        return maxcodigo;
    }

    public void setMaxcodigo(int maxcodigo) {
        this.maxcodigo = maxcodigo;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }


}
