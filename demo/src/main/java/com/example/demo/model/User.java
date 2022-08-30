package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
}
