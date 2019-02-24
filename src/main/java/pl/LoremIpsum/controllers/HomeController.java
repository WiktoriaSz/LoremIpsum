package pl.LoremIpsum.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.LoremIpsum.dao.LoremIpsumDao;

@Controller
public class HomeController {
    @Autowired
    private LoremIpsumDao loremIpsumDao;

    @GetMapping("/")
    public String form() {
        return "index";
    }

    @PostMapping("/lorem_ipsum")
    public String getLoremIpsum(@RequestParam(required = false, value = "option") String option,
                                @RequestParam(required = false) Integer amount,
                                ModelMap map) {
        map.addAttribute("amunt", amount);
        if (option.equals("words")) {
            map.addAttribute("lorem", loremIpsumDao.getWords(amount));
        }
        if (option.equals("paragraphs")){
            map.addAttribute("lorem", loremIpsumDao.getParagraphs(amount));
        }

        return "lorem";
    }
}
