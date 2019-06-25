package com.fuel.gasoline;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public String redirect() {
        return "redirect";
    }

    //Бензин не выбран
    @GetMapping("/main")
    public String main(@RequestParam(name = "name", required = false, defaultValue = "Вид бензина:") String name, Model model) {
        model.addAttribute("name", name);
        return "main";
    }

    @PostMapping("/main")
    public String error(Model model) {
        model.addAttribute("err", "Вид бензина не выбран!");
        return "main";
    }

    //АИ-92
    @GetMapping("/a92")
    public String a92(@RequestParam(name = "name", required = false, defaultValue = "АИ-92") String name, Model model) {
        model.addAttribute("name", name);
        return "main";
    }

    @PostMapping("/a92")
    public String calc(@RequestParam(required = false, defaultValue = "0") int money, Model model) {
        double res = 0;

        if (money > 0) {
            res = money / 42.27;
            model.addAttribute("name", "АИ-92");
            model.addAttribute("price", 42.27);
            model.addAttribute("res", res);
        } else {
            model.addAttribute("err", "Указана недействительная сумма");
        }
        return "main";
    }

    //АИ-95
    @GetMapping("/a95")
    public String a95(@RequestParam(name = "name", required = false, defaultValue = "АИ-95") String name, Model model) {
        model.addAttribute("name", name);
        return "main";
    }

    @PostMapping("/a95")
    public String calc1(@RequestParam(required = false, defaultValue = "0") int money, Model model) {
        double res = 0;
        if (money > 0) {
            res = money / 45.55;
            model.addAttribute("name", "АИ-95");
            model.addAttribute("price", 45.55);
            model.addAttribute("res", res);
        } else {
            model.addAttribute("err", "Указана недействительная сумма");
        }
        return "main";
    }

    //АИ-98
    @GetMapping("/a98")
    public String a98(@RequestParam(name = "name", required = false, defaultValue = "АИ-98") String name, Model model) {
        model.addAttribute("name", name);
        return "main";
    }

    @PostMapping("/a98")
    public String calc2(@RequestParam(required = false, defaultValue = "0") int money, Model model) {
        double res = 0;
        if (money > 0) {
            res = money / 46.18;
            model.addAttribute("name", "АИ-98");
            model.addAttribute("price", 46.18);
            model.addAttribute("res", res);
        } else {
            model.addAttribute("err", "Указана недействительная сумма");
        }
        return "main";
    }

    //ДТ
    @GetMapping("/diesel")
    public String diesel(@RequestParam(name = "name", required = false, defaultValue = "ДТ") String name, Model model) {
        model.addAttribute("name", name);
        return "main";
    }

    @PostMapping("/diesel")
    public String calc3(@RequestParam(required = false, defaultValue = "0") int money, Model model) {
        double res = 0;
        if (money > 0) {
        res = money / 48.20;
        model.addAttribute("name", "ДТ");
        model.addAttribute("price", 48.20);
        model.addAttribute("res", res);
        } else {
            model.addAttribute("err", "Указана недействительная сумма");
        }
        return "main";
    }

    //Газ
    @GetMapping("//gas")
    public String gas(@RequestParam(name = "name", required = false, defaultValue = "Газ") String name, Model model) {
        model.addAttribute("name", name);
        return "main";
    }

    @PostMapping("/gas")
    public String calc4(@RequestParam(required = false, defaultValue = "0") int money, Model model) {
        double res = 0;
        if (money > 0) {
        res = money / 21.90;
        model.addAttribute("name", "Газ");
        model.addAttribute("price", 21.90);
        model.addAttribute("res", res);
        } else {
            model.addAttribute("err", "Указана недействительная сумма");
        }
        return "main";
    }
}