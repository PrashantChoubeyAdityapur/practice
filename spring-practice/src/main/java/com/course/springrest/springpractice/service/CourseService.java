package com.course.springrest.springpractice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.springrest.springpractice.dao.CourseDao;
import com.course.springrest.springpractice.entity.CoursesDB;
import com.course.springrest.springpractice.request.Courses;

@Service
public class CourseService {
	
	@Autowired
	CourseDao dao;
	
	public List<Courses> getAllCousesServicesCourses() {
		List<CoursesDB> dbOutput=dao.findAll();
		//converting CoursesDB to Courses
		List<Courses> outputCouses=dbOutput.stream().map(db->new Courses(db.getId(),db.getName(),db.getDescription())).collect(Collectors.toList());
		
		return outputCouses;
	}
	public Courses addCousesServices(Courses course) {
		CoursesDB db=new CoursesDB();
		db.setDescription(course.getDescription());
		db.setName(course.getName());
		
		//saved in DB
		CoursesDB outputData=dao.save(db);
		
		Courses out=new Courses();
		out.setId(outputData.getId());
		out.setName(outputData.getName());
		out.setDescription(outputData.getDescription());
		
		return out;
		
	}

}
