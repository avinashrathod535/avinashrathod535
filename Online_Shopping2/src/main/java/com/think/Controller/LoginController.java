package com.think.Controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.think.Iteam.Iteam;
import com.think.Model.Admin;

import com.think.Model.Product;
import com.think.Model.User;
import com.think.service.AdminService;
import com.think.service.LoginService;
import com.think.service.ProductService;
import com.think.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService lservice;
	@Autowired
	private ProductService pservice;
	@Autowired
	private UserService uservice;
	@Autowired
	private AdminService adminservice;

	@GetMapping("/")
	public String startpage() {
		
		return "index";
	}
	
	@GetMapping("/mobiles")
	public ModelAndView getAll(){
		List<Product> lst=pservice.ShowMobileList();
		ModelAndView mv=new ModelAndView("Show_product");
		mv.addObject("mobilelist",lst);
		return mv;
		
	}
	
	@GetMapping("/adduser")
	public String Register(Model m, HttpServletRequest req) {
		return "adduser";
	}
	
	@PostMapping("/Registeruser")
	public String adduser(@ModelAttribute User user) {
		uservice.insertUser(user);
		return "index";
		
	}
	/*@GetMapping("/login")
	public String Login(Model m, HttpServletRequest req) {
		return "login";
	}
	@PostMapping("/log")
	public String Ulogin(@ModelAttribute User users, Admin admin,@RequestParam("utype") String role,HttpServletRequest req) {
		String username=users.getUname();
		String password=users.getUpass();
		System.out.println("ROLEEEEEEEEEEEEEEEEee"+role); 
		
		if(role.equalsIgnoreCase("user")) 
		{
			User u=uservice.getUserByUnameAndUpass(username, password);
			HttpSession session = req.getSession();
			ArrayList<Iteam> itemlist = new ArrayList<Iteam>();
			session.setAttribute("itemlist", itemlist);
			session.setAttribute("username",u.getUname());
			session.setAttribute("total", 0.0);
					if(u==null)
					{
						return "redirect:/login";
					}
			
			return "User_Home";
		}
		else
		{
			Admin a=adminservice.getAdminByUnameAndUpass(username, password);
			   if(a==null)
			   {
					return "redirect:/login";
				} 
			
			return "Admin_Home";
		}
	}*/
	
	
	@GetMapping("/login")
	public String Login(Model m, HttpServletRequest req) {
		return "login";
	}
	
	@PostMapping("/log")
	public String ValidateUser(@ModelAttribute User user, HttpServletRequest req)
	{
		
		String username = user.getUname();
		String password = user.getUpass();
		
		List<User> ulist=uservice.SearchUserByUname(username);

		//User u=uservice.getUserByUnameAndUpass(username, password);
		
		if (ulist== null || ulist.size()==0) 
		{
			req.setAttribute("status", "Invalid username and password");
			//return "forward:/login";
			return "redirect:/login";

		} 
		
		else 
		{
			User ur=null;
			for(User u:ulist) {
				if(BCrypt.checkpw(password, u.getUpass())) {
					ur=u;
					break;
				}
			}
			
			if(ur==null) {
				req.setAttribute("Status", "invalid Password");
				return "redirect:/login";
			}
			
			HttpSession session = req.getSession();
			//String role=u.getRole().getRoleType();
			ArrayList<Iteam> itemlist = new ArrayList<Iteam>();
			session.setAttribute("itemlist", itemlist);
			//session.setAttribute("userrole", role);
			session.setAttribute("username",ur.getUname());
			session.setAttribute("userid", ur.getUserid());	
			session.setAttribute("total", 0.0);
			
			if(ur.getRole().getRoleType().equalsIgnoreCase("admin")) {
				
				return "Admin_Home";
			}
			else {
				return "User_Home";

			}
			/*if(u.getUname().equals("Shubham") && u.getUpass().equals("123"))
			{
				//return "forward:/Admin_Home";
				return "Admin_Home";

			}
			else
			return "User_Home";*/
		
			
		/* if (role.equalsIgnoreCase("Admin")) 
				return "Admin_Home";
			
			else 
				return "User_Home";
		}*/
		}
	
	}
	@GetMapping("/logout")
	public String logout(HttpServletRequest req)
	{
		HttpSession sess = req.getSession();
		
		if(sess!=null)
		{
			sess.invalidate();
		}
		
		return "index";
	}
	
	@GetMapping("/xyz")
	public ModelAndView getAllProduct(){
		List<Product> lst=pservice.ShowMobileList();
		ModelAndView mv=new ModelAndView("Showproduct_u");
		mv.addObject("mobilelist",lst);
		return mv;
	}
	
	
	
	
}

