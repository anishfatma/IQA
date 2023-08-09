package com.locominds.iqa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEST_CASE")
public class TestCase {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long testCaseId;

	@Column(name = "TEST_CASE_NAME")
	private String testCaseName;

	@Column(name = "VERSION")
	private String version;

	@Column(name = "USER_STORY")
	private String userStory;

	@Column(name = "MODULE")
	private String module;

	@Column(name = "LABELS")
	private String labels;

	@Column(name = "TYPE")
	private String type;

	public Long getTestCaseId() {
		return testCaseId;
	}

	public void setTestCaseId(Long testCaseId) {
		this.testCaseId = testCaseId;
	}

	public String getTestCaseName() {
		return testCaseName;
	}

	public void setTestCaseName(String testCaseName) {
		this.testCaseName = testCaseName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getUserStory() {
		return userStory;
	}

	public void setUserStory(String userStory) {
		this.userStory = userStory;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getLabels() {
		return labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "TestCase [testCaseId=" + testCaseId + ", testCaseName=" + testCaseName + ", version=" + version
				+ ", userStory=" + userStory + ", module=" + module + ", labels=" + labels + ", type=" + type + "]";
	}
	
	
}
