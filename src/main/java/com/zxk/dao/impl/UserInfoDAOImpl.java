package com.zxk.dao.impl;

import com.zxk.dao.IUserInfoDAO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository("userInfoDAO")
public class UserInfoDAOImpl implements IUserInfoDAO {

    @Autowired
    SqlSessionFactory sqlSessionFactory;


    @Override
    public Map<String, String> findUserById(int user_id) {
        String sql="com.zxk.mapper.findUserById";
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        Object o = sqlSession.selectOne(sql, user_id);
        return (Map<String, String>) o;
    }
}
