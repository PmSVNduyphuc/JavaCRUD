package com.example.demo.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StdServiceImpl implements StdService{
    @Autowired
    private StdRepository stdRepository;

    @Override
    public List<Student> getAllStudent() {
        return stdRepository.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        stdRepository.save(student);
    }

    @Override
    public void deleteStudent(Integer id) {
        stdRepository.delete(id);
    }

    @Override
    public Optional<Student> findStudentById(Integer id) {
        return stdRepository.findById(id);
    }

    @Override
    public Student getOne(Integer id) {
        return stdRepository.findById(id).get();
    }

    @Override
    public List<Student> getMaSV(String MaSV) {
        return stdRepository.findByMaSV(MaSV);
    }

    @Override
    public List<Student> getStudentEmail(String email) {
        return stdRepository.findByEmail(email);
    }

    @Override
    public List<Student> getStudentPhone(String phone) {
        return stdRepository.findByPhone(phone);
    }

}
