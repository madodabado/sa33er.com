/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import exceptionshandler.DataAccessLayerException;
import java.util.List;
import model.Permission;

/**
 *
 * @author Mado
 */
public class PermissionDao extends AbstractDao {
    public PermissionDao(){
        super();
    }
    
      
     /**
     * 
     * @param permission
     * @throws DataAccessLayerException 
     */
      public void create(Permission permission) throws DataAccessLayerException {
        super.saveOrUpdate(permission);
    }
      /**
       * 
       * @param permission
       * @throws DataAccessLayerException 
       */
     public void delete(Permission permission) throws DataAccessLayerException {
        super.delete(permission);
    }
      /**
       * 
       * @param Id
       * @return
       * @throws DataAccessLayerException 
       */
        public List find(int Id) throws DataAccessLayerException {
           
        return  super.find(Permission.class, Id ,"permission_id");
        
    }
        /**
         * 
         * @param permission
         * @throws DataAccessLayerException 
         */
         public void update(Permission permission) throws DataAccessLayerException {
        super.saveOrUpdate(permission);
    }
         /**
          * 
          * @return
          * @throws DataAccessLayerException 
          */
           public List findAll() throws DataAccessLayerException {
        return super.findAll(Permission.class);
    } 
           
           
    
}
