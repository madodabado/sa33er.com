package model;
// Generated Feb 25, 2016 3:14:11 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * UserPermission generated by hbm2java
 */
public class UserPermission  implements java.io.Serializable {


     private Integer userPermissionId;
     private Permission permission;
     private User user;
     private String email;
     private String permissionName;
     private Integer createdBy;
     private Date createdTimestamp;
     private Integer updatedBy;
     private Date updatedTimestamp;

    public UserPermission() {
    }

	
    public UserPermission(Permission permission, User user, String email, String permissionName) {
        this.permission = permission;
        this.user = user;
        this.email = email;
        this.permissionName = permissionName;
    }
    public UserPermission(Permission permission, User user, String email, String permissionName, Integer createdBy, Date createdTimestamp, Integer updatedBy, Date updatedTimestamp) {
       this.permission = permission;
       this.user = user;
       this.email = email;
       this.permissionName = permissionName;
       this.createdBy = createdBy;
       this.createdTimestamp = createdTimestamp;
       this.updatedBy = updatedBy;
       this.updatedTimestamp = updatedTimestamp;
    }
   
    public Integer getUserPermissionId() {
        return this.userPermissionId;
    }
    
    public void setUserPermissionId(Integer userPermissionId) {
        this.userPermissionId = userPermissionId;
    }
    public Permission getPermission() {
        return this.permission;
    }
    
    public void setPermission(Permission permission) {
        this.permission = permission;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPermissionName() {
        return this.permissionName;
    }
    
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }
    public Integer getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }
    public Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }
    
    public void setCreatedTimestamp(Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }
    public Integer getUpdatedBy() {
        return this.updatedBy;
    }
    
    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }
    public Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }
    
    public void setUpdatedTimestamp(Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }




}


