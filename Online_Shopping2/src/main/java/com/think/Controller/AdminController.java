package com.think.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.think.Model.Admin;
import com.think.Model.Product;
import com.think.Model.User;

import com.think.service.AdminService;
import com.think.service.ProductService;

@Controller
public class AdminController {

	@Autowired
	private AdminService aservice;
	@Autowired
	private ProductService pservice;
	
		@GetMapping("/adminhomepage")
		public String adminPage()
		{
			return "Admin_Home";
		}
		
		@GetMapping("/index")
		public String indexPage()
		{
			return "index";
		}
		
		
		@GetMapping("/abc")
		public ModelAndView getAllP(){
			List<Product> lst=pservice.ShowMobileList();
			ModelAndView mv=new ModelAndView("Showproduct_a");
			mv.addObject("mobilelist",lst);
			return mv;
		}
		
	  @GetMapping("/delete")
		public String deleteMobile(@RequestParam("id") int id)
		{
			Product p=pservice.SearchMobileById(id);
			if(p!=null)
				pservice.deleteMobile(p);
			return "forward:/abc";
		}
		
	  /*@GetMapping("/update")
		public String updateProduct(@RequestParam("mobileid") String mobileid, @RequestParam("Brand") int brand,@RequestParam("Storage") String pcolor) throws Exception
		{
			
			Product ob=new Product(pname,price,pcolor);
			pservice.updateProduct(ob);
			return  "redirect:/productadmin";
		}*/
	  
	  @GetMapping("/update")
		public String updateProduct(@RequestParam("mobileid") int mobileid, @RequestParam("brand") String brand,@RequestParam("storage") String storage,@RequestParam("ram") String ram,@RequestParam("price") int price,@RequestParam("colour") String colour,@RequestParam("display") String display) throws Exception
		{
			
			Product ob=new Product(mobileid,brand,storage,ram,price,colour,display);
			pservice.updateProduct(ob);
			return  "forward:/abc";
		}
	
		@GetMapping("/add")
		public String addMobile()
		{
		return "add_product";
		}
		
		@GetMapping("/save")
		public String saveMobile(@ModelAttribute("P") Product P)
		{
			pservice.addMobile(P);
			return "forward:/abc";
		}
		
		@GetMapping("/Edit")
		public ModelAndView editMobile(@RequestParam("id") int id){
			Product p=pservice.getMobileById(id);
			ModelAndView mv=new ModelAndView("editproduct");
			mv.addObject("mobile",p);
			return mv;
		}

	
}
