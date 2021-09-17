package service;

import java.util.List;

import bean.TType;
import bean.TTypeExample;
import dao.TTypeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("tTypeService")
public class TTypeServiceImpl implements TTypeService{
	@Autowired(required = false)
	private TTypeDAO tTypeDAO;
	public long countByExample(TTypeExample example){
    	return tTypeDAO.countByExample(example);
    }

	public int deleteByExample(TTypeExample example){
    	return tTypeDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return tTypeDAO.deleteByPrimaryKey(id);
    }

	public int insert(TType record){
    	return tTypeDAO.insert(record);
    }

	public int insertSelective(TType record){
    	return tTypeDAO.insertSelective(record);
    }

	public List<TType> selectByExample(TTypeExample example){
    	return tTypeDAO.selectByExample(example);
    }

	public TType selectByPrimaryKey(Integer id){
    	return tTypeDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(TType record, TTypeExample example){
    	return tTypeDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(TType record, TTypeExample example){
    	return tTypeDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(TType record){
    	return tTypeDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(TType record){
    	return tTypeDAO.updateByPrimaryKey(record);
    }


}
