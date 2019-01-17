package com.zxk.action;

import com.sun.javafx.collections.MappingChange;
import com.zxk.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller

public class UserAction {
    @Autowired
    IUserService userService;
    @RequestMapping(value = "findUserById.do" ,method = RequestMethod.GET)
    @ResponseBody
    public Map<String,String> findUserById(int user_id){


        Map<String, String> userById = userService.findUserById(user_id);

        return userById;
    }
}
