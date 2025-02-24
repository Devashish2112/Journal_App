package com.JAVA.journalApp.service;

import com.JAVA.journalApp.entity.User;
import com.JAVA.journalApp.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Use @Service instead of @Component for service layer
public class UserService {

    @Autowired
    private UserRepository userRepository; // This is an instance of UserRepository

    public void saveEntry(User user) {
        userRepository.save(user); // Call save on the instance, not on the interface
    }

    public List<User> getAll() {
        return userRepository.findAll(); // Call findAll on the instance
    }

    public Optional<User> findById(ObjectId id) {
        return userRepository.findById(id); // Call findById on the instance
    }

    public void deleteById(ObjectId id) {
        userRepository.deleteById(id); // Call deleteById on the instance
    }

    public User findByUserName(String username) {
        return userRepository.findByUserName(username);
    }
}