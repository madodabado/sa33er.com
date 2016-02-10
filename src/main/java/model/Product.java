package model;
// Generated Feb 10, 2016 1:49:24 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private Integer productId;
     private String name;
     private String description;
     private Integer createdBy;
     private Date createdTimestamp;
     private Integer updatedBy;
     private Date updatedTimestamp;
     private Set categories = new HashSet(0);

    public Product() {
    }

	
    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Product(String name, String description, Integer createdBy, Date createdTimestamp, Integer updatedBy, Date updatedTimestamp, Set categories) {
       this.name = name;
       this.description = description;
       this.createdBy = createdBy;
       this.createdTimestamp = createdTimestamp;
       this.updatedBy = updatedBy;
       this.updatedTimestamp = updatedTimestamp;
       this.categories = categories;
    }
   
    public Integer getProductId() {
        return this.productId;
    }
    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
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
    public Set getCategories() {
        return this.categories;
    }
    
    public void setCategories(Set categories) {
        this.categories = categories;
    }




}


