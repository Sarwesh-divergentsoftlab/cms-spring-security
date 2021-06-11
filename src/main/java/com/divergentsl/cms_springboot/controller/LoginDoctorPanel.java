package com.divergentsl.cms_springboot.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.divergentsl.cms_springboot.model.Doctor;
import com.divergentsl.cms_springboot.service.LoginDoctorService;


@RequestMapping("/logindoctor")
@Controller
public class LoginDoctorPanel {
	@Autowired
	LoginDoctorService loginDoctorService;
	
	@PostMapping
	public String checkDoctor(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String username = req.getParameter("userId");
		String password = req.getParameter("password");
		Doctor loginDoctor = new Doctor();
		loginDoctor.setDoctor_id(username);
		loginDoctor.setPassword(password);
		 boolean f=loginDoctorService.doctorLogin(loginDoctor);
		    if(f)
		     {
		     
		    	System.out.println("login success");
		    	System.out.println("login as "+loginDoctor.getDoctor_id());
		    	return "doctorPanel";
		     }
		    else
		    {
		    	 System.out.println("login doctor fail");
		    	 return "doctorlogin";
		    }
		    
	}
	@GetMapping
	public String showDoctorLogin()
	{
		return "doctorlogin";
	}		
}