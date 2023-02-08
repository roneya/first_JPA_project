package com.example.sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public String createUser(@RequestBody() User user)
    {
        return userService.addUser(user);
    }

    @GetMapping("/getUser/{id}/{name}/{age}")
    public User getUser(@PathVariable int id, @PathVariable String name, @PathVariable int age)
    {
        UserId userId = new UserId(id,name,age);
        return userService.getUser(userId);
    }



}
