package com.example.demo.Controller;

import com.example.demo.Model.Student;
import com.example.demo.Service.StdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StdController {
    @Autowired
    StdService stdService;
    @RequestMapping(value = "/Student" ,method = RequestMethod.GET)
    public ResponseEntity<List<Student>> listAllStd(){
        List<Student> list = stdService.getAllStudent();
        if (list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @RequestMapping(value = "/Student" ,method = RequestMethod.POST)
    public ResponseEntity<List<Student>> saveStudent(@RequestBody Student student){
        stdService.saveStudent(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @RequestMapping(value = "/student/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Student> updateStudent(@PathVariable("id") Integer id,
                                                 @RequestBody Student student) {
        Student oldStudent = stdService.getOne(id);
        if (oldStudent == null) {
            return ResponseEntity.notFound().build();
        } else {
            oldStudent.setMaSV(student.getMaSV());
            oldStudent.setName(student.getName());
            oldStudent.setEmail(student.getEmail());
            oldStudent.setPhone(student.getPhone());
            stdService.saveStudent(oldStudent);
            return ResponseEntity.ok(oldStudent);
        }
    }
    @RequestMapping(value = "/Student/{id}" , method = RequestMethod.DELETE)
    public  ResponseEntity<Student> deleteStudent(@PathVariable("id")Integer id){
        Optional<Student> Idstudent = stdService.findStudentById(id);
        if (Idstudent ==null){
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            stdService.deleteStudent(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
    @RequestMapping(value = "/Student/{id}",method = RequestMethod.GET)
    public ResponseEntity<Student> getMaSV(@PathVariable("id")Integer id){
        Student student = stdService.getOne(id);
        return new ResponseEntity<>(student,HttpStatus.OK);
    }
    @RequestMapping(value = "/Student/ById",method = RequestMethod.GET)
    public ResponseEntity<Student> getStudentById(@RequestParam String MaSV){
        return  new ResponseEntity<>((Student) stdService.getMaSV(MaSV),HttpStatus.OK);
    }
    @RequestMapping(value = "/Student/ByEmail",method = RequestMethod.GET)
    public ResponseEntity<Student> getStudentByEmail(@RequestParam String email){
        return new ResponseEntity<>((Student)stdService.getStudentEmail(email),HttpStatus.OK);
    }
    @RequestMapping(value = "/Student/ByPhone",method = RequestMethod.GET)
    public ResponseEntity<Student> getStudentByPhone(@RequestParam String phone){
        return new ResponseEntity<>((Student)stdService.getStudentPhone(phone),HttpStatus.OK);
    }

}
