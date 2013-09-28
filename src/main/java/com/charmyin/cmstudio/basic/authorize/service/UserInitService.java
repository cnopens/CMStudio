package com.charmyin.cmstudio.basic.authorize.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.charmyin.cmstudio.basic.authorize.vo.Menu;

/**
 * Initial the login user session information, like roles, menus and so on, 
 * Consider the performance, later I will use cache to store the role name of a user
 * But now I will search the database directly~
 * @author YinCM
 * @since
 */
@Service
public interface UserInitService {

	/**
	 * Get roles by user name
	 * @param name
	 * @return
	 */
	public Set<String> getRoleNamesByUserName(String userName);
	
	/**
	 * Get user menus by user's role names
	 * @param roleNames 
	 * @return
	 */
	public Set<String> getMenuIdsByUserRoleNames(Set<String> roleNames);
	
	/**
	 * Get menus by their ids
	 * This is a stupid way to get the menus of a user, later it will replaced by a cache~
	 * @param menuIdSet
	 * @return
	 */
	public List<Menu> getMenusByMenuIds(Set<String> menuIdSet);
}
