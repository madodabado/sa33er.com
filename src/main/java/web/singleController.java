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
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.CategoryDao;

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
  
   return "single";
 
 }
    
}
