package hibernate.Controller;

import hibernate.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import hibernate.service.userService;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/Users")
public class UserController {
    //inject the user service
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

        //Delete the user
        us.deleteUser(theId);

        return "redirect:/Users/list";
    }

    @RequestMapping("/list")
    public String userList(Model theModel) {
        //get users from service
        List<Users> userList = us.getUserList();

        //add the list of users to the model
        theModel.addAttribute("users", userList);

        //return the name of the view
        return "Summary";
    }

    @GetMapping("/showAddUserForm")
    public String showAddUserForm(Model theModel) {
        Users newUser = new Users();

        theModel.addAttribute("user", newUser);

        return "user-form";
    }

    @RequestMapping("/showUpdateUsersForm")
    public String showUpdateUsersForm(@RequestParam("userID") int userID, Model theModel){
        // Get user from the database
        Users theUser = us.getUser(userID);

        // Set user as a model attribute to pre-populate the form
        theModel.addAttribute("user", theUser);

        // Return the view
        return "Summary";
    }


    @PostMapping("/save")
    public String createUser(@ModelAttribute(name="user") Users newUser) {


        us.createUser(newUser);
        return "redirect:/Users/list";
    }


}
