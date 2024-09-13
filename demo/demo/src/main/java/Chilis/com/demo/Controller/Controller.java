package Chilis.com.demo.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("/fetch")
@org.springframework.stereotype.Controller
public class Controller {
    public Controller() {

    }

    @GetMapping
    public List<String> findAll(){

        List<String> tempList = new ArrayList<>();

        tempList.add("This IS THE ENDPOINT");
        return tempList;
    }
}
