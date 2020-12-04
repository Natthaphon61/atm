package th.ac.kmitl.atm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class shopController {
    @RequestMapping("/shop")
    public String getcontact(Model model) {
        return "shop";
    }
}

