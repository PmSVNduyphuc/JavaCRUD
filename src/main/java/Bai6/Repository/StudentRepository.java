package Bai6.Repository;

import Bai6.Model.TblStudent;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository
        extends JpaRepository<TblStudent, Integer> {
    List<TblStudent> findByName(String name);
}


