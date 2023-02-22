package org.example.demo.Controllers;


import org.example.demo.Models.CategoryData;
import org.example.demo.Models.RecordsList;
import org.example.demo.Models.data.FilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.example.demo.Controllers.CategoryListController.columnChoices;

@Controller
@RequestMapping("search")
public class SearchController {

    @Autowired
    private FilesRepository filesRepository;

    @RequestMapping("")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
    }

    @PostMapping("results")
    public String displaySearchResults(Model model, @RequestParam String searchType, @RequestParam String searchTerm){
        Iterable<RecordsList> records;
        if(searchTerm.toLowerCase().equals("all")|| searchTerm.equals("")){
            records = (Iterable<RecordsList>) FilesRepository.findAll();
        } else {
            records = CategoryData.findByColumnAndValue(searchType, searchTerm, FilesRepository.findAll());
        }
        model.addAttribute("columns", columnChoices);
        model.addAttribute("title", "Records with " + columnChoices.get(searchType) + ": " + searchTerm);
        model.addAttribute("records", records);

        return "search";
    }
}
