package com.fastboot.api;

import com.fastboot.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> selectAllStudent();
}
