package Controllers;

import Models.UserList;
import Models.data.UserListRepository;
import Models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.management.relation.RoleList;
import javax.persistence.Entity;
import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserListRepository userListRepository;

    @Autowired
    private RoleList roleListRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    private String index(Model model){
        model.addAttribute("users", userListRepository.findAll());
        return "users/index";
    }

    @GetMapping("add")
    private String displayAddUserForm(Model model){
        model.addAttribute(new UserList());
        return "users/add";
    }

    @PostMapping("add")
    public String processAddUserForm(@ModelAttribute @Valid UserList newUser, Errors errors, Model model){
        if(errors.hasErrors()){
            model.addAttribute("users", newUser);
            return "users/add";
        }
        model.addAttribute("users", newUser);
        userListRepository.save(newUser);
        return "redirect:";
    }
    @PostMapping("view/{userId}")
    public String displayViewUser (Model model, @PathVariable int userId){

        Optional<UserList> optUserList = userListRepository.findById(userId);
        if(optUserList.isPresent()){
            UserList userList = (UserList) optUserList.get();
            model.addAttribute("users", userList);
            return "users/view";
        } else {
            return "redirect:../";
        }
    }


}

