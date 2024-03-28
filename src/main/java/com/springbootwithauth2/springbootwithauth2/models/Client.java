package com.springbootwithauth2.springbootwithauth2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = Client.TABLE_NAME)
public class Client {

    public static final String TABLE_NAME= "TB_CLIENT";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private long ID;

    @Column(unique = true,length = 100,nullable = false)
    private String Name;

    @Column(length = 100)
    private String Address;

    @Column(length = 15)
    private String Telephone;
    
}
