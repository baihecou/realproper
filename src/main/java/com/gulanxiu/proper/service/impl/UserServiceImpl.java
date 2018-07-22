package com.gulanxiu.proper.service.impl;

import com.gulanxiu.proper.domain.Loan;
import com.gulanxiu.proper.domain.User;
import com.gulanxiu.proper.mapper.UserMapper;
import com.gulanxiu.proper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gulanxiu
 * @time 2018/7/18   13:06
 * @projectname proper
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String number, String password ,String tag) {
        return userMapper.login(number, password,tag);
    }

    /**
     * 增加用户
     * @param user
     * @return
     */
    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public User searchUserByUsernumber(String number,int userType) {
        return userMapper.searchUserByUsernumber(number,userType);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

}
