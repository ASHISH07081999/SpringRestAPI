package com.springrest.springrest.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.course;

public interface CourseDao extends JpaRepository<course, Long> {

}
