package com.powernode.spring.test;

import com.powernode.spring6.bean.Clazz;
import com.powernode.spring6.bean.SimpleTypeValue;
import com.powernode.spring6.bean.Student;
import com.powernode.spring6.dao.User;
import com.powernode.spring6.service.CustomerService;
import com.powernode.spring6.service.OrderService;
import com.powernode.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @Classname springDITest
 * @Description dependencyInjection
 * @Date 2023/12/2 12:00
 * @Created by 成熟男涛儿
 */
public class springDITest {
    public static void main(String[] args){
        System.out.println(new Date());
    }
    @Test
    public void DItest(){
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = xmlApplicationContext.getBean(UserService.class);
        userService.saveUser();


    }


    @Test
    public  void ConstructorDITest(){
        //构造方法注入，但不常用
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService customerService = applicationContext.getBean("csBean",CustomerService.class);
        customerService.save();
    }

    @Test
    public void  SetOutDI(){
        //注入外部bean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("order.xml");
        OrderService orderServiceBean = applicationContext.getBean("orderServiceBean", OrderService.class);
        orderServiceBean.save();


    }

    @Test
    public void  SimpleLEXING(){
        //注入简单类型
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("order.xml");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println(user);
    }

    @Test
    public  void  svtTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("order.xml");
        SimpleTypeValue svt = applicationContext.getBean("svt", SimpleTypeValue.class);
        System.out.println(svt);

    }

    @Test
    public  void stuTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("stu.xml");
        Student stu = applicationContext.getBean("stu", Student.class);
        Clazz cla = applicationContext.getBean("cla", Clazz.class);
        System.out.println(stu);


    }
}


