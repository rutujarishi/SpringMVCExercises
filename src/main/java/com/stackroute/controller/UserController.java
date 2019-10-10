package com.stackroute.controller;

import com.stackroute.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @RequestMapping("/show")
    public ModelAndView getName(HttpServletRequest req){
       // System.out.println("Inside method");

        String str = req.getParameter("name");
        String str1 = req.getParameter("password");
        User user = new User();
        user.setName(str);
        user.setPassword(str1);
        ModelAndView modelAndView=new ModelAndView("display");
        modelAndView.addObject("value",user.getName());
        modelAndView.addObject("value1",user.getPassword());
        return  modelAndView;
    }
}

