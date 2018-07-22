package com.gulanxiu.proper.service;

import com.gulanxiu.proper.domain.Hardware;

import java.util.List;

/**
 * @author gulanxiu
 * @time 2018/7/19   5:19
 * @projectname proper
 */
public interface HardwareService {
    /**
     * 列出所有
     * @return
     */
    List<Hardware> listAll();


    /**
     * 模糊查询
     * @param hardware
     * @return
     */
    List<Hardware> vagueQuery(Hardware hardware);
}
