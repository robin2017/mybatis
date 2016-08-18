package doc.daoImpl;

import doc.dao.DocApiMapper;
import doc.dao.DocFunctionMapper;
import doc.meta.DocApi;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * Created by robin on 16/8/18.
 */
public class DocApiMapperImpl implements DocApiMapper {

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

    public int insert(DocApi record) {
        if(selectByPrimaryKey(record.getId())!=null)
            return 1;
        SqlSession session = sqlSessionFactory.openSession();
        try{
            DocApiMapper mapper = session.getMapper(DocApiMapper.class);
            mapper.insert(record);
            session.commit();
        }finally {
            session.close();
        }

        return 0;
    }

    public int insertSelective(DocApi record) {
        return 0;
    }

    public DocApi selectByPrimaryKey(Integer id) {
        SqlSession session = sqlSessionFactory.openSession();
        DocApi api=null;
        try{
            DocApiMapper mapper = session.getMapper(DocApiMapper.class);
            api=mapper.selectByPrimaryKey(id);
            session.commit();
        }finally {
            session.close();
        }

        return api;
    }

    public int updateByPrimaryKeySelective(DocApi record) {
        return 0;
    }

    public int updateByPrimaryKey(DocApi record) {
        return 0;
    }
}
