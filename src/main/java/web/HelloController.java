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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;
import services.CategoryDao;

/**
 *
 * @author mado
 */

@Controller
public class HelloController {
    
     @RequestMapping("/")
    public String index(Model model, HttpSession session){
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

        model.addAttribute("category", categoryBeans);
        ProductController productController=new ProductController();
        productBeans=productController.getProducts();
        
        
        model.addAttribute("product" , productBeans);
        
        
        return "index";
    }
    
    @RequestMapping("/menu")
    
 public String hello( Model model) {
  

   
   return "menu";
 
 }
 
  @RequestMapping("/login")
 public String Login() {
    
     
     return "login";
 }
 
 
  
 
 
 
   
   
     
 

}
