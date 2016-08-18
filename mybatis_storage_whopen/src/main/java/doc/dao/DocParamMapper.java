package doc.dao;

import doc.meta.DocParam;

import java.util.List;

public interface DocParamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DocParam record);

    int insertSelective(DocParam record);

    DocParam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DocParam record);

    int updateByPrimaryKey(DocParam record);

    List<DocParam> selectByApiId(Integer id);
}