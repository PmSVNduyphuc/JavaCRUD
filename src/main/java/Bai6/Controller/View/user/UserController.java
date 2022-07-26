package Bai6.Controller.View.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user/userList")
    public String showUserList() {
        return "listStudent";
    }
}
