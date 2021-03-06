package com.ORM.mapper.areaMapper;


import java.util.List;

import com.ORM.model.areaModel.TblArea;
import com.ORM.model.areaModel.TblAreaExample;
import org.apache.ibatis.annotations.Param;

public interface TblAreaMapper {
    int countByExample(TblAreaExample example);

    int deleteByExample(TblAreaExample example);

    int deleteByPrimaryKey(Integer areaId);

    int insert(TblArea record);

    int insertSelective(TblArea record);

    List<TblArea> selectByExample(TblAreaExample example);

    TblArea selectByPrimaryKey(Integer areaId);

    int updateByExampleSelective(@Param("record") TblArea record, @Param("example") TblAreaExample example);

    int updateByExample(@Param("record") TblArea record, @Param("example") TblAreaExample example);

    int updateByPrimaryKeySelective(TblArea record);

    int updateByPrimaryKey(TblArea record);
}