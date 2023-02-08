package com.example.sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String addUser(User user)
    {
        userRepository.save(user);
        return "Added";
    }
    public User getUser(UserId userId)
    {
        User user =  userRepository.findById(userId).get();
        return user;

    }
    public String deleteUser(int id, String name, int age)
    {
        userRepository.deleteById(new UserId(id,name, age));
        return name+" deleted";
    }
    public User updateUserAge (UserId userId, int newAge)
    {
        User user = userRepository.findById(userId).get();
        user.setAge(newAge);
        userRepository.save(user);
        return user;
    }
}
