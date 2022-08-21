/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosBean;

import java.util.List;
import java.io.Serializable;
import datos.SgjnEmpresa;
import datosDAO.EmpresaDAO;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author oscar
 */

@ManagedBean(name = "empresasBean")
@SessionScoped
public class EmpresaBean implements Serializable{
    private List<SgjnEmpresa> listempresa;
    private SgjnEmpresa empresa;
    private int codigo;
    private String ruc;
    private String nombre;
    private String direccion;
    private String email;
    private String telefono;
    
    
    //METODO QUE INICIALIZA LOS DATOS

    public EmpresaBean() {
        listempresa = new ArrayList<>();
        empresa = new SgjnEmpresa();
        
        codigo = 0;
        ruc = "";
        nombre = "";
        direccion = "";
        email = "";
        telefono = "";
    }
    
    //Listar datos de la empresa
    public void obtenerempresa(){
        empresa =  EmpresaDAO.Empresa();
    }

    
    public void updateEmpresa(){
        empresa.setJnempCodigo(1);
        empresa.setJnempNombres("StartShopping");
        EmpresaDAO.updateEmpresa(empresa);
        
    }
    
    
    
    //METODOS GET Y SET

    public List<SgjnEmpresa> getListempresa() {
        return listempresa;
    }

    public void setListempresa(List<SgjnEmpresa> listempresa) {
        this.listempresa = listempresa;
    }

    public SgjnEmpresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(SgjnEmpresa empresa) {
        this.empresa = empresa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
