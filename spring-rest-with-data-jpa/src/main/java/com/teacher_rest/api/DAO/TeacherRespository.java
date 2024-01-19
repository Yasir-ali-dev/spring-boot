package com.teacher_rest.api.DAO;

import com.teacher_rest.api.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRespository extends JpaRepository<Teacher,Integer> {

}
