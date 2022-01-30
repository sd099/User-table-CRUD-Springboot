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

    public boolean userNotExist(User user){

        User findByUserName = userRepository.findByUserName(user.getUserName());
        User findByEmailID = userRepository.findByEmailID( user.getEmailID());
        User findByMobileNumber = userRepository.findByMobileNumber(user.getMobileNumber());

        if(findByUserName==null && findByEmailID==null && findByMobileNumber==null ){
            return true;
        }else{
            return false;
        }

    }

    public String addUser(User user){

        if(userNotExist(user)){
            userRepository.save(user);
             return "Stored";
        }else{
            return "User Already Exist";
        }
    }

    public User getUser(int userId){
        return userRepository.findById(userId).orElse(null);
    }

    public String updateUser(int userId,User user){
        User existingUser = userRepository.findById(userId).orElse(null);
        if(existingUser!=null) {
            if(userNotExist(user)){
                existingUser.setUserName(user.getUserName());
                existingUser.setFirstName(user.getFirstName());
                existingUser.setLastName(user.getLastName());
                existingUser.setMobileNumber(user.getMobileNumber());
                existingUser.setEmailID(user.getEmailID());
                existingUser.setAddress1(user.getAddress1());
                existingUser.setAddress2(user.getAddress2());
                userRepository.save(existingUser);
                return "User Updated";
            }else{
                return "User Already Exist";
            }
        }else{
            return "User Not Found";
        }
    }

}
