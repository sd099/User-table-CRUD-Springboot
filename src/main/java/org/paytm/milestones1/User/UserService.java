package org.paytm.milestones1.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public String addUser(User user){

        User findByUserName = userRepository.findByUserName(user.getUserName());
        User findByEmailID = userRepository.findByEmailID( user.getEmailID());
        User findByMobileNumber = userRepository.findByMobileNumber(user.getMobileNumber());

        if(findByUserName==null && findByEmailID==null && findByMobileNumber==null ){
            userRepository.save(user);
             return "Stored";
        }else{
            return "User Already Exist";
        }

    }

}
