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
 * SgjnCompraDetalle generated by hbm2java
 */
@Entity
@Table(name="sgjn_compra_detalle"
    ,catalog="sgjn"
)
public class SgjnCompraDetalle  implements java.io.Serializable {


     private int jncdetCodigo;
     private int jncomCodigo;
     private int jnprodCodigo;
     private double jncdetValorUnitario;
     private double jncdetValorDescuento;
     private double jncdetTotalUnitario;
     private String jncdetUsuarioInsert;
     private Date jncdetFechaInsert;
     private String jncdetUsuarioUpdate;
     private Date jncdetFechaUpdate;

    public SgjnCompraDetalle() {
    }

    public SgjnCompraDetalle(int jncdetCodigo, int jncomCodigo, int jnprodCodigo, double jncdetValorUnitario, double jncdetValorDescuento, double jncdetTotalUnitario, String jncdetUsuarioInsert, Date jncdetFechaInsert, String jncdetUsuarioUpdate, Date jncdetFechaUpdate) {
       this.jncdetCodigo = jncdetCodigo;
       this.jncomCodigo = jncomCodigo;
       this.jnprodCodigo = jnprodCodigo;
       this.jncdetValorUnitario = jncdetValorUnitario;
       this.jncdetValorDescuento = jncdetValorDescuento;
       this.jncdetTotalUnitario = jncdetTotalUnitario;
       this.jncdetUsuarioInsert = jncdetUsuarioInsert;
       this.jncdetFechaInsert = jncdetFechaInsert;
       this.jncdetUsuarioUpdate = jncdetUsuarioUpdate;
       this.jncdetFechaUpdate = jncdetFechaUpdate;
    }
   
     @Id 

    
    @Column(name="jncdet_codigo", unique=true, nullable=false)
    public int getJncdetCodigo() {
        return this.jncdetCodigo;
    }
    
    public void setJncdetCodigo(int jncdetCodigo) {
        this.jncdetCodigo = jncdetCodigo;
    }

    
    @Column(name="jncom_codigo", nullable=false)
    public int getJncomCodigo() {
        return this.jncomCodigo;
    }
    
    public void setJncomCodigo(int jncomCodigo) {
        this.jncomCodigo = jncomCodigo;
    }

    
    @Column(name="jnprod_codigo", nullable=false)
    public int getJnprodCodigo() {
        return this.jnprodCodigo;
    }
    
    public void setJnprodCodigo(int jnprodCodigo) {
        this.jnprodCodigo = jnprodCodigo;
    }

    
    @Column(name="jncdet_valor_unitario", nullable=false, precision=10, scale=3)
    public double getJncdetValorUnitario() {
        return this.jncdetValorUnitario;
    }
    
    public void setJncdetValorUnitario(double jncdetValorUnitario) {
        this.jncdetValorUnitario = jncdetValorUnitario;
    }

    
    @Column(name="jncdet_valor_descuento", nullable=false, precision=10, scale=3)
    public double getJncdetValorDescuento() {
        return this.jncdetValorDescuento;
    }
    
    public void setJncdetValorDescuento(double jncdetValorDescuento) {
        this.jncdetValorDescuento = jncdetValorDescuento;
    }

    
    @Column(name="jncdet_total_unitario", nullable=false, precision=10, scale=3)
    public double getJncdetTotalUnitario() {
        return this.jncdetTotalUnitario;
    }
    
    public void setJncdetTotalUnitario(double jncdetTotalUnitario) {
        this.jncdetTotalUnitario = jncdetTotalUnitario;
    }

    
    @Column(name="jncdet_usuario_insert", nullable=false, length=50)
    public String getJncdetUsuarioInsert() {
        return this.jncdetUsuarioInsert;
    }
    
    public void setJncdetUsuarioInsert(String jncdetUsuarioInsert) {
        this.jncdetUsuarioInsert = jncdetUsuarioInsert;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="jncdet_fecha_insert", nullable=false, length=19)
    public Date getJncdetFechaInsert() {
        return this.jncdetFechaInsert;
    }
    
    public void setJncdetFechaInsert(Date jncdetFechaInsert) {
        this.jncdetFechaInsert = jncdetFechaInsert;
    }

    
    @Column(name="jncdet_usuario_update", nullable=false, length=50)
    public String getJncdetUsuarioUpdate() {
        return this.jncdetUsuarioUpdate;
    }
    
    public void setJncdetUsuarioUpdate(String jncdetUsuarioUpdate) {
        this.jncdetUsuarioUpdate = jncdetUsuarioUpdate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="jncdet_fecha_update", nullable=false, length=19)
    public Date getJncdetFechaUpdate() {
        return this.jncdetFechaUpdate;
    }
    
    public void setJncdetFechaUpdate(Date jncdetFechaUpdate) {
        this.jncdetFechaUpdate = jncdetFechaUpdate;
    }




}


