/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import model.Product;
import services.ProductDao;

/**
 *
 * @author Mado
 */
public class ProductController {
    
    
    public Collection getProducts(){
        
        
         Collection productBeans = new ArrayList();
         Product product = new Product();
        ProductDao productDao = new ProductDao();
        List productList = productDao.findAll();
        Iterator categoryIterator = productList.iterator();

        while (categoryIterator.hasNext()) {
            product = (Product) categoryIterator.next();

            productBeans.add(product);

        } 
        
        productBeans=null;
        product=null;
        productDao=null;
        productList=null;
        categoryIterator=null;
        
        return productBeans;
        
    }
      public Collection getProducts(int id){
        
        
         Collection productBeans = new ArrayList();
         Product product = new Product();
        ProductDao productDao = new ProductDao();
        List productList = productDao.find(id);
        Iterator categoryIterator = productList.iterator();

        while (categoryIterator.hasNext()) {
            product = (Product) categoryIterator.next();

            productBeans.add(product);

        } 
        return productBeans;
        
    }
    
}
