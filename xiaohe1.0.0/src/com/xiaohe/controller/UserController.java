/**
 * 
 */
package com.xiaohe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xiaohe.bean.User;
import com.xiaohe.bean.UserQuaryBean;
import com.xiaohe.service.UserService;

/**
 * @author WYJ
 *
 */

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@RequestMapping("addUser")
	public String addUser(User user){
		
		userService.addUser(user);
		
		return "success";
	}
	@RequestMapping("login")
	public String quaryUserByUsernameAndPassword(UserQuaryBean userQuaryBean){
		
		userService.quaryUserByUsernameAndPassword(userQuaryBean);
		
		System.out.println("success");
		return null;
	}

}
