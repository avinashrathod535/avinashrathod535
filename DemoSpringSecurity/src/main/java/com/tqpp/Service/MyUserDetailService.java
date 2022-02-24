package com.tqpp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tqpp.dao.UserRepository;
import com.tqpp.model.User;

@Service
public class MyUserDetailService implements UserDetailsService
{
	@Autowired
     private UserRepository userrepo;
	
	
	public UserDetails loadUserByUsername(String password) throws UsernameNotFoundException {
		System.out.println("user)))))))))))))))))))))))))))))"+password);
		User user=userrepo.findByPassword(password);
		System.out.println("*******Repo "+user);
		return new UserDetail_Impl(user);
	}


	

}
