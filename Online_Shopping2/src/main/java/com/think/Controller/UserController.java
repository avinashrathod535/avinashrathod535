package com.think.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.think.Iteam.Iteam;
import com.think.Model.Order_Details;
import com.think.Model.Orders;
import com.think.Model.Product;
import com.think.Model.User;
import com.think.service.AdminService;
import com.think.service.CartService;
import com.think.service.OrderService;
import com.think.service.ProductService;

@Controller
public class UserController {

	@Autowired
	private CartService cdao;
	@Autowired
	private AdminService aservice;
	@Autowired
	private ProductService pservice;
	@Autowired
	private OrderService oservice;
	
	
	@GetMapping("/userhomepage")
	public String adminPage()
	{
		return "User_Home";
	}

	@GetMapping("/pink")
	public String addIteamToCart(HttpServletRequest req) {
		HttpSession session = req.getSession(false);

		ArrayList<Iteam> list = (ArrayList<Iteam>) session.getAttribute("itemlist");

		if (list == null) {
			return "redirect:/login";
		} else {
			int cartid = Integer.parseInt(req.getParameter("id"));
			Double total = (Double) session.getAttribute("total");
			Product p = pservice.SearchMobileById(cartid);
			total = total + p.getPrice() * 1;
			list.add(new Iteam(p.getMobileid(), p.getBrand(), p.getPrice(), 1));
			session.setAttribute("itemlist", list);
			session.setAttribute("total", total);
			return "forward:/xyz";

		}
	}

	@GetMapping("/viewcart")
	public String showCart(HttpServletRequest request, Model m) {
		HttpSession session = request.getSession(false);
		if (session == null)
			m.addAttribute("Status", "Oppss! Your Cart is Empty!!");
		else {
			ArrayList<Iteam> ilist = (ArrayList<Iteam>) session.getAttribute("itemlist");
			m.addAttribute("itemlist", ilist);
			m.addAttribute("total", session.getAttribute("total"));
		}

		return "viewcart";
	}

	@GetMapping("/order")
	public String placeOrder(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		ArrayList<Iteam> itemCart = (ArrayList<Iteam>) session.getAttribute("itemlist");
		List<Product> list = pservice.ShowMobileList();
		User user = (User) session.getAttribute("user");
		Orders order = new Orders();
		order.setUser(user);
		order.setOrderstatus("Placed");

		List<Order_Details> od = new ArrayList<Order_Details>();

		for (Product p : list) {
			for (Iteam item : itemCart) {
				if (item.getIteamid() == p.getMobileid()) {
					od.add(new Order_Details(order, p, 1));
					break;
				}
			}
		}

		oservice.placedOrder(order);
		return "PlacedOrder";
	}

}
