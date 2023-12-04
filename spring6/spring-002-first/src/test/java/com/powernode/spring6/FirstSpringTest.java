package com.powernode.spring6;

import com.powernode.spring6.bean.User;
import com.powernode.spring6.dao.UserDaoImplForMysql;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LoggingEventBuilder;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FirstSpringTest {
    @Test
    public  void init(){
        // 注意不是在调用getBean()方法时创建对象，而是在执行下列代码时就实例化对象
        new ClassPathXmlApplicationContext("spring.xml");

        Logger logger = LoggerFactory.getLogger(FirstSpringTest.class);
        logger.info("this is a message");
        logger.error("this is an error");
        logger.debug("this is a debug message");
    }
    @Test
    public void testBeanFactory() {
        //ApplicationContext接口的超级父接口是：BeanFactory
        //BeanFactory是IoC容器的顶级接口，IoC容器底层实际上使用了工厂模式，IoC底层是如何实现的：XML解析 +工厂模式+反射机制
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        Object user = beanFactory.getBean("userBean");
        System.out.println(user);


    }

    @Test
    // 不是从类路径中加载资源，比较少用到，了解即可
    public void testFilePath() {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("D:\\spring.xml");
        Object user = context.getBean("userBean");
        System.out.println(user);
    }

    @Test
    public void testFirstSpringCode() {
        // 第一步：获取spring容器对象
        //
        //
        //这行代码只要执行就相当于启动了Spring容器，并解析
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml", "vip.xml");

        //第二步：根据bean的ID从spring容器获取这个对象
        Object userBean = applicationContext.getBean("userBean");
        UserDaoImplForMysql userDaoImpl = applicationContext.getBean("userDaoImpl", UserDaoImplForMysql.class);
        userDaoImpl.insert();
        Object vipBean = applicationContext.getBean("vipbean");
        //日期格式化
        //Date nowTime = (Date)applicationContext.getBean("nowTime");
        //不想强制类型转换，可以使用以下代码，使用第二个参数
        Date nowTime1 = applicationContext.getBean("nowTime", Date.class);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss ");
        String stf = simpleDateFormat.format(nowTime1);
        System.out.println(userBean);
        System.out.println(userDaoImpl);
        System.out.println(vipBean);
        System.out.println(stf);

    }

}
