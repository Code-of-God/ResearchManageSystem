package com.ORM.mapper.projectMapper;

import java.util.List;

import com.ORM.model.projectModel.TblProject;
import com.ORM.model.projectModel.TblProjectExample;
import org.apache.ibatis.annotations.Param;


public interface TblProjectMapper {
    int countByExample(TblProjectExample example);

    int deleteByExample(TblProjectExample example);

    int deleteByPrimaryKey(Integer projId);

    int insert(TblProject record);

    int insertSelective(TblProject record);

    List<TblProject> selectByExample(TblProjectExample example);

    TblProject selectByPrimaryKey(Integer projId);

    int updateByExampleSelective(@Param("record") TblProject record, @Param("example") TblProjectExample example);

    int updateByExample(@Param("record") TblProject record, @Param("example") TblProjectExample example);

    int updateByPrimaryKeySelective(TblProject record);

    int updateByPrimaryKey(TblProject record);
}