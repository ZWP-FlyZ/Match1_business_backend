package com.alibaba.repository;

import com.alibaba.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestEntityRepository extends JpaRepository<TestEntity, Integer> {
	//add or update
	public TestEntity save(TestEntity testEntity);
	//delete
	public void delete(TestEntity testEntity);
	//retrive one
	public TestEntity findByTestId(int testId);
	//retrive some
	public List<TestEntity> findAll();
}
