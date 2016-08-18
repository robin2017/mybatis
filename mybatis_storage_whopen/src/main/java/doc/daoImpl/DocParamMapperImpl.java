package doc.daoImpl;


import doc.dao.DocFunctionMapper;
import doc.dao.DocParamMapper;
import doc.meta.DocParam;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * Created by robin on 16/8/18.
 */
public class DocParamMapperImpl implements DocParamMapper {
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

    public int insert(DocParam record) {
        if(selectByPrimaryKey(record.getId())!=null)
            return 1;
        SqlSession session = sqlSessionFactory.openSession();
        try{
            DocParamMapper mapper = session.getMapper(DocParamMapper.class);
            mapper.insert(record);
            session.commit();
        }finally {
            session.close();
        }


        return 0;
    }

    public int insertSelective(DocParam record) {
        return 0;
    }

    public DocParam selectByPrimaryKey(Integer id) {


        SqlSession session = sqlSessionFactory.openSession();
        DocParam param=null;
        try{
            DocParamMapper mapper = session.getMapper(DocParamMapper.class);
            param=mapper.selectByPrimaryKey(id);
            session.commit();
        }finally {
            session.close();
        }
        return param;
    }

    public int updateByPrimaryKeySelective(DocParam record) {
        return 0;
    }

    public int updateByPrimaryKey(DocParam record) {
        return 0;
    }
}
