package com.capgimini.createaccount.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class Accountcontroller {
    @Autowired
    AccountRepository myrepo1;

    @ResponseBody
    @GetMapping
    public List<Account> getAll() {
        return myrepo1.findAll();
    }

    @PostMapping
    public  void postTopic(@RequestBody Account restAccount) {
        myrepo1.save(restAccount);

    }
}
