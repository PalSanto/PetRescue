package com.demxntia.Petrescue.PetRescueService;

import com.demxntia.Petrescue.PetRescueInfo.User;
import com.demxntia.Petrescue.PetRescueMapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User selectUserById(int id){
        return userMapper.selectUserById(id);
    }

    public boolean Login(User user){
        String username = user.getUsername();
        String password = user.getPassword();
        User u1 =  userMapper.selectUserByName(username);
        if(u1==null){
            return false;
        }else{
            if(u1.getPassword().equals(password)){
                return true;
            }else{
                return false;
            }
        }
    }

    public boolean Register(User user){
        int x = userMapper.insertUser(user);
        if(x>0){
            return true;
        }else {
            return false;
        }
    }
}
