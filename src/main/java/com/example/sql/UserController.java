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

    @GetMapping("getUser")
    public User getUser(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("age") int age)
    {
        UserId userId = new UserId(id,name,age);
        return userService.getUser(userId);
    }
    @DeleteMapping("deleteUser")
    public String deleteUser(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("age") int age)
    {
        return userService.deleteUser(id,name,age);
    }



}
