package com.gulanxiu.proper.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gulanxiu.proper.domain.Hardware;
import com.gulanxiu.proper.domain.JsonData;
import com.gulanxiu.proper.service.HardwareService;
import org.apache.ibatis.builder.annotation.ProviderSqlSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @author gulanxiu
 * @time 2018/7/19   5:23
 * @projectname proper
 */
@RestController
@RequestMapping("/api/v1/hardware")
public class HardwareController {

    @Autowired
    private  HardwareService hardwareService;

    /**
     * 列出所有
     * @param size
     * @param number
     * @return
     */
    @GetMapping("list_all")
    public JsonData listAll(@RequestParam(value = "page_size",defaultValue = "20",required = false)int size,@RequestParam(value = "page_number",defaultValue = "1",required = false)int number){
        PageHelper.startPage(number,size);
        PageInfo<Hardware> pageInfo = new PageInfo<>(hardwareService.listAll());
        HashMap<String,Object> map = new HashMap<>();
        map.put("current_page",number);
        map.put("total_page",pageInfo.getPages());
        map.put("total_size",pageInfo.getSize());
        map.put("data",pageInfo.getList());
        return JsonData.buildSuccess(map);

    }

    @PostMapping("vague_query")
    public  JsonData vagueQuery(@RequestBody Hardware hardware ,@RequestParam(value = "page_size",defaultValue = "20",required = false)int size,@RequestParam(value = "page_number",defaultValue = "1",required = false)int number){
        PageHelper.startPage(number,size);
        PageInfo<Hardware> pageInfo = new PageInfo<>(hardwareService.vagueQuery(hardware));
        HashMap<String,Object> map = new HashMap<>();
        map.put("current_page",number);
        map.put("total_page",pageInfo.getPages());
        map.put("total_size",pageInfo.getSize());
        map.put("data",pageInfo.getList());
        return JsonData.buildSuccess(map);
    }


}
