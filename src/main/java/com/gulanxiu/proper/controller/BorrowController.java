package com.gulanxiu.proper.controller;

import com.gulanxiu.proper.domain.Borrow;
import com.gulanxiu.proper.domain.JsonData;
import com.gulanxiu.proper.service.BorrowService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author gulanxiu
 * @time 2018/7/19   3:01
 * @projectname proper
 */
@RestController
@RequestMapping("/api/v1/borrow")
public class BorrowController {

    @Autowired
    private BorrowService borrowService;

    /**
     * 封装成borrow对象，主要有userId和hardwareId
     * @param borrow
     * @return
     */

    @PostMapping("apply_proper")
    public JsonData applyProper(@RequestBody Borrow borrow){
        if(borrowService.canBorrow(borrow) != null){
            return JsonData.buildError("不能重复申请");
        }

        borrowService.applyProper(borrow);
        return JsonData.buildSuccess(borrow.getId());
    }


    @PutMapping("give_back")
    public JsonData giveBack(@RequestParam("borrow_id")int id){
        if(borrowService.canGiveBack(id) == null){
            return JsonData.buildError("你还未借用这个物品");
        }else if(borrowService.giveBack(id) == 1){
            return JsonData.buildSuccess();
        }else{
            return JsonData.buildError("数据更新失败");
        }
    }
}
