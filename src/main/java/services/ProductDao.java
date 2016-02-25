/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import exceptionshandler.DataAccessLayerException;
import java.util.List;
import model.Product;


/**
 *
 * @author Mado
 */
public class ProductDao extends AbstractDao {
    public ProductDao(){
        super();
    }
    
     
     /**
     * 
     * @param product
     * @throws DataAccessLayerException 
     */
      public void create(Product product) throws DataAccessLayerException {
        super.saveOrUpdate(product);
    }
      /**
       * 
       * @param product
       * @throws DataAccessLayerException 
       */
     public void delete(Product product) throws DataAccessLayerException {
        super.delete(product);
    }
      /**
       * 
       * @param Id
       * @return
       * @throws DataAccessLayerException 
       */
        public List find(int Id) throws DataAccessLayerException {
           
        return  super.find(Product.class, Id ,"produt_id");
        
    }
        /**
         * 
         * @param product
         * @throws DataAccessLayerException 
         */
         public void update(Product product) throws DataAccessLayerException {
        super.saveOrUpdate(product);
    }
         /**
          * 
          * @return
          * @throws DataAccessLayerException 
          */
           public List findAll() throws DataAccessLayerException {
        return super.findAll(Product.class);
    } 
           
           
    
    
}
