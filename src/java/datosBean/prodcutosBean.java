/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosBean;

import datos.Producto;
import datosDAO.productoDAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author oscar
 */

@ManagedBean(name = "prodcutosBean")
@SessionScoped
public class prodcutosBean implements Serializable{
    private List<Producto> listaproducto;
    private Producto producto;

    public prodcutosBean() {
        listaproducto = new ArrayList<>();
        producto = new Producto(0, "", "");
    }

    public prodcutosBean(List<Producto> listaproducto, Producto producto) {
        this.listaproducto = listaproducto;
        this.producto = producto;
    }

    // METODOS QUE LLAMAN AL DAO 
    
    //Metodo para listarProductos
    public void obtenerproducto() {

        listaproducto = productoDAO.listaproducto();

    }
    
    // METODOS GET AND SET
    
    public List<Producto> getListaproducto() {
        return listaproducto;
    }

    public void setListaproducto(List<Producto> listaproducto) {
        this.listaproducto = listaproducto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
