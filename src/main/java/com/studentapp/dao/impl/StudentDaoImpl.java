package com.studentapp.dao.impl;

import com.studentapp.dao.StudentDao;
import com.studentapp.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Customizer;
import java.util.List;
@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Transactional
    public boolean saveStudent(Student student) {
        hibernateTemplate.save(student);
        return true;
    }
    @Transactional
    public boolean updateStudent(Student student) {
        hibernateTemplate.update(student);
        return true;
    }

    public Student getStudent(long id) {
       return hibernateTemplate.get(Student.class,id);
    }
    @Transactional
    public boolean deleteStudent(long id) {
        Student student = hibernateTemplate.get(Student.class, id);
        hibernateTemplate.delete(student);
        return true;
    }

    public List<Student> getAllStudents() {
       return hibernateTemplate.loadAll(Student.class);
    }
}
