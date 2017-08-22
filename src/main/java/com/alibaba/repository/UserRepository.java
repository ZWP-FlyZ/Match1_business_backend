package com.alibaba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alibaba.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findById(int id);
	
	public User save(User user);
	
	public User delete(int uid);
	
	/**
	 * 根据用户名密码查找记录
	 * @param username 用户名
	 * @param userpassword 密码
	 * @return
	 */
	public User findByUsernameAndPassword(String username,String password);
	
}
