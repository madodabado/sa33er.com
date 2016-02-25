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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Mado
 */
@Controller
public class singleController {
    
    
    @RequestMapping("/single")
    
 public String single(Model model ,HttpServletRequest request, HttpSession session) {
  
  
   return "single";
 
 }
    
}
