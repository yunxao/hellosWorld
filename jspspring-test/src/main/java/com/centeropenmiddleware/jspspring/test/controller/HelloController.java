/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.centeropenmiddleware.jspspring.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
 
@Controller
//@RequestMapping("/welcome")
public class HelloController extends ParameterizableViewController{
 
	@RequestMapping("/userSuccess.htm")
	public String redirect()
	{
		return "userSuccess";
	}
}