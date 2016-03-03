/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.util.Iterator;
import java.util.List;

import model.User;
import model.UserPermission;
import services.UserDao;
import services.UserPermissionDao;

/**
 *
 * @author Mado
 */
public class UserController {
    
    public String loginAuthontication(String email, String password){
    String userPer ="";
        User user = new User();
    UserDao userDao = new UserDao();
    UserPermission userPermission = new UserPermission();
    UserPermissionDao userPermissionDao = new UserPermissionDao();
    
     List userPermissionList=null;
     Iterator userPermissionIterator=null;
   List userList =userDao.findUserPass(email,password);
    
     Iterator userIterator = userList.iterator();

        while (userIterator.hasNext()) {
            user = (User) userIterator.next();
            
         userPermissionList = userPermissionDao.findUserPermission(user.getUserId());
            userPermissionIterator = userPermissionList.iterator();
           while (userPermissionIterator.hasNext()) {
            userPermission = (UserPermission) userPermissionIterator.next();
            userPer = userPermission.getPermissionName();
            
           }
           
           
            

        }
        
        user=null;
    userDao = null;
    userPermission=null;
    userPermissionDao=null;
    userList=null;
    userIterator=null;
    userPermissionList=null;
    userPermissionIterator=null;
    
    return userPer;
    }
  
    
    
    
    
    
}
