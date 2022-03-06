package com.think.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.think.Dao.RoleDaoImpl;
import com.think.Dao.UserDao;
import com.think.Model.Role;
import com.think.Model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao udao;
	@Autowired
	private RoleDaoImpl rdao;
	
	@Autowired
	private BCryptPasswordEncoder passEncoder;

	@Override
	public boolean insertUser(User uobj) {
		String password = uobj.getUpass();
		String encodePass =passEncoder.encode(password);
		
		uobj.setUpass(encodePass);
		
		Role r = rdao.getByRoleId(2);
		
		uobj.setRole(r);
		
		 udao.insertUser(uobj);
		 return true;
	}

	@Override
	public boolean updateUser(User uobj) {
		// TODO Auto-generated method stub
		return udao.updateUser(uobj);
	}

	@Override
	public boolean deleteUser(User uid) {
		// TODO Auto-generated method stub
		return udao.deleteUser(uid);
	}

	@Override
	public List<User> ShowUserList() {
		return udao.ShowUserList();
	}

	@Override
	public User SearchUserById(int uid) {
		return udao.SearchUserById(uid);
	}

	@Override
	public List<User> SearchUserByUname(String uname) {
		return udao.SearchUserByUname(uname);
	}

	@Override
	public User getUserByUnameAndUpass(String uname, String upass) {
		User u=udao.getUserByUnameAndUpass(uname, upass);
		return u;
	}

}
