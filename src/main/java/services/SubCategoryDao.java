/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import exceptionshandler.DataAccessLayerException;
import java.util.List;
import model.SubCategory;

/**
 *
 * @author Mado
 */
public class SubCategoryDao extends AbstractDao {
    public SubCategoryDao(){
        super();
    }
    
    /**
     * 
     * @param subCategory
     * @throws DataAccessLayerException 
     */
      public void create(SubCategory subCategory) throws DataAccessLayerException {
        super.saveOrUpdate(subCategory);
    }
      /**
       * 
       * @param subCategory
       * @throws DataAccessLayerException 
       */
     public void delete(SubCategory subCategory) throws DataAccessLayerException {
        super.delete(subCategory);
    }
      /**
       * 
       * @param Id
       * @return
       * @throws DataAccessLayerException 
       */
        public List find(int Id) throws DataAccessLayerException {
           
        return  super.find(SubCategory.class, Id ,"sub_category_id");
        
    }
        /**
         * 
         * @param subCategory
         * @throws DataAccessLayerException 
         */
         public void update(SubCategory subCategory) throws DataAccessLayerException {
        super.saveOrUpdate(subCategory);
    }
         /**
          * 
          * @return
          * @throws DataAccessLayerException 
          */
           public List findAll() throws DataAccessLayerException {
        return super.findAll(SubCategory.class);
    } 
           
          
    
    
    
    
    
    
    
    
}
