/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosDAO;

import datos.Producto;
import db.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author oscar
 */
public class productoDAO {
    
        public static List<Producto> listaproducto() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Producto");
        List paises = query.list();
        session.getTransaction().commit();
        session.close();
        return paises;

    }
}
