package model;
// Generated Feb 21, 2016 4:25:01 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Review generated by hbm2java
 */
public class Review  implements java.io.Serializable {


     private Integer reviewId;
     private Product product;
     private User user;
     private String email;
     private int review;
     private String productName;
     private Integer createdBy;
     private Date createdTimestamp;
     private Integer updatedBy;
     private Date updatedTimestamp;

    public Review() {
    }

	
    public Review(Product product, User user, String email, int review, String productName) {
        this.product = product;
        this.user = user;
        this.email = email;
        this.review = review;
        this.productName = productName;
    }
    public Review(Product product, User user, String email, int review, String productName, Integer createdBy, Date createdTimestamp, Integer updatedBy, Date updatedTimestamp) {
       this.product = product;
       this.user = user;
       this.email = email;
       this.review = review;
       this.productName = productName;
       this.createdBy = createdBy;
       this.createdTimestamp = createdTimestamp;
       this.updatedBy = updatedBy;
       this.updatedTimestamp = updatedTimestamp;
    }
   
    public Integer getReviewId() {
        return this.reviewId;
    }
    
    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
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
    public int getReview() {
        return this.review;
    }
    
    public void setReview(int review) {
        this.review = review;
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

