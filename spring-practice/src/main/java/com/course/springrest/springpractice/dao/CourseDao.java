package com.course.springrest.springpractice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.springrest.springpractice.entity.CoursesDB;


@Repository
public interface CourseDao extends JpaRepository<CoursesDB, Long>{

}
