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
 * SgjnPersona generated by hbm2java
 */
@Entity
@Table(name="sgjn_persona"
    ,catalog="sgjn"
)
public class SgjnPersona  implements java.io.Serializable {


     private int jnperCodigo;
     private int jnrolCodigo;
     private int jnpaisCodigo;
     private int jnprovCodigo;
     private int jnciuCodigo;
     private String jnperRuc;
     private String jnperNombres;
     private String jnperApellidos;
     private String jnperDireccion;
     private String jnperTelefono;
     private String jnperEmail;
     private String jnperSexo;
     private String jnperNombreUsuario;
     private String jnperPassword;
     private String jnperEstado;
     private String jnperUsuarioInsert;
     private Date jnperFechaInsert;
     private String jnperUsuarioUpdate;
     private Date jnperFechaUpdate;

    public SgjnPersona() {
    }

    public SgjnPersona(int jnperCodigo, int jnrolCodigo, int jnpaisCodigo, int jnprovCodigo, int jnciuCodigo, String jnperRuc, String jnperNombres, String jnperApellidos, String jnperDireccion, String jnperTelefono, String jnperEmail, String jnperSexo, String jnperNombreUsuario, String jnperPassword, String jnperEstado, String jnperUsuarioInsert, Date jnperFechaInsert, String jnperUsuarioUpdate, Date jnperFechaUpdate) {
       this.jnperCodigo = jnperCodigo;
       this.jnrolCodigo = jnrolCodigo;
       this.jnpaisCodigo = jnpaisCodigo;
       this.jnprovCodigo = jnprovCodigo;
       this.jnciuCodigo = jnciuCodigo;
       this.jnperRuc = jnperRuc;
       this.jnperNombres = jnperNombres;
       this.jnperApellidos = jnperApellidos;
       this.jnperDireccion = jnperDireccion;
       this.jnperTelefono = jnperTelefono;
       this.jnperEmail = jnperEmail;
       this.jnperSexo = jnperSexo;
       this.jnperNombreUsuario = jnperNombreUsuario;
       this.jnperPassword = jnperPassword;
       this.jnperEstado = jnperEstado;
       this.jnperUsuarioInsert = jnperUsuarioInsert;
       this.jnperFechaInsert = jnperFechaInsert;
       this.jnperUsuarioUpdate = jnperUsuarioUpdate;
       this.jnperFechaUpdate = jnperFechaUpdate;
    }
   
     @Id 

    
    @Column(name="jnper_codigo", unique=true, nullable=false)
    public int getJnperCodigo() {
        return this.jnperCodigo;
    }
    
    public void setJnperCodigo(int jnperCodigo) {
        this.jnperCodigo = jnperCodigo;
    }

    
    @Column(name="jnrol_codigo", nullable=false)
    public int getJnrolCodigo() {
        return this.jnrolCodigo;
    }
    
    public void setJnrolCodigo(int jnrolCodigo) {
        this.jnrolCodigo = jnrolCodigo;
    }

    
    @Column(name="jnpais_codigo", nullable=false)
    public int getJnpaisCodigo() {
        return this.jnpaisCodigo;
    }
    
    public void setJnpaisCodigo(int jnpaisCodigo) {
        this.jnpaisCodigo = jnpaisCodigo;
    }

    
    @Column(name="jnprov_codigo", nullable=false)
    public int getJnprovCodigo() {
        return this.jnprovCodigo;
    }
    
    public void setJnprovCodigo(int jnprovCodigo) {
        this.jnprovCodigo = jnprovCodigo;
    }

    
    @Column(name="jnciu_codigo", nullable=false)
    public int getJnciuCodigo() {
        return this.jnciuCodigo;
    }
    
    public void setJnciuCodigo(int jnciuCodigo) {
        this.jnciuCodigo = jnciuCodigo;
    }

    
    @Column(name="jnper_ruc", nullable=false, length=10)
    public String getJnperRuc() {
        return this.jnperRuc;
    }
    
    public void setJnperRuc(String jnperRuc) {
        this.jnperRuc = jnperRuc;
    }

    
    @Column(name="jnper_nombres", nullable=false, length=25)
    public String getJnperNombres() {
        return this.jnperNombres;
    }
    
    public void setJnperNombres(String jnperNombres) {
        this.jnperNombres = jnperNombres;
    }

    
    @Column(name="jnper_apellidos", nullable=false, length=25)
    public String getJnperApellidos() {
        return this.jnperApellidos;
    }
    
    public void setJnperApellidos(String jnperApellidos) {
        this.jnperApellidos = jnperApellidos;
    }

    
    @Column(name="jnper_direccion", nullable=false, length=25)
    public String getJnperDireccion() {
        return this.jnperDireccion;
    }
    
    public void setJnperDireccion(String jnperDireccion) {
        this.jnperDireccion = jnperDireccion;
    }

    
    @Column(name="jnper_telefono", nullable=false, length=10)
    public String getJnperTelefono() {
        return this.jnperTelefono;
    }
    
    public void setJnperTelefono(String jnperTelefono) {
        this.jnperTelefono = jnperTelefono;
    }

    
    @Column(name="jnper_email", nullable=false, length=25)
    public String getJnperEmail() {
        return this.jnperEmail;
    }
    
    public void setJnperEmail(String jnperEmail) {
        this.jnperEmail = jnperEmail;
    }

    
    @Column(name="jnper_sexo", nullable=false, length=1)
    public String getJnperSexo() {
        return this.jnperSexo;
    }
    
    public void setJnperSexo(String jnperSexo) {
        this.jnperSexo = jnperSexo;
    }

    
    @Column(name="jnper_nombre_usuario", nullable=false, length=25)
    public String getJnperNombreUsuario() {
        return this.jnperNombreUsuario;
    }
    
    public void setJnperNombreUsuario(String jnperNombreUsuario) {
        this.jnperNombreUsuario = jnperNombreUsuario;
    }

    
    @Column(name="jnper_password", nullable=false, length=25)
    public String getJnperPassword() {
        return this.jnperPassword;
    }
    
    public void setJnperPassword(String jnperPassword) {
        this.jnperPassword = jnperPassword;
    }

    
    @Column(name="jnper_estado", nullable=false, length=1)
    public String getJnperEstado() {
        return this.jnperEstado;
    }
    
    public void setJnperEstado(String jnperEstado) {
        this.jnperEstado = jnperEstado;
    }

    
    @Column(name="jnper_usuario_insert", nullable=false, length=25)
    public String getJnperUsuarioInsert() {
        return this.jnperUsuarioInsert;
    }
    
    public void setJnperUsuarioInsert(String jnperUsuarioInsert) {
        this.jnperUsuarioInsert = jnperUsuarioInsert;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="jnper_fecha_insert", nullable=false, length=19)
    public Date getJnperFechaInsert() {
        return this.jnperFechaInsert;
    }
    
    public void setJnperFechaInsert(Date jnperFechaInsert) {
        this.jnperFechaInsert = jnperFechaInsert;
    }

    
    @Column(name="jnper_usuario_update", nullable=false, length=25)
    public String getJnperUsuarioUpdate() {
        return this.jnperUsuarioUpdate;
    }
    
    public void setJnperUsuarioUpdate(String jnperUsuarioUpdate) {
        this.jnperUsuarioUpdate = jnperUsuarioUpdate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="jnper_fecha_update", nullable=false, length=19)
    public Date getJnperFechaUpdate() {
        return this.jnperFechaUpdate;
    }
    
    public void setJnperFechaUpdate(Date jnperFechaUpdate) {
        this.jnperFechaUpdate = jnperFechaUpdate;
    }




}


