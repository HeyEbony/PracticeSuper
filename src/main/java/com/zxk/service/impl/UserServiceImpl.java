package com.zxk.service.impl;

import com.zxk.dao.IUserInfoDAO;
import com.zxk.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserInfoDAO userInfoDAO;


    @Override
    public Map<String, String> findUserById(int user_id) {
        Map<String, String> userById = userInfoDAO.findUserById(user_id);
        return userById;
    }
}
