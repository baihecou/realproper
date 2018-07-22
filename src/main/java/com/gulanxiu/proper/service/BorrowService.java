package com.gulanxiu.proper.service;

import com.gulanxiu.proper.domain.Borrow;

/**
 * @author gulanxiu
 * @time 2018/7/19   2:45
 * @projectname proper
 */
public interface BorrowService  {

    /**
     * 申请借用 0
     * @param borrow
     * @return
     */
    int applyProper(Borrow borrow);


    /**
     * 是否借用过
     * @param borrow
     * @return
     */
    Borrow canBorrow(Borrow borrow);


    /**
     * 同意借用
     * @param id
     * @return
     */
    int agreeBrrow(int id);

    /**
     * 是否可以归还
     * @param id
     * @return
     */
    Borrow canGiveBack(int id);

    /**
     * 核实归还
     * @param id
     * @return
     */
    int checkGiveBack(int id);


    /**
     * 归还
     * @param id
     * @return
     */
    int giveBack(int id);

    /**
     * 拒绝借用
     * @param id
     * @return
     */
    int refuseBorrow(int id);
}
