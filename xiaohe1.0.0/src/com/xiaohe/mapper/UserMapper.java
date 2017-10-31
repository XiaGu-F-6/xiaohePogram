/**
 * 
 */
package com.xiaohe.mapper;

import java.util.List;

import com.xiaohe.bean.User;
import com.xiaohe.bean.UserQuaryBean;

import org.apache.ibatis.annotations.Param;  

/**
 * @author WYJ
 *
 */
public interface UserMapper {

	public void addUser(User user);
	
	public UserQuaryBean  quaryUserByUsernameAndPassword(UserQuaryBean userQuaryBean);
	
}
