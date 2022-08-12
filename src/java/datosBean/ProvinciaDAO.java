/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosDAO;

import datos.SgjnProvincia;
import db.HibernateSGJN;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author crist
 */
public class ProvinciaDAO {
    
    public void addProvincia(SgjnProvincia provincia) {
        Transaction tx = null;
        Session session = HibernateSGJN.getSessionFactory().openSession();
        try {
            tx = session.beginTransaction();
            session.save(provincia);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.flush();
            session.close();
        }
    }
    
    
  
    
    public void updatePais(SgjnProvincia provincia){
        
        
    }
    
    /*
    public SgjnPais getPaisByID(int paisCodigo){
        SgjnPais pais = null;
        Transaction trans = null;
        Session session = HibernateSGJN.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            String queryString= "FROM sgjn_pais where paisCodigo=jnpais_codigo";
            Query query = session.createQuery(queryString);
            query.setInteger("jnpais_codigo", paisCodigo);
            pais=(SgjnPais)query.uniqueResult();
                    
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
        
     return pais;
   
}*/
    
    public void deleteProvincia(int idCodigo){
        Transaction trans= null;
        Session session = HibernateSGJN.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            SgjnProvincia provincia = (SgjnProvincia)session.load(SgjnProvincia.class, new Integer(idCodigo));
            session.delete(provincia);
            session.getTransaction().commit();
            
        } catch (Exception e) {
            if (trans != null) {
                trans.rollback();
                
            }
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
    }
  
       public List<SgjnProvincia> listaProvincias() {
           List<SgjnProvincia> pais = null;
        Session session = HibernateSGJN.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String sql = "FROM SgjnPais";
           try {
               pais =session.createQuery(sql).list();
               transaction.commit();
               session.close();
           } catch (Exception e) {
               transaction.rollback();
           }
        return pais;

    }
    


    
    public void deleteCliente(int idProvincia) {}
    public void updateProvincia(SgjnProvincia provincia) {}
    public SgjnProvincia getProvinciaID(int idProvincia) { return null;}
    
    
    
}
