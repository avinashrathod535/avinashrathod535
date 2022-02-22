package com.think.service;

import java.util.List;

import com.think.Model.Mobile;


public interface MobileService {
	boolean addMobile(Mobile mobileobj);
	boolean updateMobile(Mobile mobileobj);
	boolean deleteMobile(int mobileid);
	List <Mobile> ShowMobileList();
	Mobile SearchMobileById(int mobileid);
	List<Mobile>searchMobileByColour(String mobilecolour);
	List<Mobile>searchMobileByBrand(String mobilebrand);

}
