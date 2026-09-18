package com.example.project.leap.Bank;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();
    public UserService() {
        users.add(new User(1, "Dhipika", "12345"));
        users.add(new User(2, "Ram", "67890"));
    }
    public User getUser(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
    public void addUser(User user) {
        users.add(user);
    }
    public User updateUser(int id, User newUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                users.set(i, newUser);
                return newUser;
            }
        }
        return null;
    }
    public void deleteUser(int id) {
        users.removeIf(user -> user.getId() == id);
    }
}
