package cn.itcast.test;

import cn.itcast.dao.AcountDAO;
import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testMyBatis {
    @Test
    public void run1() throws IOException {
        //加载配置文件
        InputStream inr = Resources.getResourceAsStream("SQLMapConfig.xml");
        //创建SQLSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inr);
        //创建SQLSession
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        AcountDAO acountDAO = sqlSession.getMapper(AcountDAO.class);
        //查询所有数据
        List<Account> all = acountDAO.findAll();
        for (Account account:all){
            System.out.println(account);
        }

        //关闭资源
        inr.close();



    }
    @Test
    public void run2() throws IOException {
        //加载配置文件
        Account account=new Account();
        account.setName("沈删");
        account.setMoney(300d);
        InputStream inr = Resources.getResourceAsStream("SQLMapConfig.xml");
        //创建SQLSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inr);
        //创建SQLSession
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        AcountDAO acountDAO = sqlSession.getMapper(AcountDAO.class);
        acountDAO.saveAccount(account);
        sqlSession.commit();
        //关闭资源
        inr.close();



    }
}
