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
import model.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import services.CategoryDao;

/**
 *
 * @author Mado
 */
@Controller
public class CategoriesController {
    
    
     @RequestMapping("/categories")
    
 public String menu( Model model) {
  
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
   
   return "category";
 
 }
    
    
}
