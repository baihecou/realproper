package com.gulanxiu.proper.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gulanxiu.proper.domain.JsonData;
import com.gulanxiu.proper.domain.Loan;
import com.gulanxiu.proper.service.LoanService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author gulanxiu
 * @time 2018/7/19   2:00
 * @projectname proper
 */
@RestController
@RequestMapping("/api/v1/loan")
public class LoanController {
    @Autowired
    private LoanService loanService;


    /**
     * 获取某个用户自己的借用信息
     * @param userId
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @GetMapping("get_proper")
    public JsonData getAllProperByUserId(@RequestParam(value ="user_id")int userId, @RequestParam(value = "page_number",required = false,defaultValue = "1")int pageNumber, @RequestParam(value = "page_size",required = false,defaultValue = "20")int pageSize){
        PageHelper.startPage(pageNumber,pageSize);
        PageInfo<Loan> loanPageInfo = new PageInfo<>(loanService.findAllByUserId(userId));
        HashMap<String ,Object> map = new HashMap<>();
        map.put("total_size",loanPageInfo.getSize());
        map.put("current_page",pageNumber);
        map.put("total_page",loanPageInfo.getPages());
        map.put("data",loanPageInfo.getList());
        return JsonData.buildSuccess(map);
    }
}
