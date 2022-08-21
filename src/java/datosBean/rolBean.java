/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosBean;

import datos.SgjnRol;
import datosDAO.RolDAO;
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

@ManagedBean(name = "rolBean")
@SessionScoped
public class rolBean implements Serializable {
    private List<SgjnRol> listRol;
    private SgjnRol rol;
    
    private int indice;
    private String nombre;
    private String estado;
    private int maxcodigo;

    
    //Metodo constructor
    public rolBean() {
        initDatos();
        
    }
    
    //Metodo que inicializa los datos
    public void initDatos(){
        listRol =  new ArrayList<>();
        rol = new SgjnRol();
        indice = 0;
        nombre = "";
        estado = "";
        
    }

    //Metodo lista roles
    public List<SgjnRol> listarRol(){
        return listRol = RolDAO.ListarRol();
    }
    
    //Metodo agrega nuevo rol
    public void nuevoRol(){
        maxcodigo = RolDAO.maxcodigorol().getJnrolCodigo()+1;
        rol.setJnrolCodigo(maxcodigo);
        rol.setJnrolNombre(nombre);
        rol.setJnrolEstado(estado);
        rol.setJnrolUsuarioInsert("opizarro");
        rol.setJnrolFechaInsert(new Date());
        rol.setJnrolUsuarioUpdate("opizarro");
        rol.setJnrolFechaUpdate(new Date());
        RolDAO.NuevoRol(rol);
    }
    
    //Metodo cargar datos para editar
    public void cargarRol(SgjnRol p) {
     indice = listRol.indexOf(p);
     rol = listRol.get(indice);
    }
    
    //Metodo actualiza un rol
    public void actulziarRol(){
        RolDAO.updateRol(rol);
    }
    
    //Metodo para eliminar un Rol
    public void eliminarUusuario(SgjnRol rol){
        RolDAO.eliminarRol(rol);
    }
    
    
    
    //Metodos Get y Set
    public List<SgjnRol> getListRol() {
        return listRol;
    }

    public void setListRol(List<SgjnRol> listRol) {
        this.listRol = listRol;
    }

    public SgjnRol getRol() {
        return rol;
    }

    public void setRol(SgjnRol rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
