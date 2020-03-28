package com.tasks.service.impl;

import com.tasks.entity.Student;
import com.tasks.mapper.customer.StudentMapper;
import com.tasks.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int insertStudent(Student student) {
        return studentMapper.insertSelective(student);
    }

    @Override
    public Student selectStudentById(String studentId) {
        return studentMapper.selectByPrimaryKey(studentId);
    }
}
