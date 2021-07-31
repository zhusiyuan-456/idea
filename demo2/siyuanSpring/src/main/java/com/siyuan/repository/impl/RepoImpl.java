package com.siyuan.repository.impl;

import com.siyuan.repository.myRepo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class RepoImpl implements myRepo {
    public String doRepo(Double Score){
        String result="";
        if (Score <60){
            result="fail";
        }
        else if(Score >=60 && Score < 80){
            result="good";
        }
        else if(Score >=90){
            result="great!";
        }
        return result;
    }
}
