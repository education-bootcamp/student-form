package com.studentapp.dao.impl;

import com.studentapp.dao.StudentDao;
import com.studentapp.entity.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.beans.Customizer;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private HibernateTemplate hibernateTemplate;

    public boolean saveStudent(Student student) {
        hibernateTemplate.save(student);
        return true;
    }

    public boolean updateStudent(Student student) {
        hibernateTemplate.update(student);
        return true;
    }

    public Student getStudent(long id) {
       return hibernateTemplate.get(Student.class,id);
    }

    public boolean deleteStudent(long id) {
        Student student = hibernateTemplate.get(Student.class, id);
        hibernateTemplate.delete(student);
        return true;
    }

    public List<Student> getAllStudents() {
       return hibernateTemplate.loadAll(Student.class);
    }
}
