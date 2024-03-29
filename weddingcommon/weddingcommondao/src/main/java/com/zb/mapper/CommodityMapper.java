package com.zb.mapper;

import com.zb.pojo.Commodity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface CommodityMapper {

	//唯一查
	public Commodity getCommodityById(@Param("id") Integer id)throws Exception;
    //全部查
	public List<Commodity>	getCommodityListByMap(Map<String, Object> map)throws Exception;
	//查询次数
	public  int getCommodityCount(Map<String, Object> map)throws  Exception;
    //商品录入
	public Integer insertCommodity(Commodity commodity)throws Exception;
    //商品状态更改
	public Integer updateCommodity(Commodity commodity)throws Exception;
   //删除商品
	public Integer deleteCommodityById(@Param("id") Integer id)throws Exception;
   //根据商品名字唯一查
	public Commodity getCommodityBycname(@Param("cname")String cname)throws  Exception;
	public List<Commodity> findListCommodity() throws Exception;

}
