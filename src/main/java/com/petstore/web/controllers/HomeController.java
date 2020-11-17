package com.petstore.web.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/welcome")
    public @ResponseBody String welcomeMessage(){

        return "Pet  Store Application! yeah!!";
    }

    @GetMapping("/")  //always use the @GetMapping if its a web page
    public String displayWelcomePage(){
        return "welcome" ; //always return a html file in this case, its the welcome.html created in the templates directories
    }

}
