package Bai6.Controller;

import Bai6.Model.TblMarks;
import Bai6.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/mark")
public class MarkController {
    @Autowired
    MarkService markService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<List<TblMarks>> listAllMarks() {
        List<TblMarks> list = markService.getAll();
        if (list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(list, HttpStatus.OK);
        }
    }

    @PostMapping(value = "/save")
    public ResponseEntity<TblMarks> saveMark(@RequestBody TblMarks marks) {
        markService.saveMarks(marks);
        return ResponseEntity.ok(marks);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<TblMarks> findById(@PathVariable("id") int id) {
        TblMarks marks = markService.getOne(id);
        return new ResponseEntity<>(marks, HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<TblMarks> updateMark(@PathVariable("id") int id,
                                               @RequestBody TblMarks mark) {
        TblMarks oldMarks = markService.getOne(id);
        if (oldMarks == null) {
            return ResponseEntity.notFound().build();
        } else {
            oldMarks.setMark(mark.getMark());
            oldMarks.setNote(mark.getNote());
            return ResponseEntity.ok(oldMarks);
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<TblMarks> deleteMark(@PathVariable("id") int id) {
        Optional<TblMarks> marks = markService.findMarksById(id);
        if (marks == null) {
            return ResponseEntity.notFound().build();
        } else {
            markService.deleteMarks(id);
            return ResponseEntity.ok().build();
        }
    }
}