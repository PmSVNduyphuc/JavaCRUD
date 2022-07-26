package Bai6.Controller.View.admin;

import Bai6.Model.TblStudent;
import Bai6.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    StudentService studentService;

    @GetMapping("/admin/list")
    public String showUserList(Model model) {
        List<TblStudent> list = studentService.getAll();
        model.addAttribute("list", list);
        return "listStudent";
    }
}