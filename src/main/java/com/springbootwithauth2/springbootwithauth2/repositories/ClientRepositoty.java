package com.springbootwithauth2.springbootwithauth2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootwithauth2.springbootwithauth2.models.Client;

public interface ClientRepositoty extends JpaRepository<Client,Long> {

}
