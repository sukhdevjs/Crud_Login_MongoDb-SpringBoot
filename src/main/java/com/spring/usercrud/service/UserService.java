package com.spring.usercrud.service;

import com.spring.usercrud.model.User;
import com.spring.usercrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(String id){
        return userRepository.findById(id);
    }
    public User getUserByEmail(String email){
        return userRepository.findByEmail(email);
    }
    public void deleteUser(String id){
        userRepository.deleteById(id);
    }

    public User updateUser(String id, User userDetails) {
        Optional<User> existingUser = userRepository.findById(id);
        if (existingUser.isPresent()) {
            User user = existingUser.get();
            user.setUsername(userDetails.getUsername());
            user.setEmail(userDetails.getEmail());
            user.setPassword(userDetails.getPassword());
            return userRepository.save(user);
        }  else {
            return null;
        }
    }

}

//    public List<UserService> getAllUser(){
//        return userRepository.findAll();
//    }
//    public User getUserById(Long id){
//        Optional<User> user = userRepository.findById(id);
//        return user.orElse(null);
//    }
//    public User adduser(User user){
//        return UserRepository.save(user);
//    }
//    public User updateuser(Long id, User userDetails){
//        User user = getuserById(id);
//        if (user != null){
//            user.setUsername(userDetails.getUsername());
//            user.setEmail(userDetails.getEmail());
//            user.setPassword(userDetails.getPassword());
//
//            return UserRepository.save(user);
//        }
//        return null;
//    }
//
//    public void deleteuser(Long id){
//        UserRepository.deleteById(id);
//    }
//}
