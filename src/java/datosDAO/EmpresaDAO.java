/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosDAO;

import datos.SgjnEmpresa;
import java.util.List;
import db.HibernateSGJN;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author oscar
 */
public class EmpresaDAO {
    
        public static List<SgjnEmpresa> datosEmpresa() {
        Session session = HibernateSGJN.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from SgjnEmpresa");
        List empresa = query.list();
        session.getTransaction().commit();
        session.close();
        return empresa;

    }
        
    public static SgjnEmpresa Empresa() {
        Session session = HibernateSGJN.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from SgjnEmpresa");
        SgjnEmpresa x = null;
        if (!query.list().isEmpty()) {
            x = (SgjnEmpresa) query.list().get(0);
        }
        session.getTransaction().commit();
        session.close();
        return x;
    }
    
    public static void updateEmpresa(SgjnEmpresa empresa) {
        Session session = HibernateSGJN.getSessionFactory().openSession();
         session.beginTransaction();
        session.update(empresa);
        session.getTransaction().commit();
        session.close();
    }
    
    public static void SaveEmpresa(SgjnEmpresa empresa) {
        Session session = HibernateSGJN.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(empresa);
        session.getTransaction().commit();
        session.close();
    }
}
