package service;

import bean.TDetail;
import bean.TDetailExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TDetailService {
   
    long countByExample(TDetailExample example);

    int deleteByExample(TDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDetail record);

    int insertSelective(TDetail record);

    List<TDetail> selectByExample(TDetailExample example);

    TDetail selectByPrimaryKey(Integer id);
  
    int updateByExampleSelective(@Param("record") TDetail record, @Param("example") TDetailExample example);

    int updateByExample(@Param("record") TDetail record, @Param("example") TDetailExample example);

    int updateByPrimaryKeySelective(TDetail record);

    int updateByPrimaryKey(TDetail record);

}
