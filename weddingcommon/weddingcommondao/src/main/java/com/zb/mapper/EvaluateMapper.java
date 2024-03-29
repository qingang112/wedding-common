package com.zb.mapper;
import com.zb.pojo.Evaluate;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.omg.PortableInterceptor.INACTIVE;

@Mapper
public interface EvaluateMapper {

	public Evaluate getEvaluateById(@Param(value = "id") Integer id)throws Exception;

	public List<Evaluate>	getEvaluateListByMap(Map<String,Object> param)throws Exception;

	public Integer getEvaluateCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertEvaluate(Evaluate evaluate)throws Exception;

	public Integer updateEvaluate(Evaluate evaluate)throws Exception;
    //恶意评价删除
	public Integer deleteEvaluateById(@Param(value = "id") Integer id)throws Exception;

	public Integer batchDeleteEvaluate(Map<String,List<String>> params);

	public List<Evaluate> findListById(@Param("id") Integer id)throws Exception;

	public List<Evaluate> byIdGetList(Integer id) throws Exception;

	public Integer byOrderIdUpdate(Evaluate evaluate)throws Exception;

	//查询商品评价数量
	public Integer getCommodtiyCount(@Param("id") Integer id)throws Exception;

}
