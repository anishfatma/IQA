package com.locominds.iqa.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locominds.iqa.entity.Project;
import com.locominds.iqa.repository.ProjectRepository;
@RestController
@RequestMapping("/api/project")
public class ProjectController {
	@Autowired
	private ProjectRepository projectRepository;
	
	
	
	
	@PostMapping("/getProject")
	  public List<Project> getProject(@RequestBody Integer workSpaceId) {
		

	return projectRepository.findByWorkSpaceId(Long.valueOf(workSpaceId));
 
}

	
	
	 @PostMapping("/createProject")
		  public Project createProject(@RequestBody Project project) {
		 System.out.println(project);
		
		return projectRepository.save(project);
	   
	  }

}
