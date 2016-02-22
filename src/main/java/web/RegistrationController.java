/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.UserDao;

/**
 *
 * @author Mado
 */
@Controller
public class RegistrationController {
     @RequestMapping("/Add-User")
    public String Regist( Model model ,HttpServletRequest request, HttpSession session,
            @RequestParam("fname") String firstName,@RequestParam("lname") String lastName,@RequestParam("year") String year
    ,@RequestParam("month") String month,@RequestParam("day") String day,@RequestParam("email") String email
    ,@RequestParam("password") String Password,@RequestParam("address1") String address1,@RequestParam("address2") String address2,
    @RequestParam("country") String country,@RequestParam("city") String city , @RequestParam("countryCode") String countryCode , @RequestParam("phoneNumber") String phoneNumber , @RequestParam("gender") String gender) throws ParseException{
      String birthOfDate = year+"-"+month+"-"+day;
      DateFormat format = new SimpleDateFormat("yyyy-MMMM-d", Locale.ENGLISH);
      Date date =format.parse(birthOfDate);
    User user = new User();
   
    user.setAddress01(address1);
    
    user.setAddress02(address2);
    user.setBirthOfDate(date);
    user.setCity(city);
    user.setCountry(country);
    user.setEmail(email);
    user.setFirstName(firstName);
    user.setPassword(Password);
    user.setPhoneNumber(phoneNumber);
    user.setLastName(lastName);
    user.setGender(gender);
    
    UserDao userDao= new UserDao();
    userDao.create(user);
    user = null;
    userDao = null;
        
        
        
        
        
        
       
     return "redirect:./";
 }
    
    
    
    
    
}
