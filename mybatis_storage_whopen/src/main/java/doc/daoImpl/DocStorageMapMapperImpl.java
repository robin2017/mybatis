package doc.daoImpl;



import doc.dao.DocStorageMapMapper;
import doc.meta.DocStorageMap;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * Created by robin on 16/8/18.
 */
public class DocStorageMapMapperImpl implements DocStorageMapMapper {

    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static{
        try{
            reader    = Resources.getResourceAsReader("configuration.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch(Exception e){
            e.printStackTrace();
        }
    }




    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(DocStorageMap record) {
        if(selectByPrimaryKey(record.getId())!=null)
            return 1;
        SqlSession session = sqlSessionFactory.openSession();
        try{
            DocStorageMapMapper mapper = session.getMapper(DocStorageMapMapper.class);
            mapper.insert(record);
            session.commit();
        }finally {
            session.close();
        }



        return 0;
    }

    public int insertSelective(DocStorageMap record) {
        return 0;
    }

    public DocStorageMap selectByPrimaryKey(Integer id) {
        SqlSession session = sqlSessionFactory.openSession();
        DocStorageMap diffMap=null;
        try{
            DocStorageMapMapper mapper = session.getMapper(DocStorageMapMapper.class);
            diffMap=mapper.selectByPrimaryKey(id);
            session.commit();
        }finally {
            session.close();
        }



        return diffMap;
    }

    public int updateByPrimaryKeySelective(DocStorageMap record) {
        return 0;
    }

    public int updateByPrimaryKey(DocStorageMap record) {
        return 0;
    }
}
