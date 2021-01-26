import com.lsm.dao.bookinfoDao;
import com.lsm.pojo.bookinfo;
import com.lsm.server.bookinfoserver;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {
    @Test
    public void aa(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        bookinfoserver book= context.getBean("bookinfoimpl",bookinfoserver.class);
        book.query();
    }
    @Test
    public void bb() throws IOException {
        InputStream in = Resources.getResourceAsStream("Mybatis.config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = build.openSession();
        bookinfoDao mapper = sqlSession.getMapper(bookinfoDao.class);
        List<bookinfo> query = mapper.query();
        System.out.println(query);
        sqlSession.close();
    }
    @Test
    public void dd() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        bookinfoserver bookinfoimpl = context.getBean("bookinfoimpl", bookinfoserver.class);
        bookinfoimpl.ins();
    }
    @Test
    public void cc() throws IOException {
        InputStream in = Resources.getResourceAsStream("Mybatis.config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = build.openSession();
        bookinfoDao mapper = sqlSession.getMapper(bookinfoDao.class);
        bookinfo bookinfo=new bookinfo(6,"asd","123");
          mapper.ins(bookinfo);
          sqlSession.commit();
        sqlSession.close();
    }
}
