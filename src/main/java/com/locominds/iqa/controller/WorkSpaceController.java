package com.locominds.iqa.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locominds.iqa.entity.WorkSpace;
import com.locominds.iqa.repository.WorkSpaceRepository;
@RestController
@RequestMapping("/api/workspace")
public class WorkSpaceController {
	@Autowired
	private WorkSpaceRepository workSpaceRepository;
	
	
	
	@GetMapping("/getWorkspace")
	  public List<WorkSpace> getWorkspace() {

	return workSpaceRepository.findAll();
 
}

	
	
	 @PostMapping("/createWorkspace")
		  public WorkSpace saveWorkspace(@RequestBody WorkSpace workSpace) {
		 System.out.println(workSpace);
		return workSpaceRepository.save(workSpace);
	   
	  }

}
