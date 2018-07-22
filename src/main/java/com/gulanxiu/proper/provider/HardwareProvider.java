package com.gulanxiu.proper.provider;

import com.gulanxiu.proper.domain.Hardware;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author gulanxiu
 * @time 2018/7/19   5:38
 * @projectname proper
 */
public class HardwareProvider {

    public String vagueSelect(final  Hardware hardware){
        return new SQL(){{
            SELECT("*");
            FROM("hardware");
            if(hardware.getNumber()!=null)
                WHERE("number like concat('%',#{number},'%')");
            if(hardware.getName()!=null)
                WHERE("name like concat('%',#{name},'%')");
            if(hardware.getVersion()!=null)
                WHERE("version like concat('%',#{version},'%')");
            if(hardware.getPlace()!=null)
                WHERE("place like concat('%',#{place},'%')");
            if(hardware.getUnit()!= null)
                WHERE("unit like concat('%',#{unit},'%')");
            if(hardware.getState()!= null)
                WHERE("state = #{state}");
            if(hardware.getDeleteTag()!=null)
                WHERE("delete_tag = #{deleteTag}");
            ORDER_BY("id DESC");
        }}.toString();
    }
}
