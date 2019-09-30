package com.zb.mapper;

import com.zb.vo.CwVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CwVoMapper {
    public List<CwVo>FindCwVoAll(Map<String,Object>map)throws Exception;

    public  int getCwVoCount(Map<String,Object>map)throws Exception;
}
