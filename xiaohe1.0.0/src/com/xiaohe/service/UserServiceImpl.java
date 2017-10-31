/**
 * 
 */
package com.xiaohe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.xiaohe.bean.User;
import com.xiaohe.bean.UserQuaryBean;
import com.xiaohe.mapper.UserMapper;

/**
 * @author WYJ
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	@Qualifier("userMapper")
	private UserMapper userMapper;
	
	public void addUser(User user) {
		userMapper.addUser(user);
	}
	
	public UserQuaryBean quaryUserByUsernameAndPassword(UserQuaryBean userQuaryBean){
		return userMapper.quaryUserByUsernameAndPassword(userQuaryBean);
	}

	
	
	
}
