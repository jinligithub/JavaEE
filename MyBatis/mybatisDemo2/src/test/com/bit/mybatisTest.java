package com.bit;

//import javax.annotation.Resources;

import com.bit.DAO.UserDao;
import com.bit.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class mybatisTest {
    public static void main(String[] args)throws Exception {
        //1.读取配置文件
        InputStream in=Resources.getResourceAsStream("sqlMapConfig.xml");
        //2.创建SQLSession的工厂对象（使用sqlSessionFactoryBuilder，构件者模式)
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory=builder.build(in);

//    3.利用SQLSession工厂对象创建SQLSession对象，（操作底层数据库的执行对象）
        SqlSession sqlSession=sqlSessionFactory.openSession();//执行数据库的对象
//    4.创建UserDao接口对象
        UserDao mapper=sqlSession.getMapper(UserDao.class);//反射
//    5.执行查询
        List<User> list=mapper.findAll();
        for(User u:list){
            System.out.println(u);
        }
//    6.释放资源
        sqlSession.close();
        in.close();
    }
}

