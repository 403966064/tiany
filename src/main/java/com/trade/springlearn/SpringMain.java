package com.trade.springlearn;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by tiany on 2018/5/23.
 */
public class SpringMain {
    public static void main(String[] args) {
        /**spring 4.x 中不建议使用xmlBeanFactory来创建beanFactory 的方式*/
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));

        BeanFactory bf1= new DefaultListableBeanFactory();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanFactoryTest.xml");

        applicationContext.getBean("test");
    }
}
