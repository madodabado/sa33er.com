/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import exceptionshandler.DataAccessLayerException;
import java.util.List;
import model.User;

/**
 *
 * @author Mado
 */
public class UserDao extends AbstractDao {
    
    public UserDao(){
        super();
    }
    
    
    /**
     * 
     * @param user
     * @throws DataAccessLayerException 
     */
      public void create(User user) throws DataAccessLayerException {
        super.saveOrUpdate(user);
    }
      /**
       * 
       * @param user
       * @throws DataAccessLayerException 
       */
     public void delete(User user) throws DataAccessLayerException {
        super.delete(user);
    }
      /**
       * 
       * @param Id
       * @return
       * @throws DataAccessLayerException 
       */
        public List find(int Id) throws DataAccessLayerException {
           
        return  super.find(User.class, Id ,"user_id");
        
    }
        /**
         * 
         * @param user
         * @throws DataAccessLayerException 
         */
         public void update(User user) throws DataAccessLayerException {
        super.saveOrUpdate(user);
    }
         /**
          * 
          * @return
          * @throws DataAccessLayerException 
          */
           public List findAll() throws DataAccessLayerException {
        return super.findAll(User.class);
    } 
           
          
    
    
}
