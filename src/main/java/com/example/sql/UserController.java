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
    public User getUser(@RequestParam("id") int id)
    {

        return userService.getUser(id);
    }
    @DeleteMapping("deleteUser")
    public String deleteUser(@RequestParam("id") int id)
    {
        return userService.deleteUser(id);
    }

    @PutMapping("updateUserAge")
    public User updateUserAge(@RequestParam("id") int id, @RequestParam("newAge") int newAge)
    {
        return userService.updateUserAge(id,newAge);
    }



}
