package atlan.ceer.mapper;

import atlan.ceer.pojo.Needs;
import atlan.ceer.pojo.NeedsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NeedsMapper {
    long countByExample(NeedsExample example);

    int deleteByExample(NeedsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Needs record);

    int insertSelective(Needs record);

    List<Needs> selectByExampleWithBLOBs(NeedsExample example);

    List<Needs> selectByExample(NeedsExample example);

    Needs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Needs record, @Param("example") NeedsExample example);

    int updateByExampleWithBLOBs(@Param("record") Needs record, @Param("example") NeedsExample example);

    int updateByExample(@Param("record") Needs record, @Param("example") NeedsExample example);

    int updateByPrimaryKeySelective(Needs record);

    int updateByPrimaryKeyWithBLOBs(Needs record);

    int updateByPrimaryKey(Needs record);
}