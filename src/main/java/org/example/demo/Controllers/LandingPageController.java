package org.example.demo.Controllers;

import org.example.demo.Models.User;

import org.example.demo.Models.data.RelationshipListRepository;
import org.example.demo.Models.data.RoleListRepository;

import org.example.demo.Models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("admin")

public class LandingPageController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleListRepository roleRepository;

    @Autowired
    private RelationshipListRepository relationshipListRepository;



    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("title", "All Users");
        model.addAttribute("users");
        return "admin/add";
    }
    @GetMapping("adduser")
    private String displayAddUserForm(Model model){
        model.addAttribute("title", "Add User");
        model.addAttribute("user", new User());
        model.addAttribute("role", userRepository.findAll());
        model.addAttribute("relationship", userRepository.findAll());

        return "admin/add";
    }

    @PostMapping("adduser")
    public String processAddUserForm(@ModelAttribute @Valid User newUser, Errors errors, Model model){
        if(errors.hasErrors()){
            model.addAttribute("title", "Add User");
            return "admin/add";
        }

        userRepository.save(newUser);
        return "redirect:";
    }

}
