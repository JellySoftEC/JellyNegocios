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
    
    //METODO QUE INICIALIZA LOS DATOS

    public EmpresaBean() {
        listempresa = new ArrayList<>();
        empresa = new SgjnEmpresa();
    }
    
    //Listar datos de la empresa
    public void obtenerempresa(){
        listempresa = EmpresaDAO.datosEmpresa();
        empresa.setJnempNombres(listempresa.get(0).getJnempNombres());
    }
    
    //Modifica los datos de la empresa
    public void updateempresa(){
        
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
    
    
    
}
