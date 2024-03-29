package datos;
// Generated 06/08/2022 20:55:38 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SgjnPais generated by hbm2java
 */
@Entity
@Table(name="sgjn_pais"
    ,catalog="sgjn"
)
public class SgjnPais  implements java.io.Serializable {


     private int jnpaisCodigo;
     private String jnpaisNombre;
     private String jnpaisUce;
     private String jnpaisExtension;
     private String jnpaisEstado;

    public SgjnPais() {
    }

    public SgjnPais(int jnpaisCodigo, String jnpaisNombre, String jnpaisUce, String jnpaisExtension, String jnpaisEstado) {
       this.jnpaisCodigo = jnpaisCodigo;
       this.jnpaisNombre = jnpaisNombre;
       this.jnpaisUce = jnpaisUce;
       this.jnpaisExtension = jnpaisExtension;
       this.jnpaisEstado = jnpaisEstado;
    }
   
     @Id 

    
    @Column(name="jnpais_codigo", unique=true, nullable=false)
    public int getJnpaisCodigo() {
        return this.jnpaisCodigo;
    }
    
    public void setJnpaisCodigo(int jnpaisCodigo) {
        this.jnpaisCodigo = jnpaisCodigo;
    }

    
    @Column(name="jnpais_nombre", nullable=false, length=25)
    public String getJnpaisNombre() {
        return this.jnpaisNombre;
    }
    
    public void setJnpaisNombre(String jnpaisNombre) {
        this.jnpaisNombre = jnpaisNombre;
    }

    
    @Column(name="jnpais_uce", nullable=false, length=25)
    public String getJnpaisUce() {
        return this.jnpaisUce;
    }
    
    public void setJnpaisUce(String jnpaisUce) {
        this.jnpaisUce = jnpaisUce;
    }

    
    @Column(name="jnpais_extension", nullable=false, length=25)
    public String getJnpaisExtension() {
        return this.jnpaisExtension;
    }
    
    public void setJnpaisExtension(String jnpaisExtension) {
        this.jnpaisExtension = jnpaisExtension;
    }

    
    @Column(name="jnpais_estado", nullable=false, length=1)
    public String getJnpaisEstado() {
        return this.jnpaisEstado;
    }
    
    public void setJnpaisEstado(String jnpaisEstado) {
        this.jnpaisEstado = jnpaisEstado;
    }




}


