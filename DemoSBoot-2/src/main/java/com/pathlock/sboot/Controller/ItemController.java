package com.pathlock.sboot.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pathlock.sboot.Model.Item;

@RestController
public class ItemController {

	@GetMapping("/")
	public ArrayList<Item> m1() {

		ArrayList itemlist = new ArrayList();
		itemlist.add(new Item(223, 222.44f, "Jacket"));
		itemlist.add(new Item(231, 254.41f, "Shirt"));
		itemlist.add(new Item(228, 242.44f, "T-Shairt"));
		itemlist.add(new Item(213, 272.45f, "Pant"));
		itemlist.add(new Item(229, 272.45f, "Inner"));

		return itemlist;
	}

}
