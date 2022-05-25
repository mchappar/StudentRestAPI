package com.springboot.demoapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	//http:localhost:8080/student
	
	@GetMapping("/student")
	public Student getStudentInfo()
	{
		return  new Student("Madhura","Chappar",50);
	}
	
	//http:localhost:8080/studentlist
	
	@GetMapping("/studentlist")
	public List<Student> getStudentList()
	{
		List<Student> list = new ArrayList<>();
		list.add(new Student("Manoj","Chappar", 50));
		list.add(new Student ("Shrinivas","Gotur",51));
		return list;
		
	}
	
	
	//http:localhost:8080/student/madhura/chappar/50
	//@PathAnnotation
	
	
	@GetMapping("student/{fName}/{lName}/{rNo}")
	public Student studentPathVariable(@PathVariable("fName") String firstName, @PathVariable("lName") String lastName,@PathVariable("rNo") int regNo)
	{
		return new Student(firstName, lastName, regNo);
	}
}
