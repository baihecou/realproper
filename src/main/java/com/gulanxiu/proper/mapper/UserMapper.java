package com.gulanxiu.proper.mapper;

/**
 * @author gulanxiu
 * @time 2018/7/18   12:35
 * @projectname proper
 */

import com.gulanxiu.proper.domain.Loan;
import com.gulanxiu.proper.domain.User;
import com.gulanxiu.proper.provider.UserProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 用户操作
 */
public interface UserMapper {

    /**
     * 根据账户和密码查询用户是否存在
     * @param number
     * @param password
     * @return
     */
    @Select("select * from user where usernumber=#{number} and password=#{password} and delete_tag = #{deleteTag}")
    User login(@Param("number") String number ,@Param("password") String password ,@Param("deleteTag") String deleteTag);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    @UpdateProvider(type = UserProvider.class,method = "updateUser")
    @Options(useGeneratedKeys= true, keyColumn = "id")
    int updateUser(User user);

    /**
     * 增加一个用户
     * @param user
     * @return
     */
    @Insert("insert into user values(null,#{usernumber},#{username},#{password},#{acedemy},#{state},0)")
    @Options(useGeneratedKeys = true, keyColumn = "id")
    int addUser(User user);


    /**
     * 根据用户工号搜索用户
     * @param number
     * @param userType
     * @return
     */
    @Select("select * from user where usernumber=#{usernumber} and delete_tag = 0 and state = #{userType}")
    User searchUserByUsernumber(@Param("usernumber") String number,@Param("userType") int userType);


    /**
     * 删除用户
     * @param id
     * @return
     */
    @Update("update user set delete_tag = 1 where id = #{id}")
    int deleteUser(@Param("id") int id);

    @Select("slect * from user where state = #{userType} and delete_tag = 0")
    List<User> listAll(@Param("userType")int userType);



}
