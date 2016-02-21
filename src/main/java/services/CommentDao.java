/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import exceptionshandler.DataAccessLayerException;
import java.util.List;
import model.Comment;

/**
 *
 * @author Mado
 */
public class CommentDao extends AbstractDao {
    
    public CommentDao(){
        super();
    }
    
     /**
     * 
     * @param comment
     * @throws DataAccessLayerException 
     */
      public void create(Comment comment) throws DataAccessLayerException {
        super.saveOrUpdate(comment);
    }
      /**
       * 
       * @param comment
       * @throws DataAccessLayerException 
       */
     public void delete(Comment comment) throws DataAccessLayerException {
        super.delete(comment);
    }
      /**
       * 
       * @param Id
       * @return
       * @throws DataAccessLayerException 
       */
        public List find(int Id) throws DataAccessLayerException {
           
        return  super.find(Comment.class, Id ,"comment_id");
        
    }
        /**
         * 
         * @param comment
         * @throws DataAccessLayerException 
         */
         public void update(Comment comment) throws DataAccessLayerException {
        super.saveOrUpdate(comment);
    }
         /**
          * 
          * @return
          * @throws DataAccessLayerException 
          */
           public List findAll() throws DataAccessLayerException {
        return super.findAll(Comment.class);
    } 
           
          
    
    
    
    
    
    
}
