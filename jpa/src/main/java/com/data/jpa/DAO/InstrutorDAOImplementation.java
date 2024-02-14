package com.data.jpa.DAO;

import com.data.jpa.Entity.Instructor;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
}
