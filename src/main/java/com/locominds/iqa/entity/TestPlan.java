
package com.locominds.iqa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEST_PLAN")
public class TestPlan {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long testPlanId;

	@Column(name = "PROJECT_ID")
	private int projectId;
	
	@Column(name = "PLAN_NAME")
	private String planName;
	
	@Column(name = "SPRINT")
	private String sprint;
	
	@Column(name = "TEAM")
	private String TEAM;
	
	@Column(name = "FEATURE")
	private String feature;
	
	@Column(name = "DESCRIPTION")
	private String description;

	public Long getTestPlanId() {
		return testPlanId;
	}

	public void setTestPlanId(Long testPlanId) {
		this.testPlanId = testPlanId;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getSprint() {
		return sprint;
	}

	public void setSprint(String sprint) {
		this.sprint = sprint;
	}

	public String getTEAM() {
		return TEAM;
	}

	public void setTEAM(String tEAM) {
		TEAM = tEAM;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
}
