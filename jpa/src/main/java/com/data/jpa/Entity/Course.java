package com.data.jpa.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "title", nullable = false,unique = true)
    private String title;

    @JoinColumn(name = "instructor_id")
    @ManyToOne
    private Instructor instructor;

    public Course(){}
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", instructor=" + instructor +
                '}';
    }
}
