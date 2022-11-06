package com.course.springrest.springpractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.course.springrest.springpractice.request.Courses;
import com.course.springrest.springpractice.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService service;
	
	@PostMapping("/courses")
	public Courses addCouses(@RequestBody Courses course) {
		return service.addCousesServices(course);
	}
	@GetMapping("/courses")
	public List<Courses> getAllCouses() {
		return service.getAllCousesServicesCourses();
	}

}
