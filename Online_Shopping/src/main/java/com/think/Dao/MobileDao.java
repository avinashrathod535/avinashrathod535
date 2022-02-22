package com.think.Dao;

import java.util.List;

import com.think.Model.Mobile;

public interface MobileDao {
	

	boolean addMobile(Mobile mobileobj);
	boolean updateMobile(Mobile mobileobj);
	boolean deleteMobile(int mobileid);
	List <Mobile> ShowMobileList();
	Mobile SearchMobileById(int mobileid);
	List<Mobile>searchMobileByColour(String mobilecolour);
	List<Mobile>searchMobileByBrand(String mobilebrand);


}
