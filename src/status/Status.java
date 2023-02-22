/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the status details. 
 * @author srinivsi 
 */
public class Status {

public enum UserStatus {
    ACTIVE, INACTIVE, SUSPENDED;
}

public class User {
    private String name;
    private int age;
    private UserStatus status;

    public User(String name, int age, UserStatus status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus newStatus) {
        status = newStatus;
    }

    public static void main(String[] args) {
        User user = new User("John", 25, UserStatus.ACTIVE);
        System.out.println("User status: " + user.getStatus());
    }
}
    
}
