package com.peoplefy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public @ResponseBody String greeting(@RequestParam("name") String name) {
        return "Hello " + name;
    }

}
