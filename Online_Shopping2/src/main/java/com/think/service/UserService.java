package com.think.service;

import java.util.List;

import com.think.Model.User;

public interface UserService {

	boolean insertUser(User uobj);
	boolean updateUser(User uobj);
	boolean deleteUser(User uid);
	List <User> ShowUserList();
	User SearchUserById(int uid);
	List<User> SearchUserByUname(String uname);
	User getUserByUnameAndUpass(String uname,String upass);

}
