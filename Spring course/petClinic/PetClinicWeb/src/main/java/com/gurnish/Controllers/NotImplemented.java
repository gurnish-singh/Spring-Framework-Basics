package com.gurnish.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NotImplemented {
    @RequestMapping({"/owners/find","/oups"})
    public String notImplemented(){
        return "notImplemented";
    }

}
