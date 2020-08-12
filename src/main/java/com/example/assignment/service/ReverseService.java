package com.example.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class ReverseService {

    public String reverse(String data) {
        char ch[] = data.toCharArray ();
        int i = 0;
        int j = ch.length - 1;
        char temp = 0;
        while (i < j) {
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        String reverse = String.valueOf(ch);
        return reverse;
    }
}
