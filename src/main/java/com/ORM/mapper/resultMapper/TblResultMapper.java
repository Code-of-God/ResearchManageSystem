package com.ORM.mapper.resultMapper;

import java.util.List;

import com.ORM.model.resultModel.TblResult;
import com.ORM.model.resultModel.TblResultExample;
import org.apache.ibatis.annotations.Param;


public interface TblResultMapper {
    int countByExample(TblResultExample example);

    int deleteByExample(TblResultExample example);

    int deleteByPrimaryKey(Integer resultId);

    int insert(TblResult record);

    int insertSelective(TblResult record);

    List<TblResult> selectByExample(TblResultExample example);

    TblResult selectByPrimaryKey(Integer resultId);

    int updateByExampleSelective(@Param("record") TblResult record, @Param("example") TblResultExample example);

    int updateByExample(@Param("record") TblResult record, @Param("example") TblResultExample example);

    int updateByPrimaryKeySelective(TblResult record);

    int updateByPrimaryKey(TblResult record);
}