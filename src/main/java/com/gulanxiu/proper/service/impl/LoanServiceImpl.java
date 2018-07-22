package com.gulanxiu.proper.service.impl;

import com.gulanxiu.proper.domain.Loan;
import com.gulanxiu.proper.mapper.LoanMapper;
import com.gulanxiu.proper.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gulanxiu
 * @time 2018/7/19   1:58
 * @projectname proper
 */
@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanMapper loanMapper;
    @Override
    public List<Loan> findAllByUserId(int userId) {
        return  loanMapper.findAllByUserId(userId);
    }
}
