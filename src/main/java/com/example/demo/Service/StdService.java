package com.example.demo.Service;

import com.example.demo.Model.Student;

import java.util.List;
import java.util.Optional;

public interface StdService {
    List<Student> getAllStudent();

    void saveStudent(Student student);

    void deleteStudent(Integer id);

    Optional<Student> findStudentById(Integer id);

    Student getOne(Integer id);

    List<Student> getMaSV(String maSV);

    List<Student> getStudentEmail(String email);

    List<Student> getStudentPhone(String phone);
}
