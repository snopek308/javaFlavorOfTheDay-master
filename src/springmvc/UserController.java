package springmvc;

import hibernate.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/createUser")
    public String addUser(Model theModel){
        Users u = new Users();
       theModel.addAttribute("Users", u);
       return "Summary";
    }

    public String deleteUser(Model theModel){
        Users s = new Users();
        return "Summary";
    }

}
