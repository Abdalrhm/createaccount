package com.capgimini.createaccount.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/message")
public class Messagecontroller {
    @Autowired
    private MessageRepository messageRepository;
    @ResponseBody
    @GetMapping
    public List<Message> getAll() {
        return messageRepository.findAll();
    }

    @PostMapping
    public  void postAccount(@RequestBody Message message) {
        messageRepository.save(message);

    }
}
