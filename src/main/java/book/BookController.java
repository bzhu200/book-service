package book;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BookController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Boo Service!";
    }

    @RequestMapping("/health")
    public String health() {
        return "{\"status\":\"OK\"}";
    }

}