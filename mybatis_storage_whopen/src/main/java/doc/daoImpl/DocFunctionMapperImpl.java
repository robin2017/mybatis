package doc.daoImpl;

import doc.dao.DocFunctionMapper;
import doc.meta.DocFunction;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * Created by robin on 16/8/18.
 */
public class DocFunctionMapperImpl implements DocFunctionMapper {
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

    public int insert(DocFunction record) {
        if(selectByPrimaryKey(record.getId()) != null)
            return 1;
        SqlSession session = sqlSessionFactory.openSession();
        try{
            DocFunctionMapper mapper = session.getMapper(DocFunctionMapper.class);
            mapper.insert(record);
            session.commit();
        }finally {
            session.close();
        }
        return 0;

    }

    public int insertSelective(DocFunction record) {
        return 0;
    }

    public DocFunction selectByPrimaryKey(Integer id) {

        SqlSession session = sqlSessionFactory.openSession();
        DocFunction function = null;
        try{
            DocFunctionMapper mapper = session.getMapper(DocFunctionMapper.class);
            function=mapper.selectByPrimaryKey(id);
            session.commit();
        }finally {
            session.close();
        }
        return function;
    }

    public int updateByPrimaryKeySelective(DocFunction record) {
        return 0;
    }

    public int updateByPrimaryKey(DocFunction record) {
        return 0;
    }
}
