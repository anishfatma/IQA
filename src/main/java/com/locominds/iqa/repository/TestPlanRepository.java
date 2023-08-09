
package com.locominds.iqa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locominds.iqa.entity.TestPlan;

@Repository
public interface TestPlanRepository extends JpaRepository<TestPlan, Long> {
	
	public List<TestPlan> findByProjectId(int projectId);

}
