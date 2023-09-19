package com.studentapp.dao;

import com.studentapp.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentDao {
    public boolean saveStudent(Student student);
    public boolean updateStudent(Student student);
    public Student getStudent(long id);
    public boolean deleteStudent(long id);
    public List<Student> getAllStudents(); // pagination -> offset
}
