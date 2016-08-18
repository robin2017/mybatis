package doc.dao;

import doc.meta.DocFunction;

public interface DocFunctionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DocFunction record);

    int insertSelective(DocFunction record);

    DocFunction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DocFunction record);

    int updateByPrimaryKey(DocFunction record);
}