package com.QEcode.OA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.QEcode.OA.pojo.User;
import com.QEcode.OA.service.UserService;


/**  
* <p>Title: UserAction.java</p>  
* <p>Description:user的action </p>   
* @author QEcode  
* @date 2018年11月25日  
* @version 1.0  
*/ 
@Controller
public class UserAction {
    
    @Autowired
    private UserService userService;
    
    private User user;

    public String findById(){
	System.out.println(userService);
	//user = userService.findById(user.getUserId());
	return "success";
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
