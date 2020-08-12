package com.example.assignment.contoller;

import com.example.assignment.dto.ResponseDto;
import com.example.assignment.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/palindrome")
public class PalindromeController {

    @Autowired
    PalindromeService palindromeService;

    @GetMapping("/input/{data}")
    public Boolean getForecast(@PathVariable("data") String data)  {
        return palindromeService.isPalindrome(data);
    }
}
