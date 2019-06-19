package com.fuel.gasoline;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/main")
    public String main(@RequestParam(name="name", required=false, defaultValue="Вид бензина:") String name, Model model) {
        model.addAttribute("name", name);

        return "main";
    }

    @PostMapping("/main")
    public String change(Model model) {
            int t =1;
            model.addAttribute("name", "АИ-92");
            return "main";
    }
//    public String calc1(@RequestParam int money, @RequestParam String name, Model model) {
//        double res = 0;
//        if (name == "АИ-92") {
//            res = money / 42.27;
//            model.addAttribute("res", res);
//        } else {
//            model.addAttribute("err", "Вид бензина не выбран!");
//        }
//        return "main";
//    }

//    @PostMapping("/main")
//    public String calc(@RequestParam int money, int t, Model model) {
//        double res = 0;
//        if (t == 1) {
//            res = money / 42.27;
//            model.addAttribute("res", res);
//        } else if (t == 2) {
//            res = money / 45.55;
//            model.addAttribute("res", res);
//        } else if (t == 3) {
//            res = money / 46.18;
//            model.addAttribute("res", res);
//        } else if (t == 4) {
//            res = money / 48.20;
//            model.addAttribute("res", res);
//        } else if (t == 5) {
//            res = money / 21.90;
//            model.addAttribute("res", res);
//        } else {
//            model.addAttribute("err", "Вид бензина не выбран!");
//        }
//        return "main";
//    }
}