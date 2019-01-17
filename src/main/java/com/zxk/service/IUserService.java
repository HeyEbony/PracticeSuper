package com.zxk.service;

import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public interface IUserService {
    Map<String,String> findUserById(int user_id);
}
