package com.gulanxiu.proper.service;

import com.gulanxiu.proper.domain.Loan;

import java.util.List;

/**
 * @author gulanxiu
 * @time 2018/7/19   1:56
 * @projectname proper
 */
public interface LoanService {

    /**
     * 
     * @param userId
     * @return
     */
    List<Loan> findAllByUserId(int userId);
}
