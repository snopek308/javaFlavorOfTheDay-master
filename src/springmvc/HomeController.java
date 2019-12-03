package springmvc;


import hibernate.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.userService;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showMainMenu(Model theModel) {
        // /WEB-INF/view/main-menu.jsp
        Users u = new Users();
            theModel.addAttribute("Users", u);
            return "index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute(name = "Users") Users theUsers){
            userService.saveUser(theUsers);
            return "redirect:/Summary";
        }

    }

}
