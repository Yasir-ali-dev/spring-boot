package com.hibernate.teacher.DAO;

import com.hibernate.teacher.Entity.Teacher;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class TeacherDAOImpl implements TeacherDAO {
    private EntityManager entityManager;

    @Autowired
    public TeacherDAOImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    @Override
    @Transactional
    public void create(Teacher teacher) {
        entityManager.persist(teacher);
    }

    @Override
    @Transactional
    public void createMultipleTeachers(List<Teacher> teachers) {
        for (Teacher teacher :  teachers) {
            entityManager.persist(teacher);
        }
    }

    @Override
    public Teacher findById(int id) {
        Teacher teacher = entityManager.find(Teacher.class,id);
        return teacher;
    }

    @Override
    public List<Teacher> findByName(String name) {
        TypedQuery <Teacher> query = entityManager.createQuery("FROM Teacher WHERE name=:theName", Teacher.class);
        query.setParameter("theName",name);
        List<Teacher> teachers = query.getResultList();
        return teachers;

    }

    @Override
    @Transactional
    public Teacher update(int id, String name,String subject) {
        Teacher teacher= entityManager.find(Teacher.class,id);
        if(teacher != null){
            teacher.setName(name);
            teacher.setSubject(subject);
            entityManager.merge(teacher);
            return teacher;
        }
        return null;
    }

    @Override
    public List<Teacher> findAll() {
        TypedQuery <Teacher> query = entityManager.createQuery("FROM Teacher", Teacher.class);
        List<Teacher> teachers = query.getResultList();
        return teachers;
    }

    @Override
    @Transactional
    public void delete(int id) {
        Teacher teacher = entityManager.find(Teacher.class,id);
        entityManager.remove(teacher);
    }
}
