package com.scy.dao;

import com.scy.bean.Human;
import com.scy.bean.HumanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
//作业1.动态SQL 自己写两边

//作业2：MySQL 第三题 11-20 用mybaits 呈现  （参数不能为单个 必须用 map 或者字体类动态SQL）


public interface HumanDAO {
    long countByExample(HumanExample example);

    int deleteByExample(HumanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Human record);

    int insertSelective(Human record);

    List<Human> selectByExample(HumanExample example);

    Human selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Human record, @Param("example") HumanExample example);

    int updateByExample(@Param("record") Human record, @Param("example") HumanExample example);

    int updateByPrimaryKeySelective(Human record);

    int updateByPrimaryKey(Human record);
}