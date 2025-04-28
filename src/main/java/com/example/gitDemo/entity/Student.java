package com.example.gitDemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_student")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="studentId")
    private long studentId;

    @Column(name="name")
    private String name;

    @Column(name="department")
    private String department;

}
