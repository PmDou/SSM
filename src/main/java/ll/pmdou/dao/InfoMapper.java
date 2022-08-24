package ll.pmdou.dao;

import java.util.List;
import ll.pmdou.domain.Info;
import ll.pmdou.domain.InfoExample;
import org.apache.ibatis.annotations.Param;

public interface InfoMapper {
    long countByExample(InfoExample example);

    int deleteByExample(InfoExample example);

    int deleteByPrimaryKey(Integer iId);

    int insert(Info record);

    int insertSelective(Info record);

    List<Info> selectByExample(InfoExample example);

    Info selectByPrimaryKey(Integer iId);

    int updateByExampleSelective(@Param("record") Info record, @Param("example") InfoExample example);

    int updateByExample(@Param("record") Info record, @Param("example") InfoExample example);

    int updateByPrimaryKeySelective(Info record);

    int updateByPrimaryKey(Info record);
}