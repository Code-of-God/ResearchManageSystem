package com.ORM.mapper.userMapper;

import java.util.List;

import com.ORM.model.userModel.TblUser;
import com.ORM.model.userModel.TblUserExample;
import org.apache.ibatis.annotations.Param;


public interface TblUserMapper {
    int countByExample(TblUserExample example);

    int deleteByExample(TblUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(TblUser record);

    int insertSelective(TblUser record);

    List<TblUser> selectByExample(TblUserExample example);

    TblUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") TblUser record, @Param("example") TblUserExample example);

    int updateByExample(@Param("record") TblUser record, @Param("example") TblUserExample example);

    int updateByPrimaryKeySelective(TblUser record);

    int updateByPrimaryKey(TblUser record);

    /**
     * 根据账号查询用户信息
     * @param userName 账号
     * @return
     */
    TblUser selectByUserName(String userName);
}