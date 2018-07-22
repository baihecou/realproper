package com.gulanxiu.proper.controller.admin;

import com.gulanxiu.proper.domain.JsonData;
import com.gulanxiu.proper.domain.User;
import com.gulanxiu.proper.service.UserService;
import com.gulanxiu.proper.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * @author gulanxiu
 * @time 2018/7/19   14:53
 * @projectname proper
 */
@RestController
@RequestMapping("/admin/api/v1/user")
public class UserAdminController {

    @Autowired
    private UserService userService;

    /**
     * 添加用户
     * @param user
     * @return
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @PostMapping("add_user")
    public JsonData addUser(@RequestBody User user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        user.setPassword(MD5.EncoderByMd5(user.getPassword()));
        return JsonData.buildSuccess(userService.addUser(user));

    }


    @GetMapping("search_user_by_number")

    public JsonData searchUserByNumber(@RequestParam(value = "number")String number, @RequestParam(value = "user_type")int userType){
        return JsonData.buildSuccess(userService.searchUserByUsernumber(number,userType));
    }


    @DeleteMapping("delete_user")
    public JsonData deleteUser(@RequestParam("user_id")int id){
        if(userService.deleteUser(id) ==1)
        return JsonData.buildSuccess();
        return JsonData.buildError("没有这个用户");
    }





}
