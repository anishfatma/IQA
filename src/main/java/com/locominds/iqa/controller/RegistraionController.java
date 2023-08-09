package com.locominds.iqa.controller;






import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.locominds.iqa.entity.Registration;

@RestController
@RequestMapping("/api/registration")
public class RegistraionController {
	
	
	 @PostMapping("/createAccount")
	 public Registration createAccount(@RequestBody Registration registration) {
		 System.out.println(registration);
		 
		  return registration;
		 
		
	  }

}
