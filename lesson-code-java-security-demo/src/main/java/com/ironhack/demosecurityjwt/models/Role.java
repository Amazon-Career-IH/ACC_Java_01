package com.ironhack.demosecurityjwt.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entity class for representing a Role in the database
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    /**
     * The primary key for the Role table
     */
    @Id
    /**
     * The id is generated automatically by the database
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * The name of the role
     */
    private String name;
}
