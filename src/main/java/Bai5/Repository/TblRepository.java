package Bai5.Repository;

import Bai5.Model.TblSubject;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TblRepository extends JpaRepository<TblSubject,Integer> {
    List<TblSubject> findBySubjectName(String Name);
    List<TblSubject> findBySubjectSem(String sem);
    List<TblSubject> findBySubjectNameDesc(String Name);
    @Query("SELECT COUNT(s.Name)  FROM TblSubject s")
    Integer getCountByName();
    @Query("SELECT COUNT(s.sem)  FROM TblSubject s")
    Integer getCountBySem();

    void delete(Integer id);
}
