package com.fastboot.controller;

import com.fastboot.api.StudentService;
import com.fastboot.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("/list")
    List<Student> list(){
        return studentService.selectAllStudent();
    }

}
