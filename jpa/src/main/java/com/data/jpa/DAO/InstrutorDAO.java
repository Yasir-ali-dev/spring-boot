package com.data.jpa.DAO;

import com.data.jpa.Entity.Instructor;

import java.util.List;

public interface InstrutorDAO {
    void save(Instructor instructor);
    Instructor findById(int id);
    void delete (int id);
    List<Instructor> findAll();
}
