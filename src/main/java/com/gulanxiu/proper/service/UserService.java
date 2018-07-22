package com.gulanxiu.proper.service;

import com.gulanxiu.proper.domain.Loan;
import com.gulanxiu.proper.domain.User;

import java.util.List;

/**
 * @author gulanxiu
 * @time 2018/7/18   13:04
 * @projectname proper
 */

/**
 * 用户服务
 */
public interface UserService{


    /**
     * 登陆
     * @param number
     * @param password
     * @return
     */
    User login(String number , String password,String tag);


    /**
     * 增加用户
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 根据工号查找用户
     * @param number
     * @return
     */
    User searchUserByUsernumber(String number,int userType);


    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUser(int id);

    /**
     * 列出所有用户
     * @param userType
     * @return
     */
    List<User> listAll(int userType);


}
