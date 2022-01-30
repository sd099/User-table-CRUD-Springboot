package org.paytm.milestones1.User;

import javax.persistence.*;

@Entity
public class User {

    //User Schema
    @Id
    @GeneratedValue
    @Column(name = "User_Id")
    int userId;
    @Column(name = "User_Name",nullable = false)
    String userName;
    @Column(name = "First_Name",nullable = false)
    String firstName;
    @Column(name = "Last_Name",nullable = false)
    String lastName;
    @Column(name = "Mobile_Number",nullable = false)
    String  mobileNumber;
    @Column(name = "Email_Id",nullable = false)
    String emailID;
    @Column(name = "Address_1",nullable = false)
    String address1;
    @Column(name = "Address_2")
    String address2;

    //Constructor
    public User() {
    }

    public User(int userId,  String userName, String firstName, String lastName, String mobileNumber, String emailID, String address1, String address2) {
        this.userId = userId;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.emailID = emailID;
        this.address1 = address1;
        this.address2 = address2;
    }


    //Getters and Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }



}
