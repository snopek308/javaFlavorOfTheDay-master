package hibernate.Controller;

import hibernate.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.userService;

import java.util.List;

@Controller
@RequestMapping("/Users")
public class UserController {
    @Autowired
    private userService us;

    @GetMapping("/search")
    public String search(@RequestParam("searchTerm") int userID,
                         Model theModel) {
        List<Users> list = us.getUserID(userID);

        theModel.addAttribute("users", list);

        return "/Summary";
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam("userID") int theId) {
        us.deleteUser(theId);

        return "redirect:/index/Summary";
    }

    @RequestMapping("/list")
    public String listDonuts(Model theModel) {
        List<Users> donutList = us.getUsers();

        theModel.addAttribute("donuts", donutList);

        return "pm/list-donuts";
    }

    @GetMapping("/showAddUserForm")
    public String showAddDonutForm(Model theModel) {
        Users newUser = new Users();

        theModel.addAttribute("aUser", newUser);

        return "/index";
    }


}
