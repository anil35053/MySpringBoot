package com.local.MySpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.local.MySpringBoot.Entity.Employee;
import com.local.MySpringBoot.Service.EmployeeService;

@RestController
public class MyController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/messag")
	public String message() {
		return "Welcome Anil....";
	}

	@PostMapping("/saveData")
	public Employee saveData(@RequestBody Employee employee) {
		return employeeService.saveData(employee);
	}

	@GetMapping("/getData")
	public List<Employee> getData() {
		return employeeService.getData();
	}

	@PutMapping("/updateData")
	public List<Employee> updateData(@RequestBody Employee employee) {
		return employeeService.updateData(employee);
	}

	@DeleteMapping("/deleteData")
	public List<Employee> deleteData(@RequestBody Employee employee) {
		return employeeService.deleteData(employee);

	}

}
