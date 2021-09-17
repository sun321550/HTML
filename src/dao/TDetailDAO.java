package dao;

import bean.TDetail;
import bean.TDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDetailDAO {
    long countByExample(TDetailExample example);

    int deleteByExample(TDetailExample example);

    int deleteByPrimaryKey(Integer bdid);

    int insert(TDetail record);

    int insertSelective(TDetail record);

    List<TDetail> selectByExample(TDetailExample example);

    TDetail selectByPrimaryKey(Integer bdid);

    int updateByExampleSelective(@Param("record") TDetail record, @Param("example") TDetailExample example);

    int updateByExample(@Param("record") TDetail record, @Param("example") TDetailExample example);

    int updateByPrimaryKeySelective(TDetail record);

    int updateByPrimaryKey(TDetail record);
}