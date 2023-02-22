package org.example.demo.Controllers;

import org.example.demo.Models.User;
import org.example.demo.Models.data.UserRepository;
import org.example.demo.Models.data.RelationshipListRepository;
import org.example.demo.Models.data.RoleListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleListRepository roleListRepository;

    @Autowired
    private RelationshipListRepository relationshipListRepository;

    @GetMapping("")
    private String index(Model model){
        model.addAttribute("users", userRepository.findAll());
        return "users/index";
    }




    @PostMapping("view/{userId}")
    public String displayViewUser (Model model, @PathVariable int userId){

        Optional optUser = userRepository.findById(userId);
        if(optUser.isPresent()){
            User user = (User) optUser.get();
            model.addAttribute("user", user);
            return "users/view";
        } else {
            return "redirect:../";
        }
    }


}

