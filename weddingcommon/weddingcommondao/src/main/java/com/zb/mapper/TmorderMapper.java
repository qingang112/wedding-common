package com.zb.mapper;
import com.zb.pojo.Tmorder;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TmorderMapper {
     //唯一查
	public Tmorder getTmorderById(@Param(value = "orderid") Integer orderid)throws Exception;
    //全部查
	public List<Tmorder>	getTmorderListByMap(Map<String,Object> map)throws Exception;
    //查次数
	public Integer getTmorderCountByMap(Map<String,Object> map)throws Exception;

	public Integer insertTmorder(Tmorder tmorder)throws Exception;

	public Integer updateTmorder(Tmorder tmorder)throws Exception;


	public Integer batchDeleteTmorder(Map<String,List<String>> params);

}