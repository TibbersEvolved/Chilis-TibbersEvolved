package Chilis.com.demo.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class Controller {

    @GetMapping("/fetch")
    public String findAll(){

        List<String> tempList = new ArrayList<>();

        tempList.add("This IS THE ENDPOINT");
        return "Hey Nav";
    }
}
