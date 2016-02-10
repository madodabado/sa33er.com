/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author mado
 */

@Controller
public class HelloController {
    
     @RequestMapping("/")
    public String index(){
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
 
 
 
   
   
     
 

}
