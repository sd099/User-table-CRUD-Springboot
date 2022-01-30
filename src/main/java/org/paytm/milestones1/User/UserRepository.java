package org.paytm.milestones1.User;


import org.springframework.data.repository.CrudRepository;
import org.paytm.milestones1.User.User;


public interface UserRepository extends CrudRepository<User,Integer> {

     User findByUserName(String userName);
     User findByEmailID(String emailID);
     User findByMobileNumber(String mobileNumber);
}
