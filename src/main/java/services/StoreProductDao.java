/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import exceptionshandler.DataAccessLayerException;
import java.util.List;
import model.StoreProduct;

/**
 *
 * @author Mado
 */
public class StoreProductDao extends AbstractDao {
    public StoreProductDao (){
        super();
        
    }
    
    
    /**
     * 
     * @param storeProduct
     * @throws DataAccessLayerException 
     */
      public void create(StoreProduct storeProduct) throws DataAccessLayerException {
        super.saveOrUpdate(storeProduct);
    }
      /**
       * 
       * @param storeProduct
       * @throws DataAccessLayerException 
       */
     public void delete(StoreProduct storeProduct) throws DataAccessLayerException {
        super.delete(storeProduct);
    }
      /**
       * 
       * @param Id
       * @return
       * @throws DataAccessLayerException 
       */
        public List find(int Id) throws DataAccessLayerException {
           
        return  super.find(StoreProduct.class, Id ,"store_product_id");
        
    }
        /**
         * 
         * @param storeProduct
         * @throws DataAccessLayerException 
         */
         public void update(StoreProduct storeProduct) throws DataAccessLayerException {
        super.saveOrUpdate(storeProduct);
    }
         /**
          * 
          * @return
          * @throws DataAccessLayerException 
          */
           public List findAll() throws DataAccessLayerException {
        return super.findAll(StoreProduct.class);
    } 
           
          
    
    
    
}
