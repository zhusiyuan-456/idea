package com.siyuan.service.iml;

import com.siyuan.repository.impl.RepoImpl;
import com.siyuan.service.myService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class mySer implements myService {
    @Autowired
    private RepoImpl myRepo;
    public void setMyRepo(RepoImpl myRepo) {
        this.myRepo = myRepo;
    }

    @Override
    public String doService(Double score) {
       return myRepo.doRepo(score);
    }
}
