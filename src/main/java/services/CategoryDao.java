/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import exceptionshandler.DataAccessLayerException;
import java.util.List;
import model.Category;

/**
 *
 * @author Mado
 */
public class CategoryDao extends AbstractDao{
    public CategoryDao(){
        super();
    }
    
     /**
     * 
     * @param category
     * @throws DataAccessLayerException 
     */
      public void create(Category category) throws DataAccessLayerException {
        super.saveOrUpdate(category);
    }
      /**
       * 
       * @param category
       * @throws DataAccessLayerException 
       */
     public void delete(Category category) throws DataAccessLayerException {
        super.delete(category);
    }
      /**
       * 
       * @param Id
       * @return
       * @throws DataAccessLayerException 
       */
        public List find(int Id) throws DataAccessLayerException {
           
        return  super.find(Category.class, Id ,"category_id");
        
    }
        /**
         * 
         * @param category
         * @throws DataAccessLayerException 
         */
         public void update(Category category) throws DataAccessLayerException {
        super.saveOrUpdate(category);
    }
         /**
          * 
          * @return
          * @throws DataAccessLayerException 
          */
           public List findAll() throws DataAccessLayerException {
        return super.findAll(Category.class);
    }
           
           
    
    
}
