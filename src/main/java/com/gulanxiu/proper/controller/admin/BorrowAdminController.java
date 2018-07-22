package com.gulanxiu.proper.controller.admin;

import com.gulanxiu.proper.domain.JsonData;
import com.gulanxiu.proper.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gulanxiu
 * @time 2018/7/19   4:41
 * @projectname proper
 */
@RestController
@RequestMapping("/admin/api/v1/borrow")
public class BorrowAdminController {
    @Autowired
    private BorrowService borrowService;

    /**
     * 同意借用
     * @param id
     * @return
     */
    @PutMapping("agree_borrow")
    public JsonData agreeBorrow(@RequestParam(value = "borrow_id") int id){
        if(borrowService.agreeBrrow(id) == 1){
           return JsonData.buildSuccess();
        }

        return JsonData.buildError("数据库更新失败");
    }

    /**
     * 核实归还
     * @param id
     * @return
     */
    @PutMapping("check_giveback")
    public JsonData checkGiveBack(@RequestParam(value = "borrow_id") int id){
        if(borrowService.checkGiveBack(id) == 1){
            return JsonData.buildSuccess();
        }else {
            return JsonData.buildError("数据库更新失败");
        }
    }

    /**
     * 拒绝借用
     * @param id
     * @return
     */
    @PutMapping("refuse_borrow")
    public JsonData refuseBorrow(@RequestParam("borrow_id")int id){
        if(borrowService.refuseBorrow(id)== 1){
                return JsonData.buildSuccess();
        }else {
            return JsonData.buildError("数据库更新失败");
        }
    }
}
