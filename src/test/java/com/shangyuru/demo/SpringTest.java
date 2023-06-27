package com.shangyuru.demo;

import com.shangyuru.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author syr
 * @Date Created in 2023 06 2023/6/27 17:29
 * @Discription
 * @Package com.shangyuru.demo
 * @ProjectName SSMforITHM
 */
public class SpringTest {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserDao userDao1 = (UserDao) applicationContext.getBean("userdao");
        UserDao userDao2 = (UserDao) applicationContext.getBean("userdao");
        System.out.println(userDao1);
        System.out.println(userDao2);
    }
}
