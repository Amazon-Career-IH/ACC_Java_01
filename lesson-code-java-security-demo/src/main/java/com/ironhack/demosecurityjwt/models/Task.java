package com.ironhack.demosecurityjwt.models;

import com.fasterxml.jackson.annotation.*;
import com.ironhack.demosecurityjwt.models.*;
import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String task;
    private Date dueDate;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id")
    User user;
}
