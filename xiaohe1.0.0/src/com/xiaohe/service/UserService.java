/**
 * 
 */
package com.xiaohe.service;

import com.xiaohe.bean.User;
import com.xiaohe.bean.UserQuaryBean;

/**
 * @author WYJ
 *
 */
public interface UserService {
	
	public void addUser(User user);
	
	public UserQuaryBean quaryUserByUsernameAndPassword(UserQuaryBean userQuaryBean);
	
}
