package com.gulanxiu.proper.provider;

import com.gulanxiu.proper.domain.User;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author gulanxiu
 * @time 2018/7/18   12:43
 * @projectname proper
 */
public class UserProvider {

    public String updateUser(final User user){
        return new SQL(){{
            UPDATE("user");
            if(user.getUsernumber()!=null)
                SET("usernumber = #{usernumber}");
            if(user.getUsername() != null)
                SET("username = #{username}");
            if(user.getPassword() != null)
                SET("password = #{password}");
            if(user.getAcedemy() != null)
                SET("acedemy = #{acedemy}");
            if(user.getState() != null)
                SET("state = #{state}");
            if(user.getDeleteTag() != null)
                SET("delete_tag=#{deleteTag}");
            WHERE("id = #{id}");

        }}.toString();
    }
}
