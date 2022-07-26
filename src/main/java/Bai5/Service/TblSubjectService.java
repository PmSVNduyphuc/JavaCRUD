package Bai5.Service;

import Bai5.Model.TblSubject;

import java.util.List;
import java.util.Optional;

public interface TblSubjectService {
    List<TblSubject> getAllSubject();

    TblSubject saveSubject(TblSubject tblSubject);

    void deleteSubject(Integer id);

    Optional<TblSubject> findSubjectById(Integer id);

    TblSubject getOne(Integer id);


    List<TblSubject> getTblSubjectByName(String Name);

    List<TblSubject> getTblSubjectBySem(String sem);
    Integer getCountBySem();
    Integer getCountByName();
}
