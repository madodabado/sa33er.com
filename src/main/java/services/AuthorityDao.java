/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import exceptionshandler.DataAccessLayerException;
import java.util.List;
import model.Authority;

/**
 *
 * @author Mado
 */
public class AuthorityDao extends AbstractDao {
    public AuthorityDao(){
        super();
    }
    
    
     /**
     * 
     * @param authority
     * @throws DataAccessLayerException 
     */
      public void create(Authority authority) throws DataAccessLayerException {
        super.saveOrUpdate(authority);
    }
      /**
       * 
       * @param authority
       * @throws DataAccessLayerException 
       */
     public void delete(Authority authority) throws DataAccessLayerException {
        super.delete(authority);
    }
      /**
       * 
       * @param Id
       * @return
       * @throws DataAccessLayerException 
       */
        public List find(int Id) throws DataAccessLayerException {
           
        return  super.find(Authority.class, Id ,"auth_id");
        
    }
        /**
         * 
         * @param authority
         * @throws DataAccessLayerException 
         */
         public void update(Authority authority) throws DataAccessLayerException {
        super.saveOrUpdate(authority);
    }
         /**
          * 
          * @return
          * @throws DataAccessLayerException 
          */
           public List findAll() throws DataAccessLayerException {
        return super.findAll(Authority.class);
    }
           
           
        
    
}
