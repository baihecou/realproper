package com.gulanxiu.proper.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gulanxiu.proper.domain.JsonData;
import com.gulanxiu.proper.domain.Loan;
import com.gulanxiu.proper.domain.User;
import com.gulanxiu.proper.service.UserService;
import com.gulanxiu.proper.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * @author gulanxiu
 * @time 2018/7/18   13:08
 * @projectname proper
 */

/**
 * 用户服务层
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登陆，0代表管理员，1代表老师，2代表学生,默认为学生登陆
     * @param number
     * @param password
     * @param tag
     * @return
     */
    @GetMapping("login")
    public JsonData login(@RequestParam(value = "number",defaultValue = "" ) String number , @RequestParam(value = "password",defaultValue = "")String password,@RequestParam(value = "tag",defaultValue = "2")String tag) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        User user = userService.login(number, MD5.EncoderByMd5(password) ,tag);
        if(user == null)
            return JsonData.buildError("账户名不存在或密码错误");
        else {
            return JsonData.buildSuccess(user);
        }
    }

}
