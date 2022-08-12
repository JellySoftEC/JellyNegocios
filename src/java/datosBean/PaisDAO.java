/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosDAO;


import datos.SgjnPais;
import db.HibernateSGJN;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

import datos.SgjnPais;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;

/**
 *
 * @author crist
 */
public class PaisDAO {
    
    
    
    public static void addPais(SgjnPais pais){
        Transaction trans =null;
        Session session=HibernateSGJN.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            session.save(pais);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (trans!=null) {
                trans.rollback();
                
            }
        }finally{
            session.flush();
            session.close();
        }
        
    }
    
    public void updatePais(SgjnPais pais){
        
        
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
    
    public void deletePais(int idPais){
        Transaction trans= null;
        Session session = HibernateSGJN.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            SgjnPais pais = (SgjnPais)session.load(SgjnPais.class, new Integer(idPais));
            session.delete(pais);
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
  
    /*
    RECUERO DATOS 
    ID AUMENTO + 
    */
    
    public static SgjnPais recuperarCodigo(){
        Session session = HibernateSGJN.getSessionFactory().openSession();
        session.beginTransaction();
        Query query =session.createQuery("FROM SgjnPais WHERE jnpaisCodigo = (Select max( jnpaisCodigo) FROM SgjnPais)");
        SgjnPais pais = null;
        if(!query.list().isEmpty()){
            pais = (SgjnPais) query.list().get(0);
        }
        
        session.getTransaction().commit();
        session.close();
        return pais;
        
        
    }           
       public List<SgjnPais> listaPais() {
           List<SgjnPais> pais = null;
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
    


}
