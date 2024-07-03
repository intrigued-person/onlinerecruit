package com.shakeel.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shakeel.demo.model.Application;
import com.shakeel.demo.serviceimpl.ApplnServiceImpl;

@RestController
@RequestMapping("/app")
@CrossOrigin(origins = "http://localhost:3000")

public class AppController {

	@Autowired
	ApplnServiceImpl empservice;

	@PostMapping
	public String insertEmpl(@RequestBody Application emp, @RequestParam int pId) {
		return empservice.addEmp(emp, pId);

	}

	@GetMapping("{id}")
	public Application getEmployeeById(@PathVariable("id") int id) {
		return empservice.getApplication(id);
	}

	@GetMapping("/all")
	public List<Application> getEmployees() {
		return empservice.getAllApplication();
	}

	@PutMapping("{eid}")
	public String updationEmployee(@RequestBody Application emp, @PathVariable int eid) {
		return empservice.updateApplication(emp, eid);

	}

	@DeleteMapping("{id}")
	public String deleteEmployeetById(@PathVariable("id") int id) {
		String msg = "";
		try {
			empservice.deleteApplication(id);
			msg = "Success";
		} catch (Exception e) {
			msg = "Failure";
		}
		return msg;
	}

}
