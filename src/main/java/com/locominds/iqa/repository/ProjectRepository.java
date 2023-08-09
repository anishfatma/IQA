package com.locominds.iqa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locominds.iqa.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
	
	public List<Project> findByWorkSpaceId(Long workSpaceId);

}
