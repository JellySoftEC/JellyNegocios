package datos;
// Generated 16/07/2022 1:16:45 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Persona generated by hbm2java
 */
@Entity
@Table(name="persona"
    ,catalog="sgjn"
)
public class Persona  implements java.io.Serializable {


     private int idpersona;
     private String nombre;
     private String apellido;
     private int edad;
     private String direccion;
     private String email;
     private String tipo;
     private String usuario;
     private String contrasena;

    public Persona() {
    }

    public Persona(int idpersona, String nombre, String apellido, int edad, String direccion, String email, String tipo, String usuario, String contrasena) {
       this.idpersona = idpersona;
       this.nombre = nombre;
       this.apellido = apellido;
       this.edad = edad;
       this.direccion = direccion;
       this.email = email;
       this.tipo = tipo;
       this.usuario = usuario;
       this.contrasena = contrasena;
    }
   
     @Id 

    
    @Column(name="idpersona", unique=true, nullable=false)
    public int getIdpersona() {
        return this.idpersona;
    }
    
    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    
    @Column(name="nombre", nullable=false, length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="apellido", nullable=false, length=45)
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    @Column(name="edad", nullable=false)
    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    @Column(name="direccion", nullable=false, length=60)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Column(name="email", nullable=false, length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="tipo", nullable=false, length=1)
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    @Column(name="usuario", nullable=false, length=45)
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    @Column(name="contrasena", nullable=false, length=45)
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }




}


