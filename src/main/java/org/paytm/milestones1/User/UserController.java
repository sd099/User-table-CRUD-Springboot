package org.paytm.milestones1.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/user")
    public String addUser(@RequestBody User user){

        return userService.addUser(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getUser(@RequestParam("userId") Integer userId){
        return userService.getUser(userId);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String updateUser(@RequestParam("userId") Integer userId, @RequestBody User user){
        return userService.updateUser(userId, user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public void deleteUser(@RequestParam("userId") Integer userId){
         userService.deleteUser(userId);
    }

}
