package com.socialMedia.socialMedia.service;
import org.springframework.stereotype.Service;

import com.socialMedia.socialMedia.User;
import com.socialMedia.socialMedia.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public Object createUser(String name,String email, String contact){
        User user = new User();
        user.setContact(contact);
        user.setEmail(email);
        user.setName(name);
        return UserRepository.save(user);
        
    }
    public User CreateUser(User user){
        return (User) UserRepository.save(user);
    }
    public static User Create(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Create'");
    }
}
