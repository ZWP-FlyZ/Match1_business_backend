package com.alibaba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.alibaba.entity.Application;
import com.alibaba.entity.Process;

@Repository
public interface ProcessRepository extends JpaRepository<Process, Integer> {
	public Process save(Process prcess);
	
    List findByApplication(Application application);
}
