package com.locominds.iqa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WORK_SPACE")
public class WorkSpace {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long workSpaceId;
	@Column(name = "WORK_SPACE_NAME")
	private String workSpaceName;
	
	
	public Long getWorkSpaceId() {
		return workSpaceId;
	}
	public void setWorkSpaceId(Long workSpaceId) {
		this.workSpaceId = workSpaceId;
	}
	public String getWorkSpaceName() {
		return workSpaceName;
	}
	public void setWorkSpaceName(String workSpaceName) {
		this.workSpaceName = workSpaceName;
	}
	
	
	
	@Override
	public String toString() {
		return "WorkSpace [workSpaceId=" + workSpaceId + ", workSpaceName=" + workSpaceName + "]";
	}
	
	

}
