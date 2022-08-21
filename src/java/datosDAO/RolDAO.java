/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosDAO;

import datos.SgjnRol;
import db.HibernateSGJN;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author oscar
 */
public class RolDAO {
    
    public static void NuevoRol(SgjnRol rol) {

        Session session = HibernateSGJN.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(rol);
        session.getTransaction().commit();
        session.close();
    }
    
    public static List<SgjnRol> ListarRol() {
        Session session = HibernateSGJN.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from SgjnRol");
        List rol = query.list();
        session.getTransaction().commit();
        session.close();
        return rol;

    }
    
    public static SgjnRol maxcodigorol() {

        Session session = HibernateSGJN.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM SgjnRol where jnrolCodigo = (SELECT max(jnrolCodigo) FROM SgjnRol)");
        SgjnRol rol = null;
        if (!query.list().isEmpty()) {
            rol = (SgjnRol) query.list().get(0);
        }
        session.getTransaction().commit();
        session.close();
        return rol;

    }
    
    public static void updateRol(SgjnRol rol) {
        Session session = HibernateSGJN.getSessionFactory().openSession();
         session.beginTransaction();
        session.update(rol);
        session.getTransaction().commit();
        session.close();
    }
    
    public static void eliminarRol(SgjnRol rol) {
        Session session = HibernateSGJN.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(rol);
        session.getTransaction().commit();
        session.close();
    }
}
