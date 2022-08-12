/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosDAO;


import datos.SgjnCiudad;
import db.HibernateSGJN;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author crist
 */
public class CiudadDAO {
           public static List<SgjnCiudad> datosCiudad() {

            Session session = HibernateSGJN.getSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery("from SgjnCiudad");
            List ciudad = query.list();
            session.getTransaction().commit();
            session.close();
            return ciudad;

    }
}
