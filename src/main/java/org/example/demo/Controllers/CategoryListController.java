package org.example.demo.Controllers;

import org.example.demo.Models.data.CategoryListRepository;
import org.example.demo.Models.data.FilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping(value = "list")
public class CategoryListController {

    @Autowired
    CategoryListRepository categoryListRepository;

    @Autowired
    FilesRepository filesRepository;

    static HashMap<String, String> columnChoices = new HashMap<>();

    public CategoryListController() {
        columnChoices.put("all", "All");
        columnChoices.put("records", "Records");
        columnChoices.put("users", "Users");
    }

    @RequestMapping("")
    public String CategoryList(Model model) {
        model.addAttribute("categoryList", CategoryListRepository.findAll());
        model.addAttribute("records", FilesRepository.findAll());
        return "categoryList";
    }
};
