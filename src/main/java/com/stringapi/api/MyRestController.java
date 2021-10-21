package com.stringapi.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MyRestController {

    @RequestMapping(value = "/itself") //example: http://localhost:8080/itself?text=Karol
    public String itself(@RequestParam(value = "text", defaultValue = "Karol") String text) {
        return text;
    }

    @RequestMapping(value = "/jsonitself", produces= MediaType.APPLICATION_JSON_VALUE) //example: http://localhost:8080/jsonitself?text=Karol
    public Map<String, String> jsonItself(@RequestParam(value = "text", defaultValue = "Karol") String text) {
        HashMap<String, String> map = new HashMap<>();
        map.put("text", text);
        return map;
    }

}
