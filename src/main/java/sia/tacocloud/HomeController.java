package sia.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String Home(){
        return "Home";
    }
}
