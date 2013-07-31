/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.centeropenmiddleware.jspspring.test.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author paco
 */
@Controller
public class hello2Controller  {
     @RequestMapping(value="/hello2.htm")
     public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         ModelAndView model = new ModelAndView("hello");
         model.addObject("message", "Spring 3 MVC Hello World");
         System.out.println("hola");
         return model;
         
     }
    
}