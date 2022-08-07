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
    
}
