package com.yasir.studentmvc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "roll_no", nullable = false)
    private String roll_no;

    @Column(name = "name" , nullable = false)
    private String name;

    @Column(name = "class", nullable = false)
    private String _class;
}
