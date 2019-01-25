package com.springboot.web.application.Mossed;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MossedController {

    @RequestMapping("/mossed")
    public String mosseddashboard(){
    	System.out.println("In the Mossed Dashboard Controller");
        return "mossed";
    }
}
