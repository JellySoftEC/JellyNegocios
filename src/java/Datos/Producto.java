package datos;
// Generated 16/07/2022 1:16:45 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Producto generated by hbm2java
 */
@Entity
@Table(name="producto"
    ,catalog="sgjn"
)
public class Producto  implements java.io.Serializable {


     private int idproducto;
     private String nombre;
     private String PUnitario;

    public Producto() {
    }

    public Producto(int idproducto, String nombre, String PUnitario) {
       this.idproducto = idproducto;
       this.nombre = nombre;
       this.PUnitario = PUnitario;
    }
   
     @Id 

    
    @Column(name="idproducto", unique=true, nullable=false)
    public int getIdproducto() {
        return this.idproducto;
    }
    
    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    
    @Column(name="nombre", nullable=false, length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="p_unitario", nullable=false, length=45)
    public String getPUnitario() {
        return this.PUnitario;
    }
    
    public void setPUnitario(String PUnitario) {
        this.PUnitario = PUnitario;
    }




}


