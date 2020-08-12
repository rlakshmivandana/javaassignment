package com.example.assignment.service;

import com.example.assignment.dto.ResponseDto;
import org.springframework.stereotype.Service;

@Service
public class PalindromeService {

    public Boolean isPalindrome(String data) {
        String str = data;
        boolean flag = true;

        int i=0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else{
                flag=false;
                break;
            }
        }
        return flag;
    }
}
