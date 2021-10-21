package com.stringapi.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {

    @RequestMapping(value = "/itself") //example: http://localhost:8080/itself?text=Karol
    public String simpleExample(@RequestParam(value = "text", defaultValue = "Karol") String text) {
        return text;
    }

}
