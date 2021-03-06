package datos;
// Generated 16/07/2022 1:16:45 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Inventario generated by hbm2java
 */
@Entity
@Table(name="inventario"
    ,catalog="sgjn"
)
public class Inventario  implements java.io.Serializable {


     private int idinventario;
     private int idCategoria;
     private int idProducto;
     private int idProveedor;
     private int cantidad;

    public Inventario() {
    }

    public Inventario(int idinventario, int idCategoria, int idProducto, int idProveedor, int cantidad) {
       this.idinventario = idinventario;
       this.idCategoria = idCategoria;
       this.idProducto = idProducto;
       this.idProveedor = idProveedor;
       this.cantidad = cantidad;
    }
   
     @Id 

    
    @Column(name="idinventario", unique=true, nullable=false)
    public int getIdinventario() {
        return this.idinventario;
    }
    
    public void setIdinventario(int idinventario) {
        this.idinventario = idinventario;
    }

    
    @Column(name="id_categoria", nullable=false)
    public int getIdCategoria() {
        return this.idCategoria;
    }
    
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    
    @Column(name="id_producto", nullable=false)
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    
    @Column(name="id_proveedor", nullable=false)
    public int getIdProveedor() {
        return this.idProveedor;
    }
    
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    
    @Column(name="cantidad", nullable=false)
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }




}


