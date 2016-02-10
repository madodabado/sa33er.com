/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import exceptionshandler.DataAccessLayerException;
import java.util.List;
import model.Store;

/**
 *
 * @author Mado
 */
public class StoreDao extends AbstractDao{
    public StoreDao(){
        super();
    }
    
    /**
     * 
     * @param store
     * @throws DataAccessLayerException 
     */
      public void create(Store store) throws DataAccessLayerException {
        super.saveOrUpdate(store);
    }
      /**
       * 
       * @param store
       * @throws DataAccessLayerException 
       */
     public void delete(Store store) throws DataAccessLayerException {
        super.delete(store);
    }
      /**
       * 
       * @param Id
       * @return
       * @throws DataAccessLayerException 
       */
        public List find(int Id) throws DataAccessLayerException {
           
        return  super.find(Store.class, Id ,"store_id");
        
    }
        /**
         * 
         * @param store
         * @throws DataAccessLayerException 
         */
         public void update(Store store) throws DataAccessLayerException {
        super.saveOrUpdate(store);
    }
         /**
          * 
          * @return
          * @throws DataAccessLayerException 
          */
           public List findAll() throws DataAccessLayerException {
        return super.findAll(Store.class);
    } 
           
           
    
    
}
