package com.fastboot.business;


import com.fastboot.api.StudentService;
import com.fastboot.dao.StudentMapper;
import com.fastboot.entity.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectAllStudent() {
        return studentMapper.selectByExample(null);
    }
}
