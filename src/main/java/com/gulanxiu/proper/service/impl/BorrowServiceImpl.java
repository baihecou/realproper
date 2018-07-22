package com.gulanxiu.proper.service.impl;

import com.gulanxiu.proper.domain.Borrow;
import com.gulanxiu.proper.mapper.BorrowMapper;
import com.gulanxiu.proper.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gulanxiu
 * @time 2018/7/19   2:50
 * @projectname proper
 */
@Service
public class BorrowServiceImpl implements BorrowService {

    @Autowired
    private BorrowMapper borrowMapper;
    @Override
    public int applyProper(Borrow borrow) {


        return borrowMapper.applyProper(borrow);
    }

    @Override
    public Borrow canBorrow(Borrow borrow) {
        return borrowMapper.canBorrow(borrow);
    }

    @Override
    public int agreeBrrow(int id) {
        return borrowMapper.agreeBorrow(id);
    }

    @Override
    public Borrow canGiveBack(int id) {
        return borrowMapper.canGiveBack(id);
    }

    @Override
    public int checkGiveBack(int id) {
        return borrowMapper.checkGiveBack(id);
    }

    @Override
    public int giveBack(int id) {
        return borrowMapper.giveBack(id);
    }

    @Override
    public int refuseBorrow(int id) {
        return borrowMapper.refuseBorrow(id);
    }
}
