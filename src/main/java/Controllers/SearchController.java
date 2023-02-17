package Controllers;


import Models.CategoryData;
import Models.RecordsList;
import Models.data.RecordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static Controllers.CategoryListController.columnChoices;

@Controller
@RequestMapping("search")
public class SearchController {

    @Autowired
    private RecordsRepository recordsRepository;

    @RequestMapping("")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
    }

    @PostMapping("results")
    public String displaySearchResults(Model model, @RequestParam String searchType, @RequestParam String searchTerm){
        Iterable<RecordsList> records;
        if(searchTerm.toLowerCase().equals("all")|| searchTerm.equals("")){
            records = recordsRepository.findAll();
        } else {
            records = CategoryData.findByColumnAndValue(searchType, searchTerm, recordsRepository.findAll());
        }
        model.addAttribute("columns", columnChoices);
        model.addAttribute("title", "Records with " + columnChoices.get(searchType) + ": " + searchTerm);
        model.addAttribute("records", records);

        return "search";
    }
}
