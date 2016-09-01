package com.zzz.app.controller.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zzz.app.domain.sys.User;
import com.zzz.app.inner.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	
	public Object login(User user){
		return "success";
	}
	
	@RequestMapping("add")
	@ResponseBody
	public Object add(User user){
		userService.addUser(user);
		return "success";
	}

}
