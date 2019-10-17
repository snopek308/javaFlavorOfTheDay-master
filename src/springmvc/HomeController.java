package springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showMainMenu() {
        // /WEB-INF/view/main-menu.jsp
        return "index";
    }
}