package com.fastboot.api;

import com.fastboot.bean.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> selectAllStudent();
}
