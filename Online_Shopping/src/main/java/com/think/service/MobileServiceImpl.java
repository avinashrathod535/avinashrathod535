package com.think.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.think.Dao.MobileDao;
import com.think.Model.Mobile;

   


@Service
public class MobileServiceImpl implements MobileService {
	
	@Autowired
	private MobileDao mdao;

	@Override
	public boolean addMobile(Mobile mobileobj) {
		// TODO Auto-generated method stub
		return mdao.addMobile(mobileobj);
	}

	@Override
	public boolean updateMobile(Mobile mobileobj) {
		// TODO Auto-generated method stub
		return mdao.updateMobile(mobileobj);
	}

	@Override
	public boolean deleteMobile(int mobileid) {
		// TODO Auto-generated method stub
		return mdao.deleteMobile(mobileid);
	}

	@Override
	public List<Mobile> ShowMobileList() {
		// TODO Auto-generated method stub
		return mdao.ShowMobileList();
	}

	@Override
	public Mobile SearchMobileById(int mobileid) {
		// TODO Auto-generated method stub
		return mdao.SearchMobileById(mobileid);
	}

	@Override
	public List<Mobile> searchMobileByColour(String mobilecolour) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mobile> searchMobileByBrand(String mobilebrand) {
		// TODO Auto-generated method stub
		return null;
	}

}
