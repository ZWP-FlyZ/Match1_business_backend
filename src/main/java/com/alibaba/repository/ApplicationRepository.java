package com.alibaba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alibaba.entity.Application;
import com.alibaba.entity.User;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer> {
	
	List<Application> findAllByUser(User user);
	

	Application findById(Integer id);
	
}
