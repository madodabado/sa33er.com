package model;
// Generated Feb 25, 2016 3:14:11 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * StoreProduct generated by hbm2java
 */
public class StoreProduct  implements java.io.Serializable {


     private Integer storeProductId;
     private Product product;
     private Store store;
     private String storeName;
     private String productName;
     private Integer createdBy;
     private Date createdTimestamp;
     private Integer updatedBy;
     private Date updatedTimestamp;

    public StoreProduct() {
    }

	
    public StoreProduct(Product product, Store store, String storeName, String productName) {
        this.product = product;
        this.store = store;
        this.storeName = storeName;
        this.productName = productName;
    }
    public StoreProduct(Product product, Store store, String storeName, String productName, Integer createdBy, Date createdTimestamp, Integer updatedBy, Date updatedTimestamp) {
       this.product = product;
       this.store = store;
       this.storeName = storeName;
       this.productName = productName;
       this.createdBy = createdBy;
       this.createdTimestamp = createdTimestamp;
       this.updatedBy = updatedBy;
       this.updatedTimestamp = updatedTimestamp;
    }
   
    public Integer getStoreProductId() {
        return this.storeProductId;
    }
    
    public void setStoreProductId(Integer storeProductId) {
        this.storeProductId = storeProductId;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public Store getStore() {
        return this.store;
    }
    
    public void setStore(Store store) {
        this.store = store;
    }
    public String getStoreName() {
        return this.storeName;
    }
    
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
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


