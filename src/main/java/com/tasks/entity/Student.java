package com.tasks.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name="student")
@Data
public class Student implements Serializable {
    @Id
    @Column(name="student_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    @Column(name="student_name")
    private String studentName;
    @Column(name="age")
    private String age;
    @Column(name="gender")
    private String gender;
    @Column(name="hoddy")
    private String hoddy;
    @Column(name="birthday")
    private Date birthday;
    @Column(name="carNo")
    private String carNo;
}
