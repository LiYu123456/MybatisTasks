package com.tasks.controller;

import com.tasks.entity.Student;
import com.tasks.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/insertStudent")
    public void insertStudent(@RequestBody Student student){
        studentService.insertStudent(student);
    }

    @GetMapping("/selectStudentFromId")
    public Student selectStudentById(@RequestParam String studentId){
        return studentService.selectStudentById(studentId);
    }
}
