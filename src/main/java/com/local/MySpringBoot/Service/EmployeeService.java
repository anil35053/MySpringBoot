package com.local.MySpringBoot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.local.MySpringBoot.Entity.Employee;
import com.local.MySpringBoot.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveData(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> getData() {
		return employeeRepository.findAll();
	}

	public List<Employee> updateData(Employee employee) {
		Employee emp = employeeRepository.save(employee);
		return employeeRepository.findAll();
	}

	public List<Employee> deleteData(Employee employee) {
		employeeRepository.deleteById(employee.getId());
		return employeeRepository.findAll();
	}

}
