package com.zb.mapper;
import com.zb.pojo.Xtype;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface XtypeMapper {

	public Xtype getXtypeById(@Param(value = "id") Integer id)throws Exception;

	public List<Xtype>	getXtypeListByMap(@Param("id") Integer id)throws Exception;


	public Integer getXtypeCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertXtype(Xtype xtype)throws Exception;

	public Integer updateXtype(Xtype xtype)throws Exception;

	public Integer deleteXtypeById(@Param(value = "id") Integer id)throws Exception;

	public Integer batchDeleteXtype(Map<String,List<String>> params);

	public List<Xtype> findListXtype();

	public List<Xtype> findXtypeId(@Param(value = "id")Integer id)throws Exception;

}
