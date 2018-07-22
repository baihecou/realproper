package com.gulanxiu.proper.mapper;

import com.gulanxiu.proper.domain.Borrow;
import org.apache.ibatis.annotations.*;

/**
 * @author gulanxiu
 * @time 2018/7/19   2:41
 * @projectname proper
 */
public interface BorrowMapper  {

    /**
     * 申请借用
     * @param borrow
     * @return
     */
    @Insert("insert into borrow(user_id,hardware_id) values(#{userId},#{hardwareId})")
    @Options(useGeneratedKeys = true,keyColumn = "id")
    int  applyProper(Borrow borrow);


    /**
     * 判断是否已经借用过了
     * @param borrow
     * @return
     */
    @Select("select * from borrow where (user_id,hardware_id,state)=(#{userId},#{hardwareId},0)")
    Borrow canBorrow(Borrow borrow);


    /**
     * 同意借用
     * @param id
     * @return
     */
    @Update("update borrow set state = 1 ,start_date = now() where id = #{id} ")
    int agreeBorrow(@Param("id") int id);

    /**
     * 归还申请
     * @param id
     * @return
     */
    @Update("update borrow set state = 2  where id = #{id}")
    int giveBack(int id);

    @Update("update borrow set state = -1, end_date = now() where id = #{id}")
    int checkGiveBack(@Param("id")int id);

    /**
     * 判断是否可以归还
     * @param id
     * @return
     */
    @Select("select * from borrow where (id ,state) = (#{id},1)")
    Borrow canGiveBack(int id);

    /**
     * 拒绝借用
     * @param id
     * @return
     */
    @Update("update borrow set state = -1 where id = #{id}")
    int refuseBorrow(@Param("id")int id);


}
