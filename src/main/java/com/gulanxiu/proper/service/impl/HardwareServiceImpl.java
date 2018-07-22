package com.gulanxiu.proper.service.impl;

import com.gulanxiu.proper.domain.Hardware;
import com.gulanxiu.proper.mapper.HardwareMapper;
import com.gulanxiu.proper.service.HardwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gulanxiu
 * @time 2018/7/19   5:22
 * @projectname proper
 */
@Service
public class HardwareServiceImpl implements HardwareService {
    @Autowired

    private HardwareMapper hardwareMapper;


    @Override
    public List<Hardware> listAll() {
        return hardwareMapper.listAll();
    }

    @Override
    public List<Hardware> vagueQuery(Hardware hardware) {
        return hardwareMapper.vagueQuery(hardware);
    }
}
