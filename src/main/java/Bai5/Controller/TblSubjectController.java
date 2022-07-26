package Bai5.Controller;


import Bai5.Model.TblSubject;
import Bai5.Service.TblSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.element.Name;
import java.util.List;
import java.util.Optional;

@RestController
public class TblSubjectController {
    @Autowired
    TblSubjectService tblSubjectService;
    @RequestMapping(value = "/Subject",method = RequestMethod.GET)
    public ResponseEntity<List<TblSubject>> listAll(){
        List<TblSubject> tblSubjects = tblSubjectService.getAllSubject();
        if (tblSubjects == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
    @RequestMapping(value = "/Subject",method = RequestMethod.POST)
    public ResponseEntity<List<TblSubject>> saveSubject(@RequestBody TblSubject tblSubject){
        tblSubjectService.saveSubject(tblSubject);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @RequestMapping(value = "Subject/{id}",method = RequestMethod.GET)
    public ResponseEntity<TblSubject> getOne(@PathVariable Integer id){
        TblSubject tblSubject = tblSubjectService.getOne(id);
        return new ResponseEntity<>(tblSubject,HttpStatus.OK);
    }
    @RequestMapping(value = "/Subject/{id}",method = RequestMethod.PUT)
    public ResponseEntity<TblSubject> updateTblSubject(@PathVariable("id") Integer id,@RequestBody TblSubject tblSubject){
        TblSubject updateTblSubject = tblSubjectService.getOne(id);
        if (updateTblSubject==null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            updateTblSubject.setName(tblSubject.getName());
            updateTblSubject.setDescription(tblSubject.getDescription());
            updateTblSubject.setDuration(tblSubject.getDuration());
            updateTblSubject.setSem(tblSubject.getSem());
            tblSubjectService.saveSubject(tblSubject);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
    @RequestMapping(value ="/Subject/{id}",method = RequestMethod.DELETE )
    public ResponseEntity<TblSubject> deleteSubject(@PathVariable("id")Integer id){
        Optional<TblSubject> deleteTblSubject = tblSubjectService.findSubjectById(id);
        if (deleteTblSubject==null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            tblSubjectService.deleteSubject(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
    @RequestMapping(value = "/Subject/ByName",method = RequestMethod.GET)
    public ResponseEntity<TblSubject> getTblSubjectName(@RequestParam String Name){
        return  new ResponseEntity<>((TblSubject) tblSubjectService.getTblSubjectByName(Name),HttpStatus.OK);
    }
    @RequestMapping(value = "/Subject/BySem",method = RequestMethod.GET)
    public ResponseEntity<TblSubject> getTblSubjectSem(@RequestParam String sem){
        return  new ResponseEntity<>((TblSubject) tblSubjectService.getTblSubjectBySem(sem),HttpStatus.OK);
    }
    @RequestMapping(value = "/Subject/CountName",method = RequestMethod.GET)
    public ResponseEntity<Integer> getCountByName(){
        Integer tblSubject =tblSubjectService.getCountByName();
        return new ResponseEntity<>( tblSubject,HttpStatus.OK);
    }
    @RequestMapping(value = "/Subject/CountSem",method = RequestMethod.GET)
    public ResponseEntity<Integer> findBySubjectSem(@RequestParam("sem")Integer sem){
        Integer tblSubject = tblSubjectService.getCountBySem();
        return new ResponseEntity<>( tblSubject,HttpStatus.OK);
    }
}
