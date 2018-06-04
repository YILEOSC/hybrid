package com.yile.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yile.db.dao.UsersMapper;
import com.yile.db.model.Users;
import com.yile.db.model.UsersExample;

@RestController
public class UserController {
	 @Autowired
	 private UsersMapper userDao;
	 
	 @RequestMapping("/getAllUsers")
	 public List<Users> getAllUsers() {
		 UsersExample userExample = new UsersExample();
		 userExample.createCriteria().andIdGreaterThan(0);
		List<Users> users=this.userDao.selectByExample(userExample);
		return users;
	 }
	 
	 @RequestMapping("/saveUsers")
	 public boolean saveUsers(){
		 boolean res=false;
		 Users users=new Users();
		 users.setAddress("adress");
		 users.setName("name");
		 users.setPhone("1234567");
		int i= this.userDao.insert(users);
		if(i>0) {
			res=true;
		}
		 return res;
		 
	 }

	
}
