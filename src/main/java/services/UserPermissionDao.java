/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import exceptionshandler.DataAccessLayerException;
import java.util.List;
import model.UserPermission;

/**
 *
 * @author Mado
 */
public class UserPermissionDao extends AbstractDao{
    public UserPermissionDao(){
        super();
    }
    
     /**
     * 
     * @param userPermission
     * @throws DataAccessLayerException 
     */
      public void create(UserPermission userPermission) throws DataAccessLayerException {
        super.saveOrUpdate(userPermission);
    }
      /**
       * 
       * @param userPermission
       * @throws DataAccessLayerException 
       */
     public void delete(UserPermission userPermission) throws DataAccessLayerException {
        super.delete(userPermission);
    }
      /**
       * 
       * @param Id
       * @return
       * @throws DataAccessLayerException 
       */
        public List find(int Id) throws DataAccessLayerException {
           
        return  super.find(UserPermission.class, Id ,"user_permission_id");
        
    }
        /**
         * 
         * @param userPermission
         * @throws DataAccessLayerException 
         */
         public void update(UserPermission userPermission) throws DataAccessLayerException {
        super.saveOrUpdate(userPermission);
    }
         /**
          * 
          * @return
          * @throws DataAccessLayerException 
          */
           public List findAll() throws DataAccessLayerException {
        return super.findAll(UserPermission.class);
    } 
           
    /**
     *
     * @param Id
     * @return
     * @throws DataAccessLayerException
     */
    public List findUserPermission(int Id) throws DataAccessLayerException {
           
        return  super.find(UserPermission.class, Id ,"user_id");
        
    }
    
    
    
}
