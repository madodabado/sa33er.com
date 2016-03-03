/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author mado
 */
import exceptionshandler.DataAccessLayerException;
import java.io.Serializable;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;



import java.util.List;
import org.hibernate.SessionFactory;
/**
 * This is an abstract class for the CRUD Methods
*/
public abstract class AbstractDao {
     
     private static SessionFactory factory;
   
        
    
   
    private Session session;
    private Transaction tx;
/**
 * This is the AbstractDao constructor to load build session if needed 
 */
    public AbstractDao() {
        
        HibernateFactory.buildIfNeeded();
        
    }
/**
 * This method to Save or update data in database table
 * @param obj 
 */
    protected void saveOrUpdate(Object obj) {
        try {
            startOperation();
            session.saveOrUpdate(obj);
            tx.commit();
             
        } catch (HibernateException e) {
            handleException(e);
            
        } finally {
          HibernateFactory.close(session);
         
         
        }
    }
    
    /**
     * This method to delete data from database table
     * @param obj 
     */

    protected void delete(Object obj) {
        try {
            startOperation();
            session.delete(obj);
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            
          HibernateFactory.close(session);
        }
    }
/**
 * This method to search data from table in database table using id 
 * @param clazz
 * @param id
     * @param columnName
 * @return 
 */
    protected List find(Class clazz, int id,String columnName) {
        List obj = null;
        try {
            startOperation();
           // obj = session.load(clazz, id);
             Query query = session.createQuery("from " + clazz.getName()+" where "+columnName+" = "+id );
              obj = query.list();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
           HibernateFactory.close(session);
        }
        return obj;
    }
 
    protected List findAll(Class clazz) {
        List objects = null;
        try {
            startOperation();
            Query query = session.createQuery("from " + clazz.getName());
            objects = query.list();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
        HibernateFactory.close(session);
         
        }
        return objects;
    }
    /**
     * This method to find data in database table by any column
     * @param clazz
     * @param name
     * @param coloumnName
     * @return 
     */
    
       protected List findName(Class clazz , String name , String columnName) {
        List objects = null;
        try {
            startOperation();
            Query query = session.createQuery("from " + clazz.getName()+" where " + columnName+ " like '"+name +"'");
            objects = query.list();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
        HibernateFactory.close(session);
         
        }
        return objects;
    }
    
    
    
    
  
    
    /**
     * This method handle the exception in the data access layer 
     * @param e
     * @throws DataAccessLayerException 
     */

    protected void handleException(HibernateException e) throws DataAccessLayerException {
        tx.rollback();
        
        
        throw new DataAccessLayerException(e);
    }

    /**
     * This method for starting a new session to database
     * @throws HibernateException 
     */
    protected void startOperation() throws HibernateException {
       session = HibernateFactory.openSession();
        tx = session.beginTransaction();
        
        
    }
    /**
     * this method is for check the user name and password
     * @param clazz
     * @param userName
     * @param Password
     * @param userType
     * @return 
     */
      protected List findUserPass(Class clazz, String email,String Password ) {
        List obj = null;
        try {
            startOperation();
           // obj = session.load(clazz, id);
             Query query = session.createQuery("from " + clazz.getName()+" where email = '"+email +"' and password = '"+Password+"'" );
              obj = query.list();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
           HibernateFactory.close(session);
        }
        return obj;
    }
}

