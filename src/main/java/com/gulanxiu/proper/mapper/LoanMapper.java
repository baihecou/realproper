package com.gulanxiu.proper.mapper;

import com.gulanxiu.proper.domain.Loan;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author gulanxiu
 * @time 2018/7/19   1:52
 * @projectname proper
 */
public interface LoanMapper {

    @Select("select * from loan where user_id = #{userId} and hardware_state != -1 order by id DESC")
    List<Loan> findAllByUserId(int userId);
}
