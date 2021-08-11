package com.example.webjsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//its a controlller for home.jsp
public class HomeController {
    @RequestMapping(value = "home")////the address for which it is
    ////@ResponseBody////that it will return something rather than the jsp file
    public String home(){
        ///System.out.println("helllo world");
        return "home.jsp";
    }
}
