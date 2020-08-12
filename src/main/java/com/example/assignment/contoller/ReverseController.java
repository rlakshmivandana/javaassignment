package com.example.assignment.contoller;

import com.example.assignment.service.ReverseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reverse")
public class ReverseController {

    @Autowired
    ReverseService reverseService;

    @GetMapping("/input/{data}")
    public String getForecast(@PathVariable("data") String data)  {
        return reverseService.reverse(data);
    }
}
