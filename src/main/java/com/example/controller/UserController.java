package com.example.controller;

import com.example.entity.User;
import com.example.entity.User2;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/testboot")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getuser")
    @ResponseBody
    public List<User> getUser() {
        List<User> users=userService.findAllUser();
        return users;
    }


    @RequestMapping("/getUser2")
    public String getUser2(Model model){
        List<User2> user2List=userService.findAllUser2();
        model.addAttribute("user2List",user2List);
        return "list";

    }
}
