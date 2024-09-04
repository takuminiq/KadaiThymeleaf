package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {
    @PostMapping("/output")
    public String postOutput(@RequestParam("va1") String va1, Model model) {
        model.addAttribute("va1", va1);
        return "output";
    }
}
