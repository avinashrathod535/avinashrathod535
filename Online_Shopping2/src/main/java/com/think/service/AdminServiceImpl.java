package com.think.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.think.Dao.AdminDao;
import com.think.Model.Admin;
import com.think.Model.User;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
    private AdminDao adao;
	
	
	@Override
	public boolean addAdmin(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAdmin(int aid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Admin getAdminByUnameAndUpass(String uname, String upass) {
		Admin a=adao.getAdminByUnameAndUpass(uname, upass);

		return a;
	}

}
