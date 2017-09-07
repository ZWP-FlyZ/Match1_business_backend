package com.alibaba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alibaba.entity.Message;

public interface MessageReponsitory extends JpaRepository<Message, Integer>{
	
}
