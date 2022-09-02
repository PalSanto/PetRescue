package com.demxntia.Petrescue.PetRescueController;

import com.demxntia.Petrescue.PetRescueInfo.User;
import com.demxntia.Petrescue.PetRescueService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    //--登录注册功能实现

    //--登录
    @GetMapping("/loginPage")
    public String Login(){
        return ("/LoginPage");
    }

    @RequestMapping("/LoginPage")
    public String Login(User user, HttpSession session){

        User username = (User) session.getAttribute("username");
        User password = (User) session.getAttribute("password");

        session.setAttribute(user.getUsername(),username);
        session.setAttribute(user.getPassword(),password);

        boolean flag = userService.Login(user);

        if(flag==true){
            return "HomePage";
        }else {
            return "RegisterPage";
        }
    }

    @GetMapping("/RegisterPage")
    public String Register(){
        return ("/RegisterPage");
    }

    //--注册
    @RequestMapping("/RegisterPage")
    public String Register(User user, HttpSession session){

        User username  = (User)session.getAttribute("username");
        User email = (User)session.getAttribute("email");
        User password = (User)session.getAttribute("password");
        User Phone = (User)session.getAttribute("Phone");

        session.setAttribute(user.getUsername(), username);
        session.setAttribute(user.getEmail(), email);
        session.setAttribute(user.getPassword(), password);
        session.setAttribute(user.getPhone(), Phone);

        boolean flag = userService.Register(user);
        if(flag==true){
            return "LoginPage";
        }else{
            return "StartPage";
        }
    }
}
