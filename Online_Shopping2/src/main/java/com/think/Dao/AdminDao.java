package com.think.Dao;

import com.think.Model.Admin;

public interface AdminDao {

	boolean addAdmin (String username, String password);
	boolean deleteAdmin(int aid);
	Admin getAdminByUnameAndUpass(String uname,String upass);


}
