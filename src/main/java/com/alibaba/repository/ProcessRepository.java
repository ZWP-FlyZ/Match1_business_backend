package com.alibaba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;



@NoRepositoryBean
public interface ProcessRepository extends JpaRepository<Process, Integer> {
	public Process save(Process prcess);
}
