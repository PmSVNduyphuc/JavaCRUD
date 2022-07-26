package Bai5.Service;

import Bai5.Model.TblSubject;
import Bai5.Repository.TblRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TblSubjectServiceImpl implements TblSubjectService{
@Autowired
    TblRepository tblRepository;
    @Override
    public List<TblSubject> getAllSubject() {
        return tblRepository.findAll();
    }

    @Override
    public TblSubject saveSubject(TblSubject tblSubject) {
        return tblRepository.save(tblSubject);
    }

    @Override
    public void deleteSubject(Integer id) {
        tblRepository.delete(id);
    }

    @Override
    public Optional<TblSubject> findSubjectById(Integer id) {
        return tblRepository.findById(id);
    }

    @Override
    public TblSubject getOne(Integer id) {
        return tblRepository.findById(id).get();
    }



    @Override
    public List<TblSubject> getTblSubjectByName(String Name) {
        return tblRepository.findBySubjectName(Name);
    }

    @Override
    public List<TblSubject> getTblSubjectBySem(String sem) {
        return tblRepository.findBySubjectSem(sem);
    }

    @Override
    public Integer getCountBySem() {
        return tblRepository.getCountBySem();
    }

    @Override
    public Integer getCountByName() {
        return tblRepository.getCountByName();
    }


}
