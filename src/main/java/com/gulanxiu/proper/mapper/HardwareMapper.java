package com.gulanxiu.proper.mapper;

import com.gulanxiu.proper.domain.Hardware;
import com.gulanxiu.proper.provider.HardwareProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * @author gulanxiu
 * @time 2018/7/19   5:15
 * @projectname proper
 */
public interface HardwareMapper {

    /**
     * 列出所有设备
     * @return
     */
    @Select("select * from hardware order by id desc")
    List<Hardware> listAll();

    /**
     * 模糊查询
     * @param hardware
     * @return
     */

    @SelectProvider(type = HardwareProvider.class , method = "vagueSelect")
    List<Hardware> vagueQuery(Hardware hardware);
}

