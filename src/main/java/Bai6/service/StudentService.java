package Bai6.service;

import Bai6.Model.TblStudent;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<TblStudent> getAll();

    void saveStudent(TblStudent tblStudent);

    void deleteStudent(int id);

    Optional<TblStudent> findStudentById(int id);

    TblStudent getOne(int id);

    List<TblStudent> findStudentByName(String name);


}