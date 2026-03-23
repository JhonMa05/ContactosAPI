package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.contactModel;
import com.example.demo.Service.service;

@RestController
@CrossOrigin(origins = "*")
public class ContactController {
    @Autowired
    private service service;

    @GetMapping("/contacts")
    public List<contactModel> getContacts() {
        return service.addContact();
    }

}
