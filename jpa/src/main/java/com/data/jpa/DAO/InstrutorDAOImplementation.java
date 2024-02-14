package com.data.jpa.DAO;

import com.data.jpa.Entity.Instructor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class InstrutorDAOImplementation implements InstrutorDAO{
    private EntityManager entityManager;

    @Autowired
    public  InstrutorDAOImplementation(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    @Transactional
    @Override
    public void save(Instructor instructor) {
        entityManager.persist(instructor);
    }

    @Override
    public Instructor findById(int id) {
       return entityManager.find(Instructor.class,id);
    }

    @Override
    public List<Instructor> findAll() {
        TypedQuery<Instructor> query = entityManager.createQuery("FROM Instructor", Instructor.class);
        List<Instructor> instructors = query.getResultList();
        return  instructors;
    }

    @Transactional
    @Override
    public void delete(int id) {
        Instructor instructor = entityManager.find(Instructor.class,id);
        entityManager.remove(instructor);
    }

    @Override
    @Transactional
    public Instructor update(Instructor instructor) {
          return entityManager.merge(instructor);
    }
}
