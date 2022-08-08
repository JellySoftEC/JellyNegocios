/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosDAO;

import datos.SgjnPersona;
import db.HibernateSGJN;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author oscar
 */
public class UsuarioDAO {
 
    public static void modificarUsuario(SgjnPersona usuario) {
        Session session = HibernateSGJN.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(usuario);
        session.getTransaction().commit();
        session.close();
    }

    public static void NuevoUsuario(SgjnPersona usuario) {

        Session session = HibernateSGJN.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(usuario);
        session.getTransaction().commit();
        session.close();
    }
    
    
    public static List<SgjnPersona> ListarUsuario() {

        Session session = HibernateSGJN.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from SgjnPersona");
        List usuarios = query.list();
        session.getTransaction().commit();
        session.close();
        return usuarios;

    }
    
        public static SgjnPersona maxcodigoUsuario() {

        Session session = HibernateSGJN.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM SgjnPersona where jnperCodigo = (SELECT max(jnperCodigo) FROM SgjnPersona)");
        SgjnPersona usuario = null;
        if (!query.list().isEmpty()) {
            usuario = (SgjnPersona) query.list().get(0);
        }
        session.getTransaction().commit();
        session.close();
        return usuario;

    }
    

    
}
