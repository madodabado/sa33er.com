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
         Category category = new Category();
        CategoryDao categoryDao = new CategoryDao();
        List categoryList = categoryDao.findAll();
        Iterator categoryIterator = categoryList.iterator();

        while (categoryIterator.hasNext()) {
            category = (Category) categoryIterator.next();

            categoryBeans.add(category);

        }

        model.addAttribute("category", categoryBeans);
        
        
        
        
        return "index";
    }
    
    @RequestMapping("/hello")
    
 public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
  
   model.addAttribute("name", name);
   //returns the view name
   return "helloworld";
 
 }
 
  @RequestMapping("/login")
 public String Login() {
    
     
     return "login";
 }
 
 
  @RequestMapping("/registration")
 public String Regestration() {
    
     
     return "registration";
 }
 
 
   
   
     
 

}
