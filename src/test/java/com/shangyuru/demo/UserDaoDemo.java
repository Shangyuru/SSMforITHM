package com.shangyuru.demo;

import com.shangyuru.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author syr
 * @Date Created in 2023 06 2023/6/27 17:20
 * @Discription
 * @Package com.shangyuru.demo
 * @ProjectName SSMforITHM
 */
public class UserDaoDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userdao");
        userDao.save();
    }
}
