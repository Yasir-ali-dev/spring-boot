package com.teacher_rest.api.DAO;

import com.teacher_rest.api.Entity.Teacher;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeacherDAOJPAImpl implements TeacherDAO{
    private EntityManager entityManager;

    @Autowired
    TeacherDAOJPAImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    @Override
    public List<Teacher> findAll() {
        TypedQuery<Teacher> query = entityManager.createQuery("FROM Teacher", Teacher.class);
        return query.getResultList();
    }

    @Override
    public Teacher findById(int id) {
       return entityManager.find(Teacher.class,id);
    }

    @Override
    public Teacher save(Teacher teacher) {
        Teacher teacher1= entityManager.merge(teacher);
        return teacher1;
    }

    @Override
    public void deleteById(int id) {
        Teacher teacher = entityManager.find(Teacher.class,id);
        entityManager.remove(teacher);
    }


}
