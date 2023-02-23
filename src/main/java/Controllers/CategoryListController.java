package Controllers;

import Models.data.CategoryListRepository;
import Models.data.RecordsRepository;
import Models.data.UserListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
@RequestMapping(value = "list")
public class CategoryListController {

    @Autowired
    UserListRepository userListRepository;

    @Autowired
    RecordsRepository recordsRepository;

    static HashMap<String, String> columnChoices = new HashMap<>();

    public CategoryListController() {
        columnChoices.put("all", "All");
        columnChoices.put("records", "Records");
        columnChoices.put("users", "Users");
    }

    @RequestMapping("")
    public String CategoryList(Model model) {
        model.addAttribute("categoryList", UserListRepository.findAll());
        model.addAttribute("records", RecordsRepository.findAll());
        return "categoryList";
    }
};
