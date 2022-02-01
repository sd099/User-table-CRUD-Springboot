package org.paytm.milestones1.controller;

import org.paytm.milestones1.service.UserService;
import org.paytm.milestones1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    // @desc    Get all users
    // @route   GET /users
    // @access  Public
    @RequestMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }


    // @desc    Add new user
    // @route   POST /user
    // @access  Public
    @RequestMapping(method = RequestMethod.POST,value = "/user")
    public String addUser(@RequestBody User user){

        return userService.addUser(user);
    }


    // @desc    Get user by userId
    // @route   GET /user?userId=<userId>
    // @access  Public
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getUser(@RequestParam("userId") Integer userId){
        return userService.getUser(userId);
    }


    // @desc    Update user
    // @route   PUT /user?userId=<userId>
    // @access  Public
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String updateUser(@RequestParam("userId") Integer userId, @RequestBody User user){
        return userService.updateUser(userId, user);
    }


    // @desc    Delete user
    // @route   DELETE /user?userId=<userId>
    // @access  Public
    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public void deleteUser(@RequestParam("userId") Integer userId){
         userService.deleteUser(userId);
    }

}
