package com.zxk.dao;

import java.util.Map;

public interface IUserInfoDAO {
    Map<String,String> findUserById(int user_id);
}
