package com.ashish.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.entity.Emp;
import com.ashish.repository.empRepository;
@RestController
@RequestMapping("/emp")
public class EmpController {
 
	@Autowired
	empRepository Repo;
	
	@PostMapping("/add")
	public Emp add(@RequestBody Emp emp) {
		return Repo.save(emp);
	}
	@GetMapping("/all")
	public List <Emp> getAll() {
		return Repo.findAll();
	}
	@PutMapping("/update/{id}")
	public Emp update(@PathVariable int id,@RequestBody Emp emp) {
		emp.setId(id);
		return Repo.save(emp);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteEmp(@PathVariable int id) {
    	 Repo.deleteById(id);
    	 return "Emplpyee delete successfully";
	}
}
