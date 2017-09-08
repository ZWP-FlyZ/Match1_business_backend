package com.alibaba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alibaba.entity.Application;
import com.alibaba.entity.PageModel;
import com.alibaba.entity.Process;

@Repository
public interface PageModelRepository extends JpaRepository<PageModel, Integer> {
	List<PageModel> findByApplication(Application application);
}
