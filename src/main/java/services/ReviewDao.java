/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import exceptionshandler.DataAccessLayerException;
import java.util.List;
import model.Review;

/**
 *
 * @author Mado
 */
public class ReviewDao extends AbstractDao{
    public ReviewDao(){
        super();
    }
    
     /**
     * 
     * @param review
     * @throws DataAccessLayerException 
     */
      public void create(Review review) throws DataAccessLayerException {
        super.saveOrUpdate(review);
    }
      /**
       * 
       * @param review
       * @throws DataAccessLayerException 
       */
     public void delete(Review review) throws DataAccessLayerException {
        super.delete(review);
    }
      /**
       * 
       * @param Id
       * @return
       * @throws DataAccessLayerException 
       */
        public List find(int Id) throws DataAccessLayerException {
           
        return  super.find(Review.class, Id ,"review_id");
        
    }
        /**
         * 
         * @param review
         * @throws DataAccessLayerException 
         */
         public void update(Review review) throws DataAccessLayerException {
        super.saveOrUpdate(review);
    }
         /**
          * 
          * @return
          * @throws DataAccessLayerException 
          */
           public List findAll() throws DataAccessLayerException {
        return super.findAll(Review.class);
    } 
           
          
    
    
    
    
    
    
}
