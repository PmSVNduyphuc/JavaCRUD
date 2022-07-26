package Bai6.service;

import Bai6.Model.TblSubject;
import Bai6.dto.SubjectCount;

import java.util.List;
import java.util.Optional;

public interface SubjectService {
    List<TblSubject> getAll();

    void saveSubject(TblSubject tblSubject);

    void deleteSubject(long id);

    Optional<TblSubject> findSubjectById(long id);

    TblSubject getOne(long id);

    List<TblSubject> findSubjectByName(String name);

    List<TblSubject> findSubjectBySem(Integer sem);

    List<TblSubject> getAllByOrderByNameDesc();

    Long getCountByName();

    List<SubjectCount> countBySem();
}