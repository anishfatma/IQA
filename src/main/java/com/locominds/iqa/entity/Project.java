package com.locominds.iqa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="PROJECT")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long projectId;
	
	@Column(name = "PROJECT_NAME")
	private String projectName;

	@Column(name = "WORK_SPACE_ID")
	private Long workSpaceId;

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Long getWorkSpaceId() {
		return workSpaceId;
	}

	public void setWorkSpaceId(Long workSpaceId) {
		this.workSpaceId = workSpaceId;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", workSpaceId=" + workSpaceId
				+ "]";
	}
	
	

	

	
	
	
	
	

}
