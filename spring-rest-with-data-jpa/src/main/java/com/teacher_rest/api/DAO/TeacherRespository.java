package com.teacher_rest.api.DAO;

import com.teacher_rest.api.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "members")
public interface TeacherRespository extends JpaRepository<Teacher,Integer> {

}
