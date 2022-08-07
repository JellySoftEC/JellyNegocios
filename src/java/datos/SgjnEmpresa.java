package datos;
// Generated 06/08/2022 20:55:38 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SgjnEmpresa generated by hbm2java
 */
@Entity
@Table(name="sgjn_empresa"
    ,catalog="sgjn"
)
public class SgjnEmpresa  implements java.io.Serializable {


     private int jnempCodigo;
     private String jnempRuc;
     private String jnempNombres;
     private String jnempDireccion;
     private String jnempEmail;
     private String jnempTelefono;
     private byte[] jnempLogo;
     private String jnempUsuarioInsert;
     private Date jnempFechaInsert;
     private String jnempUsuarioUpdate;
     private Date jnempFechaUpdate;

    public SgjnEmpresa() {
    }

    public SgjnEmpresa(int jnempCodigo, String jnempRuc, String jnempNombres, String jnempDireccion, String jnempEmail, String jnempTelefono, byte[] jnempLogo, String jnempUsuarioInsert, Date jnempFechaInsert, String jnempUsuarioUpdate, Date jnempFechaUpdate) {
       this.jnempCodigo = jnempCodigo;
       this.jnempRuc = jnempRuc;
       this.jnempNombres = jnempNombres;
       this.jnempDireccion = jnempDireccion;
       this.jnempEmail = jnempEmail;
       this.jnempTelefono = jnempTelefono;
       this.jnempLogo = jnempLogo;
       this.jnempUsuarioInsert = jnempUsuarioInsert;
       this.jnempFechaInsert = jnempFechaInsert;
       this.jnempUsuarioUpdate = jnempUsuarioUpdate;
       this.jnempFechaUpdate = jnempFechaUpdate;
    }
   
     @Id 

    
    @Column(name="jnemp_codigo", unique=true, nullable=false)
    public int getJnempCodigo() {
        return this.jnempCodigo;
    }
    
    public void setJnempCodigo(int jnempCodigo) {
        this.jnempCodigo = jnempCodigo;
    }

    
    @Column(name="jnemp_ruc", nullable=false, length=10)
    public String getJnempRuc() {
        return this.jnempRuc;
    }
    
    public void setJnempRuc(String jnempRuc) {
        this.jnempRuc = jnempRuc;
    }

    
    @Column(name="jnemp_nombres", nullable=false, length=25)
    public String getJnempNombres() {
        return this.jnempNombres;
    }
    
    public void setJnempNombres(String jnempNombres) {
        this.jnempNombres = jnempNombres;
    }

    
    @Column(name="jnemp_direccion", nullable=false, length=25)
    public String getJnempDireccion() {
        return this.jnempDireccion;
    }
    
    public void setJnempDireccion(String jnempDireccion) {
        this.jnempDireccion = jnempDireccion;
    }

    
    @Column(name="jnemp_email", nullable=false, length=25)
    public String getJnempEmail() {
        return this.jnempEmail;
    }
    
    public void setJnempEmail(String jnempEmail) {
        this.jnempEmail = jnempEmail;
    }

    
    @Column(name="jnemp_telefono", nullable=false, length=10)
    public String getJnempTelefono() {
        return this.jnempTelefono;
    }
    
    public void setJnempTelefono(String jnempTelefono) {
        this.jnempTelefono = jnempTelefono;
    }

    
    @Column(name="jnemp_logo", nullable=false)
    public byte[] getJnempLogo() {
        return this.jnempLogo;
    }
    
    public void setJnempLogo(byte[] jnempLogo) {
        this.jnempLogo = jnempLogo;
    }

    
    @Column(name="jnemp_usuario_insert", nullable=false, length=25)
    public String getJnempUsuarioInsert() {
        return this.jnempUsuarioInsert;
    }
    
    public void setJnempUsuarioInsert(String jnempUsuarioInsert) {
        this.jnempUsuarioInsert = jnempUsuarioInsert;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="jnemp_fecha_insert", nullable=false, length=19)
    public Date getJnempFechaInsert() {
        return this.jnempFechaInsert;
    }
    
    public void setJnempFechaInsert(Date jnempFechaInsert) {
        this.jnempFechaInsert = jnempFechaInsert;
    }

    
    @Column(name="jnemp_usuario_update", nullable=false, length=25)
    public String getJnempUsuarioUpdate() {
        return this.jnempUsuarioUpdate;
    }
    
    public void setJnempUsuarioUpdate(String jnempUsuarioUpdate) {
        this.jnempUsuarioUpdate = jnempUsuarioUpdate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="jnemp_fecha_update", nullable=false, length=19)
    public Date getJnempFechaUpdate() {
        return this.jnempFechaUpdate;
    }
    
    public void setJnempFechaUpdate(Date jnempFechaUpdate) {
        this.jnempFechaUpdate = jnempFechaUpdate;
    }




}


