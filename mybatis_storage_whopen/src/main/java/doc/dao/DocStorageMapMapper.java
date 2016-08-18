package doc.dao;

import doc.meta.DocStorageMap;

public interface DocStorageMapMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DocStorageMap record);

    int insertSelective(DocStorageMap record);

    DocStorageMap selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DocStorageMap record);

    int updateByPrimaryKey(DocStorageMap record);
}