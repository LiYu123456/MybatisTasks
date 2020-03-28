package com.tasks.service;

import com.tasks.entity.Student;

public interface StudentService {
    int insertStudent(Student student);
    Student selectStudentById(String studentId);
}
