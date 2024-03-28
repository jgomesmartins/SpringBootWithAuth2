package com.springbootwithauth2.springbootwithauth2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootwithauth2.springbootwithauth2.models.Client;
import com.springbootwithauth2.springbootwithauth2.repositories.ClientRepositoty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientRepositoty clientrepository;

    @GetMapping
    public List<Client> findAll() {
        return clientrepository.findAll();
    }

}