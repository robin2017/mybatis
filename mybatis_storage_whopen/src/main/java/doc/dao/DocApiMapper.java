package doc.dao;

import doc.meta.DocApi;

public interface DocApiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DocApi record);

    int insertSelective(DocApi record);

    DocApi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DocApi record);

    int updateByPrimaryKey(DocApi record);
}