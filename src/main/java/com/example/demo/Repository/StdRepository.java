package com.example.demo.Repository;

import com.example.demo.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StdRepository extends JpaRepository<Student,Integer> {
    List<Student> findByMaSV(String MaSV);

    List<Student> findByEmail(String email);

    List<Student> findByPhone(String phone);


    void delete(Integer id);
}
