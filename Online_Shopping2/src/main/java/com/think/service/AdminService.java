package com.think.service;

import com.think.Model.Admin;

public interface AdminService {
	
	boolean addAdmin (String username, String password);
	boolean deleteAdmin(int aid);
	Admin getAdminByUnameAndUpass(String uname,String upass);


}
