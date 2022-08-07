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
 * SgjnProforma generated by hbm2java
 */
@Entity
@Table(name="sgjn_proforma"
    ,catalog="sgjn"
)
public class SgjnProforma  implements java.io.Serializable {


     private int jnprofCodigo;
     private int jnperCodigo;
     private int jnempCodigo;
     private String jnprofNumero;
     private Date jnprofFechaEmision;
     private Date jnprofFechaVencimiento;
     private double jnprofSubtotal;
     private double jnprofPorcentIva;
     private double jnprofDescuento;
     private double jnprofTotal;
     private String jnprofObservacion;
     private String jnprofUsuarioInsert;
     private Date jnprofFechaInsert;
     private String jnprofUsuarioUpdate;
     private Date jnprofFechaUpdate;

    public SgjnProforma() {
    }

    public SgjnProforma(int jnprofCodigo, int jnperCodigo, int jnempCodigo, String jnprofNumero, Date jnprofFechaEmision, Date jnprofFechaVencimiento, double jnprofSubtotal, double jnprofPorcentIva, double jnprofDescuento, double jnprofTotal, String jnprofObservacion, String jnprofUsuarioInsert, Date jnprofFechaInsert, String jnprofUsuarioUpdate, Date jnprofFechaUpdate) {
       this.jnprofCodigo = jnprofCodigo;
       this.jnperCodigo = jnperCodigo;
       this.jnempCodigo = jnempCodigo;
       this.jnprofNumero = jnprofNumero;
       this.jnprofFechaEmision = jnprofFechaEmision;
       this.jnprofFechaVencimiento = jnprofFechaVencimiento;
       this.jnprofSubtotal = jnprofSubtotal;
       this.jnprofPorcentIva = jnprofPorcentIva;
       this.jnprofDescuento = jnprofDescuento;
       this.jnprofTotal = jnprofTotal;
       this.jnprofObservacion = jnprofObservacion;
       this.jnprofUsuarioInsert = jnprofUsuarioInsert;
       this.jnprofFechaInsert = jnprofFechaInsert;
       this.jnprofUsuarioUpdate = jnprofUsuarioUpdate;
       this.jnprofFechaUpdate = jnprofFechaUpdate;
    }
   
     @Id 

    
    @Column(name="jnprof_codigo", unique=true, nullable=false)
    public int getJnprofCodigo() {
        return this.jnprofCodigo;
    }
    
    public void setJnprofCodigo(int jnprofCodigo) {
        this.jnprofCodigo = jnprofCodigo;
    }

    
    @Column(name="jnper_codigo", nullable=false)
    public int getJnperCodigo() {
        return this.jnperCodigo;
    }
    
    public void setJnperCodigo(int jnperCodigo) {
        this.jnperCodigo = jnperCodigo;
    }

    
    @Column(name="jnemp_codigo", nullable=false)
    public int getJnempCodigo() {
        return this.jnempCodigo;
    }
    
    public void setJnempCodigo(int jnempCodigo) {
        this.jnempCodigo = jnempCodigo;
    }

    
    @Column(name="jnprof_numero", nullable=false, length=20)
    public String getJnprofNumero() {
        return this.jnprofNumero;
    }
    
    public void setJnprofNumero(String jnprofNumero) {
        this.jnprofNumero = jnprofNumero;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="jnprof_fecha_emision", nullable=false, length=10)
    public Date getJnprofFechaEmision() {
        return this.jnprofFechaEmision;
    }
    
    public void setJnprofFechaEmision(Date jnprofFechaEmision) {
        this.jnprofFechaEmision = jnprofFechaEmision;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="jnprof_fecha_vencimiento", nullable=false, length=10)
    public Date getJnprofFechaVencimiento() {
        return this.jnprofFechaVencimiento;
    }
    
    public void setJnprofFechaVencimiento(Date jnprofFechaVencimiento) {
        this.jnprofFechaVencimiento = jnprofFechaVencimiento;
    }

    
    @Column(name="jnprof_subtotal", nullable=false, precision=10)
    public double getJnprofSubtotal() {
        return this.jnprofSubtotal;
    }
    
    public void setJnprofSubtotal(double jnprofSubtotal) {
        this.jnprofSubtotal = jnprofSubtotal;
    }

    
    @Column(name="jnprof_porcent_iva", nullable=false, precision=5)
    public double getJnprofPorcentIva() {
        return this.jnprofPorcentIva;
    }
    
    public void setJnprofPorcentIva(double jnprofPorcentIva) {
        this.jnprofPorcentIva = jnprofPorcentIva;
    }

    
    @Column(name="jnprof_descuento", nullable=false, precision=5)
    public double getJnprofDescuento() {
        return this.jnprofDescuento;
    }
    
    public void setJnprofDescuento(double jnprofDescuento) {
        this.jnprofDescuento = jnprofDescuento;
    }

    
    @Column(name="jnprof_total", nullable=false, precision=10, scale=3)
    public double getJnprofTotal() {
        return this.jnprofTotal;
    }
    
    public void setJnprofTotal(double jnprofTotal) {
        this.jnprofTotal = jnprofTotal;
    }

    
    @Column(name="jnprof_observacion", nullable=false, length=30)
    public String getJnprofObservacion() {
        return this.jnprofObservacion;
    }
    
    public void setJnprofObservacion(String jnprofObservacion) {
        this.jnprofObservacion = jnprofObservacion;
    }

    
    @Column(name="jnprof_usuario_insert", nullable=false, length=50)
    public String getJnprofUsuarioInsert() {
        return this.jnprofUsuarioInsert;
    }
    
    public void setJnprofUsuarioInsert(String jnprofUsuarioInsert) {
        this.jnprofUsuarioInsert = jnprofUsuarioInsert;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="jnprof_fecha_insert", nullable=false, length=19)
    public Date getJnprofFechaInsert() {
        return this.jnprofFechaInsert;
    }
    
    public void setJnprofFechaInsert(Date jnprofFechaInsert) {
        this.jnprofFechaInsert = jnprofFechaInsert;
    }

    
    @Column(name="jnprof_usuario_update", nullable=false, length=50)
    public String getJnprofUsuarioUpdate() {
        return this.jnprofUsuarioUpdate;
    }
    
    public void setJnprofUsuarioUpdate(String jnprofUsuarioUpdate) {
        this.jnprofUsuarioUpdate = jnprofUsuarioUpdate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="jnprof_fecha_update", nullable=false, length=19)
    public Date getJnprofFechaUpdate() {
        return this.jnprofFechaUpdate;
    }
    
    public void setJnprofFechaUpdate(Date jnprofFechaUpdate) {
        this.jnprofFechaUpdate = jnprofFechaUpdate;
    }




}


