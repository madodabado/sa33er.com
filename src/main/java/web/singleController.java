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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.Category;
import model.SubCategory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.CategoryDao;
import services.SubCategoryDao;

/**
 *
 * @author Mado
 */
@Controller
public class singleController {
    
    
    @RequestMapping("/single")
    
 public String single(Model model ,HttpServletRequest request, HttpSession session ,@RequestParam("product_id") String product_id) {
  
     
     
     Collection categoryBeans = new ArrayList();
          Collection productBeans = new ArrayList();
         Category category = new Category();
        CategoryDao categoryDao = new CategoryDao();
        List categoryList = categoryDao.findAll();
        Iterator categoryIterator = categoryList.iterator();

        while (categoryIterator.hasNext()) {
            category = (Category) categoryIterator.next();

            categoryBeans.add(category);

        }
          ProductController productController=new ProductController();
        productBeans=productController.getProducts(Integer.parseInt(product_id));
        
        
        model.addAttribute("product" , productBeans);

        model.addAttribute("category", categoryBeans);
  category=null;
  categoryDao=null;
  categoryList=null;
  categoryIterator=null;
  
  
   return "single";
 
 }
        @RequestMapping("/sub-category")
    
 public String category(Model model ,HttpServletRequest request, HttpSession session ,@RequestParam("category_id") String category_id) {
    Collection categoryBeans = new ArrayList();
      Category category = new Category();
        CategoryDao categoryDao = new CategoryDao();
        List categoryList = categoryDao.findAll();
        Iterator categoryIterator = categoryList.iterator();
     
     
          Collection subCategoryBeans = new ArrayList();
        SubCategoryDao subcategoryDao = new SubCategoryDao();
        SubCategory subCategory = new SubCategory();
           List subCategoryList = subcategoryDao.findSubCategory(Integer.parseInt(category_id));
        Iterator subCategoryIterator = subCategoryList.iterator();

        while (subCategoryIterator.hasNext()) {
            subCategory = (SubCategory) subCategoryIterator.next();

            subCategoryBeans.add(subCategory);

        }
          

        while (categoryIterator.hasNext()) {
            category = (Category) categoryIterator.next();

            categoryBeans.add(category);

        }

        model.addAttribute("category", categoryBeans);
    
        
        category=null;
        categoryDao=null;
        categoryList=null;
        categoryIterator=null;
        
        
        model.addAttribute("subCategory" , subCategoryBeans);

     
  
   return "subcategory";
 
 }
}
