package Bai6.service;

import Bai6.Model.TblClass;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ClassService {
    List<TblClass> getAll();

    void saveClass(TblClass tblClass);

    void deleteSubject(int id);

    Optional<TblClass> findClassById(int id);

    TblClass getOne(int id);

    List<TblClass> findClassByName(String name);

    Long getCountByName();
}