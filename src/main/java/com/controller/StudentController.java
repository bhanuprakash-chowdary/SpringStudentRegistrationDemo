package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.DataAccess;
import com.model.Student;

@Controller
public class StudentController 
{
	@RequestMapping("/reg")
	public ModelAndView regStud()
	{
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("Registration.jsp");
		
		return mv;
	}
	@RequestMapping("/regStud")
	public ModelAndView insert(HttpServletRequest req,HttpServletResponse res) 
	{
		String name=req.getParameter("tbName");
		String age=req.getParameter("tbAge");
		String city=req.getParameter("tbCity");
		String mobile=req.getParameter("tbMobile");
		
		Student s= new Student();
		s.setName(name);
		s.setAge(age);
		s.setCity(city);
		s.setMobile(mobile);
		
		DataAccess da=new DataAccess();
		da.insert(s);
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Registration.jsp");
		mv.addObject("result","inserted....");
		
		return mv;
		
	}
	

}
