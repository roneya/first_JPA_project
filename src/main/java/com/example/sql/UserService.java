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
    public User getUser(int id)
    {
        User user =  userRepository.findById(id).get();
        return user;

    }
    public String deleteUser(int id)
    {
        userRepository.deleteById(id);
        return id+" deleted";
    }
    public User updateUserAge (int id, int newAge)
    {
        User user = userRepository.findById(id).get();
        user.setAge(newAge);
        userRepository.save(user);
        return user;
    }
}
