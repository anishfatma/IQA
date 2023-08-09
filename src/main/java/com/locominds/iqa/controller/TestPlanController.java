
package com.locominds.iqa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locominds.iqa.entity.TestPlan;
import com.locominds.iqa.repository.TestPlanRepository;

@RestController

@RequestMapping("/api/testPlan")
public class TestPlanController {

	@Autowired
	private TestPlanRepository testPlanRepository;

	@PostMapping("/getTestPlan")
	public List<TestPlan> getTestPlan(@RequestBody Integer projectId) {

		return testPlanRepository.findByProjectId(projectId);

	}

	@PostMapping("/createTestPlan")
	public TestPlan createTestPlan(@RequestBody TestPlan testPlan) {
		System.out.println(testPlan);
		return testPlanRepository.save(testPlan);

	}

}
