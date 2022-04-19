package com.zmz.mapper;

import com.zmz.bean.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selectAllStudent();

    Student selectStudentByName(String name);

}
