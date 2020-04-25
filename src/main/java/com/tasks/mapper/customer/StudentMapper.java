package com.tasks.mapper.customer;

import com.tasks.entity.Student;
import com.tasks.mapper.IBaseMapper;
import org.springframework.stereotype.Repository;

/**
 * Mapper:基本的增删改查
 * MySqLMapper: 针对MySQL的额外接口,支持批量插入
 */
@Repository
public interface StudentMapper extends IBaseMapper<Student> {
    String selectStudentAndClasses();
}
