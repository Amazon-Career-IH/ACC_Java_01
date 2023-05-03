package com.ironhack.demosecurityjwt.controllers.impl;

import com.ironhack.demosecurityjwt.*;
import com.ironhack.demosecurityjwt.models.*;
import com.ironhack.demosecurityjwt.services.impl.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.context.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    UserService userService;

    @GetMapping("/get-tasks")
    public List<Task> getTasksFromUser() {
        return userService.getTasks((String) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }

    @PostMapping("/add-task")
    public Task addTask(@RequestBody TaskDTO task) {
        System.out.println(task.getTask());

        return userService.addTask(task, (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal());

    }
}
